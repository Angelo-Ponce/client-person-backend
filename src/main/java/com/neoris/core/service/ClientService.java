package com.neoris.core.service;

import com.neoris.client.entity.ClientEntity;
import com.neoris.client.repository.IClientRepository;
import com.neoris.client.service.IClientService;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Lazy
@Service
public class ClientService extends CrudService<ClientEntity, IClientRepository> implements IClientService {

    public ClientService(IClientRepository repository) {
        super(repository);
    }
}
