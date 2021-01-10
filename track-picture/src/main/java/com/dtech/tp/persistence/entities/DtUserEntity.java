/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtech.tp.persistence.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 *
 * @author h3llmo
 */
@Entity
@Data
@ToString(of = "loginName")
@EqualsAndHashCode(of = "loginName")
public class DtUserEntity implements Serializable {

    @Id
    private String loginName;
}
