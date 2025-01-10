package com.example.ejercicio_final.Services;

import java.util.ArrayList;

import com.example.ejercicio_final.Models.Producto;
import com.example.ejercicio_final.Models.ProductoTipo;
import com.example.ejercicio_final.Repository.ProductoRepository;

public interface InnerInterfazDeServicios {

    public ArrayList<Producto> findAll();
    public Producto findById(Long id);
    public ProductoRepository CrearRegistro(Long id, String nombre, Long precio, ProductoTipo tipo);
    public ProductoRepository ActualizarRegistro(Long id, String nombre, Long precio, ProductoTipo tipo);
    public void EliminarRegistro(Long id);
    
}