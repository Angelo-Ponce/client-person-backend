package com.neoris.core.repository;

import com.neoris.client.repository.IQueryDslCrudRepository;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.io.Serializable;
import java.util.Objects;

public abstract class JPAQueryDslQueryDslCrudRepository<T> extends QuerydslRepositorySupport implements IQueryDslCrudRepository<T> {

    private final Class<T> domainClass;

    public JPAQueryDslQueryDslCrudRepository(Class<T> domainClass) {
        super(domainClass);
        this.domainClass = domainClass;
    }

    @Override
    public void save(T t) {
        getEntityManager().persist(t);
    }
    //public void save(T obj) { getEntityManager().persist(obj); }


    @Override
    public void delete(T t) {
        getEntityManager().remove(t);
    }

    @Override
    public void update(T t) {
        getEntityManager().merge(t);
    }
    //public void update(T obj) { getEntityManager().merge(obj);}


    @Override
    public T findById(Serializable id) {
        return getEntityManager().find(domainClass, id);
    }
}
