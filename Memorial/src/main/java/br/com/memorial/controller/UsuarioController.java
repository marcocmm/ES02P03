/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.memorial.controller;

import br.com.memorial.persistence.UsuarioPersistence;

/**
 *
 * @author mateus
 */
public class UsuarioController extends Controller {

    public UsuarioController() {
        this.setPersistence(new UsuarioPersistence());
    }

}
