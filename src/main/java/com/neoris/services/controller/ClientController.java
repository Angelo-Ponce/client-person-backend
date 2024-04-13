package com.neoris.services.controller;

import com.neoris.client.service.IClientService;
import com.neoris.vo.BaseResponseVo;
import com.neoris.vo.ClientVo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clientes")
@RequiredArgsConstructor
public class ClientController {

    private final IClientService clientService;

    @PostMapping
    public ResponseEntity<BaseResponseVo> addClient(@RequestBody ClientVo clientVo) {
        this.clientService.saveOrUpdate(clientVo);
        return ResponseEntity.ok(BaseResponseVo.builder().data(clientVo).build());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BaseResponseVo> getClientById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(BaseResponseVo.builder().data(this.clientService.findById(id)).build());
    }

    @PutMapping
    public ResponseEntity<BaseResponseVo> updateClient(@RequestBody ClientVo clientVo) {
        this.clientService.saveOrUpdate(clientVo);
        return ResponseEntity.ok(BaseResponseVo.builder().data(clientVo).build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BaseResponseVo> deleteClient(@PathVariable("id") Long id) {
        this.clientService.delete(id);
        return ResponseEntity.ok(BaseResponseVo.builder().build());
    }
}
