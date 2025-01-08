package com.example.inyecciondependencias.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.inyecciondependencias.models.Product;
import com.example.inyecciondependencias.respositories.ProductResositoryImpl;


public class ProductServicesImpl implements ProductServices{

    private ProductResositoryImpl resository = new ProductResositoryImpl();

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

    @Autowired
    public void setRepository( ProductResositoryImpl resository){
        this.resository = resository;
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
