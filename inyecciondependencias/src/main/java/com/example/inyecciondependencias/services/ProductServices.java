package com.example.inyecciondependencias.services;

import java.util.List;
import java.util.stream.Collectors;

import com.example.inyecciondependencias.models.Product;
import com.example.inyecciondependencias.respositories.ProductResositoryImpl;


public interface ProductServices {
    public List<Product> findAll();
    Product findById(Long id);
} 
