package com.neoris.client.repository;


import java.io.Serializable;

public interface IQueryDslCrudRepository<T> {

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
