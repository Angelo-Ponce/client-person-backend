package com.neoris.client.service;

import com.neoris.vo.ClientVo;

public interface IClientService {

    /**
     * Save Client
     * @param clientVo client Object
     */
    void save(ClientVo clientVo);

    /**
     * Find client by id.
     *
     * @param id Client id
     * @return ClientVo client
     */
    ClientVo findById(Long id);

    /**
     * Update Person.
     *
     * @param clientVo client Object
     * @return ClientVo updated in DB
     */
    ClientVo update(ClientVo clientVo);

    /**
     * Delete client by Id.
     *
     * @param clientId A client id
     */
    void delete(Long clientId);
}
