package com.jorgeibarra.crudPersonas.controler;

import com.jorgeibarra.crudPersonas.interfaceService.IpersonaService;
import com.jorgeibarra.crudPersonas.modelo.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Jorge Ibarra
 */
@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private IpersonaService service;
    
    @GetMapping("/listar")
    public String listar(Model model) {
        List<Persona> personas = service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }
    
    
    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("persona", new Persona());
        return "form";
    }
    
    @PostMapping("/save")
    public String save(@Validated Persona p,Model model){
        service.save(p);
        return "redirect:/listar";
    }
}
