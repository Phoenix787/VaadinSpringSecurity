package com.sergeeva.VaadinSpringSecurity.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

@Service
public class BackendService {

    @Secured("ROLE_ADMIN")
    public String adminMethod(){
        return "Hello from an Admin Method";
    }

    @Secured({"ROLE_USER", "ROLE_ADMIN"})
    public String userMethod(){
        return "Hello from an User Method";
    }
}
