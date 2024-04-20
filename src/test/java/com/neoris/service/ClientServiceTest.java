package com.neoris.service;

import com.neoris.client.entity.ClientEntity;
import com.neoris.client.repository.IClientRepository;
import com.neoris.core.service.ClientService;
import com.neoris.vo.ClientVo;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ClientServiceTest {

    @Mock
    private IClientRepository repository;

    @Mock
    private ModelMapper mapperMock;

    @InjectMocks
    private ClientService clientService;

    @Test
    public void testFindById() {
        Long id = 2L;
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setPersonId(2L);
        clientEntity.setName("Marianela Montalvo");

        ClientVo clientVo = new ClientVo();
        clientVo.setPersonId(2L);
        clientVo.setName("Marianela Montalvo");

        Mockito.when(repository.findById(id)).thenReturn(Optional.of(clientEntity));
        Mockito.when(mapperMock.map(clientEntity, ClientVo.class)).thenReturn(clientVo);

        ClientVo actual = clientService.findById(id);

        assertEquals(clientVo, actual);
    }
}
