/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.memorial.test.memorial;

import br.com.memorial.model.memorial.FormacaoAcademica;
import br.com.memorial.model.memorial.Memorial;
import br.com.memorial.persistence.MemorialPersistence;
import org.junit.Test;

/**
 *
 * @author mateus
 */
public class MemorialTest {

    Memorial memorial;
    MemorialPersistence mp;

    public void testeMemorialInsere() {
        memorial = new Memorial();
        mp = new MemorialPersistence();
        memorial.setFormacaoAcademica(FormacaoAcademica.DOUTORADO);
//        try {
//            mp.insert(memorial);
//        } catch (SQLException ex) {
//            Logger.getLogger(MemorialTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
