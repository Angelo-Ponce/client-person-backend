package com.neoris.client.service;

import java.io.Serializable;

/**
 * Crud service interface
 *
 * @author Angelo
 */
public interface ICrudService<T> {

    /**
     * Save entity
     * @param t entity
     */
    void save(T t);

    /**
     * find by id
     * @param id id
     * @return entity
     */
    T findById(Serializable id);

    /**
     * update entity
     * @param t entity
     */
    void update(T t);

    /**
     * delete entity
     * @param t entity
     */
    void delete(T t);
}
