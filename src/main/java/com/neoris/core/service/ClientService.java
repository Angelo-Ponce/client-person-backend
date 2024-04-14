package com.neoris.core.service;

import com.neoris.client.entity.ClientEntity;
import com.neoris.client.repository.IClientRepository;
import com.neoris.client.service.IClientService;
import com.neoris.vo.ClientVo;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientService implements IClientService {


    private final ModelMapper mapper;

    private final IClientRepository repository;

    @Transactional
    @Override
    public void saveOrUpdate(ClientVo clientVo) {
        if (clientVo.getPersonId() != null) {
            clientVo.setLastModifiedByUser("Angelo");
            clientVo.setLastModifiedDate(new Date());
        } else {
            clientVo.setCreatedByUser("Angelo");
            clientVo.setCreatedDate(new Date());
        }
        ClientEntity clientEntity = mapper.map(clientVo, ClientEntity.class);
        this.repository.save(clientEntity);
        clientVo.setPersonId(clientEntity.getPersonId());
    }

    @Override
    @Transactional(readOnly = true)
    public ClientVo findById(Long id) {
        ClientVo clientVo = null;
        Optional<ClientEntity> clientEntity = this.repository.findById(id);
        if (clientEntity.isPresent()) {
            clientVo = mapper.map(clientEntity.get(), ClientVo.class);
        }
        return clientVo;
    }

    @Transactional
    @Override
    public void delete(Long id) {
        ClientVo clientVo = this.findById(id);
        if (clientVo != null) {
            clientVo.setStatus(Boolean.FALSE);
            this.saveOrUpdate(clientVo);
        }
    }
}
