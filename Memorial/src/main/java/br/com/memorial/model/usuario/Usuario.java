/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.memorial.model.usuario;

import br.com.memorial.model.memorial.Memorial;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author mateus
 */
@Entity
public class Usuario {
    
    private String nome;
    private Date dataNasc;
    private String sexo;
    @Id
    private String cpf;
    private String rg;
    private Endereco enderecoPessoal;
    private Endereco enderecoProfissional;
    private String login;
    private String senha;
    private Memorial memorial;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getEnderecoPessoal() {
        return enderecoPessoal;
    }

    public void setEnderecoPessoal(Endereco enderecoPessoal) {
        this.enderecoPessoal = enderecoPessoal;
    }

    public Endereco getEnderecoProfissional() {
        return enderecoProfissional;
    }

    public void setEnderecoProfissional(Endereco enderecoProfissional) {
        this.enderecoProfissional = enderecoProfissional;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Memorial getMemorial() {
        return memorial;
    }

    public void setMemorial(Memorial memorial) {
        this.memorial = memorial;
    }
    
    
}
