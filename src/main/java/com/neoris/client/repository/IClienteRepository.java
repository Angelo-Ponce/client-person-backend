package com.neoris.client.repository;

import com.neoris.client.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<ClientEntity, Long> {
}
