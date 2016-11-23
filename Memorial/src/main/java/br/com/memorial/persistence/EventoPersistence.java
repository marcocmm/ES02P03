/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.memorial.persistence;

import br.com.memorial.model.memorial.Evento;

/**
 *
 * @author mateus
 */
public class EventoPersistence extends GenericDAO<Evento>{

    public EventoPersistence() {
        super(Evento.class);
    }
    
}
