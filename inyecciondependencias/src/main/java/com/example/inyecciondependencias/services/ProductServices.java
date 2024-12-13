package com.example.inyecciondependencias.services;

import java.util.List;
import java.util.stream.Collectors;

import com.example.inyecciondependencias.models.Product;
import com.example.inyecciondependencias.respositories.ProductResository;

public class ProductServices {

    private ProductResository resository = new ProductResository();

    public List<Product> findAll(){
        return resository.findAll().stream().map(p -> {
            Double priceImp = p.getPrecio()*1.21d;
            p.setPrecio((priceImp.longValue()));
            return p;
        }).collect(Collectors.toList());
    }


    public Product findById(Long id){
        return resository.findById(id);

    }

    /* 
    public List<Product> findAll2(){
        return resository.findAll().stream().map(p -> {
            Double priceImp = p.getPrecio()*1.21d;
            p.setPrecio((priceImp.longValue()));
            return p;



        }).collect(Collectors.toList());
    } 
    */


    
}
