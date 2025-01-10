package com.example.ejercicio_final.Repository;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Repository;

import com.example.ejercicio_final.Models.ProductoTipo;

@Repository
public class ProductoTipoRepository implements InterfazRepositoryTipo {
    private ArrayList<ProductoTipo> tipos;

    public ProductoTipoRepository(){
      this.tipos = new ArrayList<>(Arrays.asList(
        new ProductoTipo(1L, "Mesa", "Es una mesa para comer"),
        new ProductoTipo(2L, "Silla", "Es una silla para sentarse"),
        new ProductoTipo(3L, "Sofa", "Es una soafa para dormir"),
        new ProductoTipo(4L, "Television", "Es una television para ver")
      ));
    }

    @Override
    public ArrayList<ProductoTipo> findAll() {
        return tipos;
    }

    @Override
    public ProductoTipo findById(Long id) {
        return tipos.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
    
}
