package com.example.inyecciondependencias.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.inyecciondependencias.models.Product;
import com.example.inyecciondependencias.services.ProductServices;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api")
public class Controlador {
    
    private ProductServices service = new ProductServices();

    @GetMapping("/productos")
    public List<Product> list(){
        return service.findAll();
    }
    
    @GetMapping("/productos/{id}")
    public Product show(@PathVariable Long id){
        return service.findById(id);
    }
    
    


}
