/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.memorial.persistence;

import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author mateus
 */
public class SerializePersistence implements Persistence<SerializePersistence>{
    
    private Collection<SerializePersistence> itens;
    public static EntityManager entityManager = javax.persistence.Persistence.createEntityManagerFactory("UP").createEntityManager();
    private Class clazz;
    
    @Override
    public boolean insert(SerializePersistence entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public boolean update(SerializePersistence entity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(entity);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    @Override
    public void delete(SerializePersistence entity) {
        if (entity != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(entity);
            entityManager.getTransaction().commit();
        }
    }

    @Override
    public SerializePersistence obter(SerializePersistence entity) {
        entityManager.clear();
        return (SerializePersistence) entityManager.find(clazz, entity);
    }

    @Override
    public List<SerializePersistence> list() {
        return entityManager.createQuery("SELECT e FROM " + clazz.getSimpleName() + " e").getResultList();
    }
}
