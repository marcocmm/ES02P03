/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.memorial.servlets;

import br.com.memorial.model.memorial.AtividadeDiversa;
import br.com.memorial.model.memorial.Evento;
import br.com.memorial.model.memorial.FormacaoAcademica;
import br.com.memorial.model.memorial.Memorial;
import br.com.memorial.model.memorial.TipoAtividade;
import br.com.memorial.model.memorial.TipoEvento;
import br.com.memorial.persistence.AtividadePersistence;
import br.com.memorial.persistence.EventoPersistence;
import br.com.memorial.persistence.MemorialPersistence;
import br.com.memorial.persistence.UsuarioPersistence;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mateus
 */
@WebServlet(name = "MemorialServlet", urlPatterns = {"/MemorialServlet"})
public class MemorialServlet extends HttpServlet {

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
            String formacao = request.getParameter("formacaoAcademica");
            String atividade = request.getParameter("atividades");
            String evento = request.getParameter("eventos");
            
            Memorial memorial = new Memorial();
            AtividadeDiversa atividadeDiversa = new AtividadeDiversa();
            Evento event = new Evento();
            
            FormacaoAcademica form = FormacaoAcademica.valueOf(formacao);
            memorial.setFormacaoAcademica(form);
            
            TipoAtividade ativ = TipoAtividade.valueOf(atividade);
            atividadeDiversa.setTipo(ativ);
            
            TipoEvento ev = TipoEvento.valueOf(evento);
            event.setTipo(ev);
            
            MemorialPersistence mp = new MemorialPersistence();
            EventoPersistence ep = new EventoPersistence();
            AtividadePersistence ap = new AtividadePersistence();
            
            try {
                mp.insert(memorial);
            } catch (SQLException ex) {
                Logger.getLogger(MemorialServlet.class.getName()).log(Level.SEVERE, null, ex);
            }   
            
            try {
                ep.insert(event);
            } catch (SQLException ex) {
                Logger.getLogger(MemorialServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                ap.insert(atividadeDiversa);
            } catch (SQLException ex) {
                Logger.getLogger(MemorialServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
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
