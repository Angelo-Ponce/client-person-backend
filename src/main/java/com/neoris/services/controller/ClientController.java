package com.neoris.services.controller;

import com.neoris.client.service.IClientService;
import com.neoris.vo.BaseResponseVo;
import com.neoris.vo.ClientVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clientes")
@RequiredArgsConstructor
public class ClientController {

    private final IClientService clientService;

    @PostMapping
    public ResponseEntity<BaseResponseVo> addClient(@RequestBody ClientVo clientVo) {
        // TODO: Validar si existe el registro

        this.clientService.save(clientVo);
        return ResponseEntity.ok(BaseResponseVo.builder().data(clientVo).build());
    }
}
