/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtech.tp.services;

import com.dtech.tp.model.DtUserModel;

/**
 *
 * @author h3llmo
 */
public interface DtUserService {

    DtUserModel getUser(final String loginName);
}
