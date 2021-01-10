/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtech.tp.rest;

import com.dtech.security.DtSecurityContext;
import com.dtech.tp.model.DtUserModel;
import com.dtech.tp.services.DtUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author h3llmo
 */
@RestController
public class DtUserController {

    private final DtSecurityContext dtSecurityContext;

    private final DtUserService dtUserService;

    public DtUserController(DtSecurityContext dtSecurityContext, DtUserService dtUserService) {
        this.dtSecurityContext = dtSecurityContext;
        this.dtUserService = dtUserService;
    }

    @GetMapping(value = "users/me")
    public ResponseEntity<DtUserModel> me() {
        return ResponseEntity
                .ok(dtUserService.getUser(
                        dtSecurityContext.getPrincipal().getLoginName())
                );
    }
}
