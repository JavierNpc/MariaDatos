package com.example.ejercicio_final.Models;

public class Producto {
    private Long id;
    private String nombre;
    private Long precio;
    private Long precio_con_imp;
    private Long producto_Tipo_id;
    private String precio_Tipo_Nombre;
    private ProductoTipo tipo ;


    //. Constructor
    
     public Producto(Long id, String nombre, Long precio, ProductoTipo tipo) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.precio_con_imp = precio + (precio*21/100);
        this.tipo = tipo;
        this.producto_Tipo_id = tipo.getId();
        this.precio_Tipo_Nombre = tipo.getNombre();
    }


    //. Getters y Setters

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Long getPrecio() {
        return precio;
    }
    public void setPrecio(Long precio) {
        this.precio = precio;
    }
    public Long getPrecio_con_imp() {
        return precio_con_imp;
    }
    public void setPrecio_con_imp(Long precio_con_imp) {
        this.precio_con_imp = precio_con_imp;
    }
    public Long getProducto_Tipo_id() {
        return producto_Tipo_id;
    }
    public void setProducto_Tipo_id(Long producto_Tipo_id) {
        this.producto_Tipo_id = producto_Tipo_id;
    }
    public String getPrecio_Tipo_Nombre() {
        return precio_Tipo_Nombre;
    }
    public void setPrecio_Tipo_Nombre(String precio_Tipo_Nombre) {
        this.precio_Tipo_Nombre = precio_Tipo_Nombre;
    }
    public ProductoTipo getTipo() {
        return tipo;
    }
    public void setTipo(ProductoTipo tipo) {
        this.tipo = tipo;
    }
    
    
    
}
