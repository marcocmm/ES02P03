/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.memorial.persistence;

import br.com.memorial.model.usuario.Endereco;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mateus
 */
public class MemorialPersistenceTest {

    public MemorialPersistenceTest() {
    }

    public void testSomeMethod() throws FileNotFoundException, IOException {
        Endereco endereco = new Endereco();
        endereco.setLogradouro("asdfgg");

        OutputStream stream = new FileOutputStream(new File("/home/mateus/meuarquivo.laplace"));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(stream);
        objectOutputStream.writeObject(endereco);
        objectOutputStream.close();
        stream.close();
    }

    public void outro() throws FileNotFoundException, IOException, ClassNotFoundException {
        InputStream inputStream = new FileInputStream(new File("/home/mateus/meuarquivo.laplace"));
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Endereco readObject = (Endereco) objectInputStream.readObject();
        System.out.println(readObject.getLogradouro());
    }

}
