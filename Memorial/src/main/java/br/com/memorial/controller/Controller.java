/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.memorial.controller;

import br.com.memorial.persistence.GenericDAO;


/**
 *
 * @author mateus
 */
public class Controller {
    private GenericDAO persistence;

    public GenericDAO getPersistence() {
        return persistence;
    }

    public void setPersistence(GenericDAO persistence) {
        this.persistence = persistence;
    }
}
