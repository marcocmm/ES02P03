/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.memorial.servlets;

import br.com.memorial.model.memorial.Atividade;
import br.com.memorial.model.memorial.Evento;
import br.com.memorial.model.memorial.TipoEvento;
import br.com.memorial.model.usuario.Usuario;
import br.com.memorial.persistence.EventoPersistence;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
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
@WebServlet(name = "EventoServlet", urlPatterns = {"/EventoServlet"})
public class EventoServlet extends HttpServlet {

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
        String evento = request.getParameter("eventos");
        
        Evento event = new Evento();
        TipoEvento ev = TipoEvento.valueOf(evento);
        event.setTipo(ev);
        
        HttpSession session = request.getSession();
        Object user = session.getAttribute("usuario");
//        List<Atividade> ativ = ((Usuario) user).getMemorial().getAtividades();
//        for (Atividade atividade : ativ) {
//            atividade.
//        }
//            
//        EventoPersistence ep = new EventoPersistence();
//        try {
//            ep.insert(event);
//        } catch (SQLException ex) {
//            Logger.getLogger(EventoServlet.class.getName()).log(Level.SEVERE, null, ex);
//        }
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
