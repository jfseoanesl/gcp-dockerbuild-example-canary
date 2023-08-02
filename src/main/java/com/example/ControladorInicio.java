package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String getMsgBienvenida(){
        log.info("Ejecutando el controlador rest");
        log.debug("Mas detalle");
        return "Hola Mundo Con Spring - version de implementacion canary";
    }
    
    
}
