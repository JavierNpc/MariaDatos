package com.example.ejercicio_final.Repository;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Repository;

import com.example.ejercicio_final.Models.Producto;

@Repository
public class ProductoRepository implements InterfazRepositorys {

    private ArrayList<Producto> productos;
    private ProductoTipoRepository tipo ;

    public ProductoRepository(ProductoTipoRepository tipos) {
        this.tipo = tipos;
        this.productos = new ArrayList<>(Arrays.asList(
        new Producto(1L, "Mesa1", 200L, tipo.findById(1L)),
        new Producto(1L, "Silla1", 200L, tipo.findById(2L)),
        new Producto(1L, "Sofa1", 200L, tipo.findById(3L)),
        new Producto(1L, "Televisor1", 200L, tipo.findById(4L))
        ));

    }

    @Override
    public ArrayList<Producto> findAll() {
        return productos;
    }

    @Override
    public Producto findById(Long id) {
        return productos.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

}
