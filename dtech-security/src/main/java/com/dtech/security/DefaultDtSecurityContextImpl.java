/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtech.security;

import com.dtech.security.model.DtUser;

public class DefaultDtSecurityContextImpl implements DtSecurityContext {

    @Override
    public DtUser getPrincipal() {
        return DtUser.builder()
                .loginName("h3llmo")
                .build();
    }

}
