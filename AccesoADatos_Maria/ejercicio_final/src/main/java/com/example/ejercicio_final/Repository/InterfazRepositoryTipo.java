package com.example.ejercicio_final.Repository;

import java.util.ArrayList;

import com.example.ejercicio_final.Models.ProductoTipo;

public interface InterfazRepositoryTipo {

    public ArrayList<ProductoTipo> findAll();
    public ProductoTipo findById(Long id);

}
