/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.memorial.servlets;

import br.com.memorial.model.memorial.Orientacao;
import br.com.memorial.model.memorial.TipoOrientacao;
import br.com.memorial.model.usuario.Usuario;
import br.com.memorial.persistence.OrientacaoPersistence;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mateus
 */
@WebServlet(name = "OrientacaoServlet", urlPatterns = {"/OrientacaoServlet"})
public class OrientacaoServlet extends HttpServlet {

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
            String orientacao = request.getParameter("orientacao");
            String orientador = request.getParameter("orientador");
            String orientando = request.getParameter("orientando");
            
            Orientacao orient = new Orientacao();
            
            TipoOrientacao or = TipoOrientacao.valueOf(orientacao);
            orient.setTipo(or);
            orient.setOrientador(orientador);
            orient.setOrientando(orientando);
            
            HttpSession session = request.getSession();
            Object user = session.getAttribute("usuario");

            ((Usuario) user).getMemorial().addAtividade(orient);
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
