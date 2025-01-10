package com.example.ejercicio_final.Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.springframework.stereotype.Service;

import com.example.ejercicio_final.Models.Producto;
import com.example.ejercicio_final.Models.ProductoTipo;
import com.example.ejercicio_final.Repository.ProductoRepository;
import com.example.ejercicio_final.Repository.ProductoTipoRepository;

@Service
public class ServicioProducto implements InnerInterfazDeServicios{
    
    private ProductoRepository producto ;
    private ProductoTipoRepository productoTipo;

    public ServicioProducto(ProductoRepository producto ,ProductoTipoRepository productoTipo){
        this.producto = producto;
        this.productoTipo = productoTipo;
    }
  
    @Override
    public ArrayList<Producto> findAll() {
        return producto.findAll();
    }

    @Override
    public Producto findById(Long id) {
        return producto.findById(id);
    }

    @Override
    public ProductoRepository CrearRegistro(Long id, String nombre, Long precio, ProductoTipo tipo) {
        if (id != null && !nombre.isEmpty() && precio != null &&  tipo != null) {
            
            producto.findAll().add(new Producto(id, nombre, precio, tipo));
            Collections.sort(producto.findAll(), Comparator.comparing(Producto::getId));
        }
    
        return producto;
    }

    @Override
    public ProductoRepository ActualizarRegistro(Long id, String nombre, Long precio, ProductoTipo tipo) {
        if (id != null && !nombre.isEmpty() && precio != null &&  tipo != null) {
            Producto modificado = null;
            for (Producto p : producto.findAll()) {
                if(p.getId().equals(id)){
                    modificado = p;
                    break;
                }
                if (modificado != null) {
                    producto.findAll().remove(modificado);
                    producto.findAll().add(new Producto(id, nombre, precio,tipo));
                    Collections.sort(producto.findAll(), Comparator.comparing(Producto::getId));
                }
            }


        }

        return producto;
       
    }

    @Override
    public void EliminarRegistro(Long id) {
        producto.findAll().remove(producto.findById(id));
    }


  
    
}
