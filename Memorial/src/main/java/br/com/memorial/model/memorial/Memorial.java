/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.memorial.model.memorial;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

/**
 *
 * @author mateus
 */
@Entity
public class Memorial implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAtividade;
    private FormacaoAcademica formacaoAcademica;
    @ElementCollection
    @CollectionTable
    private List<Atividade> atividades;
    
    public FormacaoAcademica getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(FormacaoAcademica formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }

    public Long getIdAtividade() {
        return idAtividade;
    }

    public void setIdAtividade(Long idAtividade) {
        this.idAtividade = idAtividade;
    }

}
