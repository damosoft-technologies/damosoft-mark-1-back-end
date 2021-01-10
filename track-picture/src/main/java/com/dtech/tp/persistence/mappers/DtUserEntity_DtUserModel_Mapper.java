/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtech.tp.persistence.mappers;

import com.dtech.tp.model.DtUserModel;
import com.dtech.tp.persistence.entities.DtUserEntity;

import org.mapstruct.Mapper;

/**
 *
 * @author h3llmo
 */
@Mapper
public interface DtUserEntity_DtUserModel_Mapper {

    DtUserModel fromEntityToModel(DtUserEntity source);

    DtUserEntity fromModelToEntity(DtUserModel source);
}
