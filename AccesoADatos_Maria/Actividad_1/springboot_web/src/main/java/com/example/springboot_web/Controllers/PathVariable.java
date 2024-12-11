package com.example.springboot_web.Controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


public class PathVariable {
    private String tipo;
    private Object direccion;
    private Object estado;
    private Object listadoMap;
    private Object factura;



    @Value("${cofig.listadoAsignaturas}")
    private List<String> listadoAsignatura;

    @Value("#{'${cofig.listadoAsignaturas}'.toUpperCase()}")
    private String stringAsignatura;

    @Value("#{'${cofig.listadoAsignaturas}'.toUpperCase().split(',')}")
    private Object listaAsignatura;

    @Autowired
    private Environment envi;

    @GetMapping("/valores")
    public Map<String,Object> valores(){
        Map<String,Object> json = new HashMap<>();
        json.put("tipo", tipo);
        json.put("direccion", direccion);
        json.put("estado", estado);
        json.put("listadoAsignatura", listadoAsignatura);
        json.put("listaAsignatura", listaAsignatura);
        json.put("stringAsignatura", stringAsignatura);
        json.put("listadoMap", listadoMap);
        json.put("factua", factura);

        json.put("estado2", envi.getProperty("config.estado"));
        json.put("experiencia",  envi.getProperty("config.experiencia"));
        json.put("experienciaInt",  Integer.valueOf(envi.getProperty("config.experiencia")));
        json.put("experienciaInt2",  (envi.getProperty("config.experiencia",Integer.class)));
                
        return json;

    }

    
}
