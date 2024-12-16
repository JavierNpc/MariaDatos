package com.example.inyecciondependencias.services;

import java.util.List;


import com.example.inyecciondependencias.models.Product;



public interface ProductServices {
    public List<Product> findAll();
    Product findById(Long id);
} 
