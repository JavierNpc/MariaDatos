package com.example.inyecciondependencias.respositories;

import java.util.Arrays;
import java.util.List;
import com.example.inyecciondependencias.models.Product;

public interface ProductResository {
    List<Product> findAll();
    Product findById(Long id);
    
} 


    

