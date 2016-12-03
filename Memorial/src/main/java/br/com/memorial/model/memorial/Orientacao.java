/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.memorial.model.memorial;

/**
 *
 * @author mateus
 */
public class Orientacao extends Atividade {

    private String orientador;
    private String orientando;
    private TipoOrientacao tipo;

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public String getOrientando() {
        return orientando;
    }

    public void setOrientando(String orientando) {
        this.orientando = orientando;
    }

    public TipoOrientacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoOrientacao tipo) {
        this.tipo = tipo;
    }

}
