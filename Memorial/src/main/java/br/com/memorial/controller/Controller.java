/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.memorial.controller;

import br.com.memorial.persistence.Persistence;

/**
 *
 * @author mateus
 */
public class Controller {
    private Persistence persistence;

    public Persistence getPersistence() {
        return persistence;
    }

    public void setPersistence(Persistence persistence) {
        this.persistence = persistence;
    }
}
