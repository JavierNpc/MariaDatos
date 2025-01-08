package com.example.inyecciondependencias.respositories;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.example.inyecciondependencias.models.Product;


@Primary
@Repository
public class ProductResositoryFoo implements ProductResository {

    @Override
    public List<Product> findAll(){
        return Collections.singletonList(new Product(1L, "Kaito", 600L));
    }

    @Override
    public Product findById(Long id) {
        return new Product(id , "kaito", 600L);
    }

    
}
