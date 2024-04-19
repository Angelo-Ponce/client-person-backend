package com.neoris.services.controller;

import com.neoris.client.service.IClientService;
import com.neoris.vo.BaseResponseVo;
import com.neoris.vo.ClientVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clientes")
@RequiredArgsConstructor
public class ClientController {

    private final IClientService clientService;

    @Operation(summary = "Save client")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = {@Content(mediaType = "application/json",
                schema = @Schema(implementation = BaseResponseVo.class))}),
            @ApiResponse(responseCode = "400", description = "Not found", content = {@Content(mediaType = "application/json",
                    schema = @Schema(implementation = BaseResponseVo.class))}),
            @ApiResponse(responseCode = "500", description = "Internal error", content = {@Content(mediaType = "application/json",
                    schema = @Schema(implementation = BaseResponseVo.class))}),
    })
    @PostMapping
    public ResponseEntity<BaseResponseVo> addClient(@Valid @RequestBody ClientVo clientVo) {
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
