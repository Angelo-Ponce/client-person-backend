package com.neoris.core.service;

import com.neoris.client.entity.ClientEntity;
import com.neoris.client.repository.IClienteRepository;
import com.neoris.client.service.IClientService;
import com.neoris.vo.ClientVo;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@AllArgsConstructor
public class ClientService implements IClientService {


    private final ModelMapper mapper;

    private final IClienteRepository repository;

    @Override
    @Transactional
    public void save(ClientVo clientVo) {
        System.out.println("servicio cliente");
        ClientEntity clientEntity = mapper.map(clientVo, ClientEntity.class);
        clientEntity.setCreatedByUser("Angelo");
        clientEntity.setCreatedDate(new Date());
        this.repository.save(clientEntity);
        clientVo.setId(clientEntity.getId());
    }

    @Override
    @Transactional(readOnly = true)
    public ClientVo findById(Long id) {
        return null;
    }

    @Transactional
    @Override
    public ClientVo update(ClientVo clientVo) {
        return null;
    }

    @Transactional
    @Override
    public void delete(Long clientId) {
    }
}
