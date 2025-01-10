package com.example.ejercicio_final.Repository;

import java.util.ArrayList;

import com.example.ejercicio_final.Models.Producto;

public interface InterfazRepositorys {

    public ArrayList<Producto> findAll();
    public Producto findById(Long id);

}
