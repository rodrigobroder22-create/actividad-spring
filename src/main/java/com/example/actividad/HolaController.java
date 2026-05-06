package com.example.actividad;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HolaController {

    @GetMapping("/")
    public String saludo() {
        return "Hola, mi aplicación ya está en Internet";
    }
}

