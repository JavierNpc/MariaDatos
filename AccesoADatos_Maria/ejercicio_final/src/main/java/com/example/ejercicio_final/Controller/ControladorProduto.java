package com.example.ejercicio_final.Controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ejercicio_final.Models.Producto;
import com.example.ejercicio_final.Models.ProductoTipo;
import com.example.ejercicio_final.Repository.ProductoRepository;
import com.example.ejercicio_final.Repository.ProductoTipoRepository;
import com.example.ejercicio_final.Services.ServicioProducto;


@Controller
public class ControladorProduto {
    ProductoTipoRepository pTipoRepo = new ProductoTipoRepository();
    ProductoRepository pRepo = new ProductoRepository(pTipoRepo);
    ServicioProducto servicio = new ServicioProducto(pRepo);
    ArrayList<Producto> listaProductos = pRepo.findAll();
    ArrayList<ProductoTipo> categorias = pTipoRepo.findAll();
    
    @GetMapping("/productos")
    public String productos(Model model) {
        
        model.addAttribute("productos",listaProductos);

        return "Productos";
    }

    @GetMapping("/productos/tipo")
    public String productosTipo(Model model) {
        
        model.addAttribute("tipo",categorias);

        return "ProductosTipo";
    }


    @GetMapping("/productos/newProducto")
    public String getMethodName(Model model) {
        model.addAttribute("tipos", categorias);
        return "CrearRegistro";
    }
    
    @PostMapping("/productos/newProducto")
    public String productosNuevo(
        Model model,
        @RequestParam(value = "id", required = false) Long id,
        @RequestParam(value = "nombre", required = false) String nombre,
        @RequestParam(value = "precio", required = false) Long precio,
        @RequestParam(value = "tipo", required = false)  Long tipo
        ) {
        
        listaProductos = servicio.CrearRegistro(id, nombre, precio, pTipoRepo.findById(tipo)).findAll();
        
        System.out.println(id+" "+nombre+" "+precio+" "+pTipoRepo.findById(tipo));
        model.addAttribute("productos",listaProductos);

        return "Productos";
    }

    
}
