package com.tienda_k.controller;

import com.tienda_k.dao.ClienteDao;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ClienteController {
    
    @Autowired
    private ClienteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model) {
    
        var clientes = clienteDao.findAll();
        model.addAllAttribute("clientes", clientes);
        
        //var variable="Saludos desde el Back End";
        model.addAttribute("variable", variable);
        
        return "index";
    }
}
