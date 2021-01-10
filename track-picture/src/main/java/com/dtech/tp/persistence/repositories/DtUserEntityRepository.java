/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtech.tp.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dtech.tp.persistence.entities.DtUserEntity;

/**
 *
 * @author h3llmo
 */
public interface DtUserEntityRepository extends JpaRepository<DtUserEntity, String> {

}
