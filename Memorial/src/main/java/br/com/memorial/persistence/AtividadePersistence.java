/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.memorial.persistence;

import br.com.memorial.model.memorial.AtividadeDiversa;

/**
 *
 * @author mateus
 */
public class AtividadePersistence extends GenericDAO<AtividadeDiversa>{
    
    public AtividadePersistence() {
        super(AtividadeDiversa.class);
    }
    
}
