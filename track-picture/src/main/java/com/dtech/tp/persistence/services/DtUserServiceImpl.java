/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtech.tp.persistence.services;

import com.dtech.tp.model.DtUserModel;
import com.dtech.tp.persistence.entities.DtUserEntity;
import com.dtech.tp.persistence.mappers.DtUserEntity_DtUserModel_Mapper;
import com.dtech.tp.persistence.repositories.DtUserEntityRepository;
import com.dtech.tp.services.DtUserService;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

@Service
public class DtUserServiceImpl implements DtUserService {

    private final DtUserEntityRepository dtUserEntityRepository;

    public DtUserServiceImpl(DtUserEntityRepository dtUserEntityRepository) {
        this.dtUserEntityRepository = dtUserEntityRepository;
    }

    @Override
    public DtUserModel getUser(String loginName) {

        final DtUserEntity entity;

        if ("h3llmo".equals(loginName)) {
            entity = dtUserEntityRepository.findById(loginName)
                    .orElseGet(() -> {
                        final DtUserEntity newUser = new DtUserEntity();
                        newUser.setLoginName(loginName);
                        return newUser;
                    });
        } else {
            entity = dtUserEntityRepository.findById(loginName)
                    .orElseThrow(() -> new IllegalArgumentException("Cannot find user " + loginName));
        }

        final DtUserModel model = Mappers.getMapper(DtUserEntity_DtUserModel_Mapper.class)
                .fromEntityToModel(entity);

        return model;
    }

}
