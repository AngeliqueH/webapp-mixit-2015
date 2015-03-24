package com.angeliquehenry.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Permet de vérifier le bon fonctionnement des services.
 * @author Angélique Henry
 */
@RestController
public class PingController {
    
    /**
     * Teste que le tomcat est bien démarré, répond OK si tout va bien.
     * @return 
     */
    @RequestMapping(value = "/api/ping")
    @ResponseBody
    String ping() {
        return "OK";
    }

}
