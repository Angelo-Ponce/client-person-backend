package com.neoris.client.repository;

import com.neoris.client.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IClientRepository extends JpaRepository<ClientEntity, Long> {

//    @Query("SELECT CASE WHEN COUNT(e) > 0 THEN true ELSE false END FROM ClientEntity e WHERE e.identificacion = :identification")
//    Boolean existsByIdentification(String identification);
}
