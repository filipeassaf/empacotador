package com.l2.empacotador.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {

    @GetMapping("/")
    public String ping() {
        return "API do Empacotador está no ar 🚀";
    }
}
