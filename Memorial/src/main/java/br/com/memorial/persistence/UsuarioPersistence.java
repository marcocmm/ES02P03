/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.memorial.persistence;

import br.com.memorial.model.usuario.Usuario;

/**
 *
 * @author mateus
 */
public class UsuarioPersistence extends GenericDAO<Usuario> {

    public UsuarioPersistence() {
        super(Usuario.class);
    }

    public Usuario obter(String login) {
        entityManager.clear();
        return (Usuario) entityManager.find(Usuario.class, login);
    }

}
