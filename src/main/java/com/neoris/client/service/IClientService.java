package com.neoris.client.service;

import com.neoris.vo.ClientVo;

public interface IClientService {

    /**
     * Save or update client.
     *
     * @param clientVo client Object
     */
    void saveOrUpdate(ClientVo clientVo);

    /**
     * Find client by id.
     *
     * @param id Client id
     * @return ClientVo client
     */
    ClientVo findById(Long id);

    /**
     * Delete client by Id.
     *
     * @param id A person id
     */
    void delete(Long id);
}
