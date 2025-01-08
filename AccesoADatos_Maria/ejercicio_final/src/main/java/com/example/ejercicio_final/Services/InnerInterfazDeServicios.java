package com.example.ejercicio_final.Services;

import java.util.ArrayList;

public interface InnerInterfazDeServicios {

    public String findAll(Object b);
    public Object findById(ArrayList<Object> lista, Long id);
    public void CrearRegistro();
    public Object ActualizarRegistro(Object o);
    public void EliminarRegistro(ArrayList<Object> lista, Long id);
    
}