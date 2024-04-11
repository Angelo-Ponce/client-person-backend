package com.neoris.core.service;

import com.neoris.client.repository.IQueryDslCrudRepository;
import com.neoris.client.service.ICrudService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Transactional
public class CrudService<T, R extends IQueryDslCrudRepository<T>> implements ICrudService<T> {

    protected final R repository;

    public CrudService(R repository) {
        this.repository = repository;
    }

    @Override
    public void save(T t) {
        this.repository.save(t);
    }

    @Override
    public T findById(Serializable id) {
        return this.repository.findById(id);
    }

    @Override
    public void update(T t) {
        this.repository.update(t);
    }

    @Override
    public void delete(T t) {
        this.repository.delete(t);
    }
}
