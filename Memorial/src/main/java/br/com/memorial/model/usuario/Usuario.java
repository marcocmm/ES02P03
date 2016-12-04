/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.memorial.model.usuario;

import br.com.memorial.model.memorial.Memorial;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author mateus
 */
@Entity
public class Usuario implements Serializable {

    private String nome;
    @Temporal(TemporalType.DATE)
    private Date dataNasc;
    private String sexo;
    private String cpf;
    private String rg;
    private Endereco enderecoPessoal;
    private Endereco enderecoProfissional;
    @Id
    private String login;
    private String senha;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Memorial memorial;

    public Usuario(){
        this.memorial = new Memorial();
    }
    

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

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Usuario)) {
            return false;
        }
        Usuario usuario = (Usuario) obj;
        if (!this.cpf.equals(usuario.login)) {
            return false;
        }
        return true;
    }

}
