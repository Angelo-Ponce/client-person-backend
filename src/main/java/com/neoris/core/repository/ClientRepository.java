package com.neoris.core.repository;

import com.neoris.client.entity.ClientEntity;
import com.neoris.client.repository.IClientRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Lazy
@Repository
public class ClientRepository extends JPAQueryDslQueryDslCrudRepository<ClientEntity> implements IClientRepository {

    public ClientRepository() {
        super(ClientEntity.class);
    }
}
