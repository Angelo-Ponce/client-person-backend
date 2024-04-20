package com.neoris.controller;

import com.neoris.client.service.IClientService;
import com.neoris.services.controller.ClientController;
import com.neoris.vo.BaseResponseVo;
import com.neoris.vo.ClientVo;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ClientControllerTest {

    @Mock
    private IClientService clientServiceMock;

    @InjectMocks
    private ClientController clientController;

    @Test
    public void getClientById() throws Exception {
        Long id = 2L;

        ClientVo clientVo = new ClientVo();
        clientVo.setPersonId(id);
        clientVo.setName("Marianela Montalvo");

        when(clientServiceMock.findById(id)).thenReturn(clientVo);

        ResponseEntity<BaseResponseVo> responseEntity = clientController.getClientById(id);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(clientVo, responseEntity.getBody().getData());
    }
}
