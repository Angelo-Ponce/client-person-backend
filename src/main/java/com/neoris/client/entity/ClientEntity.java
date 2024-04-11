package com.neoris.client.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
//@Entity(name="client")
@Data
public class ClientEntity extends PersonEntity {
    /**
     * Cliente debe manejar una entidad, que herede de la clase persona.
     * Un cliente tiene:  clienteid, contraseña, estado.
     * El cliente debe tener una clave única. (PK)
     */

    @Column(nullable = false, unique=true)
    private String clientId;

    @Column(nullable = false, length = 25)
    private String password;

    @Column(nullable = false, length = 1)
    private Boolean status;
}
