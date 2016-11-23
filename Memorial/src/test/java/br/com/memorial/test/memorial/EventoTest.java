/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.memorial.test.memorial;

import br.com.memorial.model.memorial.Evento;
import br.com.memorial.model.memorial.TipoEvento;
import br.com.memorial.persistence.EventoPersistence;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;

/**
 *
 * @author mateus
 */
public class EventoTest {

    Evento ev;
    EventoPersistence ep;

    @Test
    public void testeInsereEvento() {
        ep = new EventoPersistence();
        ev = new Evento();
        ev.setNomeEvento("Ggggg");
        ev.setTipo(TipoEvento.APRESENTANDO_TRABALHO);
        try {
            ep.insert(ev);
        } catch (SQLException ex) {
            Logger.getLogger(EventoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
