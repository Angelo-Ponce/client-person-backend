package com.neoris.client.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "client")
public class ClientEntity extends PersonEntity {

    @Column(nullable = false, unique=true)
    private String clientId;

    @Column(nullable = false, length = 25)
    private String password;

    @Column(nullable = false, length = 1)
    private Boolean status;
}
