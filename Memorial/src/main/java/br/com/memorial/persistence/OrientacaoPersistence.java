/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.memorial.persistence;

import br.com.memorial.model.memorial.Orientacao;

/**
 *
 * @author mateus
 */
public class OrientacaoPersistence extends GenericDAO<Orientacao>{
    
    public OrientacaoPersistence() {
        super(Orientacao.class);
    }
    
}
