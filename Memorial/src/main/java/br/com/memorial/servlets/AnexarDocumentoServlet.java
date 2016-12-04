/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.memorial.servlets;

import br.com.memorial.model.memorial.Anexo;
import br.com.memorial.persistence.AnexoPersistence;
import br.com.memorial.persistence.UsuarioPersistence;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author mateus
 */
@WebServlet(name = "AnexarDocumentoServlet", urlPatterns = {"/AnexarDocumentoServlet"})
public class AnexarDocumentoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            boolean isMultipart = ServletFileUpload.isMultipartContent(request);
            if(isMultipart){
                String itemForm = "";
                FileItemFactory factory = new DiskFileItemFactory();
                ServletFileUpload upload = new ServletFileUpload(factory);
                try {
                    List<FileItem> items = upload.parseRequest(request);
                int i = 0;
                for(FileItem item : items){
                    i++;
                    if(item.isFormField()){
                    itemForm = item.getString();
                } else{
                    String caminho = getServletContext().getRealPath("");
                    String n = item.getName();
                    String nome = n.replace(" ","_");
                    File uploadedFile = new File(caminho + "/" + nome);
                    String caminho2 = uploadedFile.getAbsolutePath();
                    nome = request.getParameter("nomeArquivo");
                    Anexo anexo = new Anexo();
                    anexo.setNome(nome);
                    anexo.setCaminho(caminho2);

                        AnexoPersistence ap = new AnexoPersistence();
                    if(!new File(caminho2).exists()){
                        try {
                            item.write(uploadedFile);
                            ap.insert(anexo);
                        } catch (Exception ex) {
                            Logger.getLogger(AnexarDocumentoServlet.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    } else{
                        request.setAttribute("mensagem2", "O arquivo com o nome de: " + item.getName() + "ja existe!");
                        RequestDispatcher dis = request.getRequestDispatcher("anexarDocumento.jsp");
                        dis.forward(request, response);
                    }
                }
                }
                } catch (FileUploadException ex) {
                    request.setAttribute("mensagem2", "Ocorreu um erro!");
                        RequestDispatcher dis = request.getRequestDispatcher("anexarDocumento.jsp");
                        dis.forward(request, response);
                    Logger.getLogger(AnexarDocumentoServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                request.setAttribute("mensagem", "Upload do arquivo realizado com sucesso!");
                RequestDispatcher dis = request.getRequestDispatcher("anexarDocumento.jsp");
                        dis.forward(request, response);
            }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
