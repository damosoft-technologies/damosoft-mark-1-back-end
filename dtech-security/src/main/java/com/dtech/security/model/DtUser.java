/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtech.security.model;

import lombok.Builder;
import lombok.Data;

/**
 *
 * @author h3llmo
 */
@Data
@Builder
public class DtUser {

    private String loginName;
}
