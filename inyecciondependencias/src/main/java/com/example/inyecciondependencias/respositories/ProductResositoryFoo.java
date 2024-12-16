package com.example.inyecciondependencias.respositories;

import java.util.Arrays;
import java.util.List;
import com.example.inyecciondependencias.models.Product;

public class ProductResositoryFoo {

    private List<Product> data;


    //Contructor *********************************************************
    public ProductResositoryFoo() {
        this.data = Arrays.asList(
            new Product(1L,"Mesa circular Razor", 200L),
            new Product(2L,"Kaito", 20L),
            new Product(3L,"Goku_F", 600L),
            new Product(4L,"Laser_M", 40L)
        
        );
    }
    // *******************************************************************

    // Funciones *********************************************************

    public List<Product> findAll(){
       return data;
    }

    public Product findById(Long id){
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    // *******************************************************************


   


    
}
