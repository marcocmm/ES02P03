/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.memorial.persistence;

import java.util.List;

/**
 *
 * @author mateus
 */
public interface Persistence<T> {
    
    public boolean insert(T entity);

    public boolean update(T entity);

    public void delete(T entity);
    
    public T obter(T entity);

    public List<T> list();
}
