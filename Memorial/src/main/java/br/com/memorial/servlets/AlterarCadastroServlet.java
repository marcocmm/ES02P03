/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.memorial.servlets;

import br.com.memorial.model.usuario.Endereco;
import br.com.memorial.model.usuario.Usuario;
import br.com.memorial.persistence.UsuarioPersistence;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "AlterarCadastroServlet", urlPatterns = {"/AlterarCadastroServlet"})
public class AlterarCadastroServlet extends HttpServlet {

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
        String nome = request.getParameter("nome");
        String dataNasc = request.getParameter("dataNascimento");
        String sexo = request.getParameter("gender");
        String cpf = request.getParameter("cpf");
        String rg = request.getParameter("rg");
        String nroP = request.getParameter("nroPessoal");
        String ufP = request.getParameter("ufPessoal");
        String logP = request.getParameter("logPessoal");
        String nroPr = request.getParameter("nroProfissional");
        String ufPr = request.getParameter("ufProfissional");
        String logPr = request.getParameter("logProfissional");
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        
        Usuario user = new Usuario();
        Endereco end = new Endereco();
        end.setLogradouro(logP);
        end.setNumero(nroP);
        end.setUnidadeFederativa(ufP);

        Endereco end2 = new Endereco();
        end2.setLogradouro(logPr);
        end2.setNumero(nroPr);
        end2.setUnidadeFederativa(ufPr);

        SimpleDateFormat date = new SimpleDateFormat("yyyy-dd-MM");
        try {
            Date parse = date.parse(dataNasc);
            user.setDataNasc(parse);
        } catch (ParseException ex) {
            Logger.getLogger(UsuarioServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        user.setNome(nome);
        user.setSexo(sexo);
        user.setCpf(cpf);
        user.setRg(rg);
        user.setEnderecoPessoal(end);
        user.setEnderecoProfissional(end2);
        user.setLogin(login);
        user.setSenha(senha);
        
        UsuarioPersistence up = new UsuarioPersistence();
        up.update(user);
        
        HttpSession session = request.getSession();
        session.setAttribute("usuario", user);
        
        response.sendRedirect("memorial.jsp");

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
