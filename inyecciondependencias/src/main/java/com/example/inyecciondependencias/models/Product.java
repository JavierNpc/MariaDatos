package com.example.inyecciondependencias.models;

public class Product {

    private Long id;
    private Long precio;
    private String name;


    //Contructores *************************************************
        public Product() {
        }

        public Product(Long id, String name, Long precio) {
            this.id = id;
            this.precio = precio;
            this.name = name;
        }
    //**************************************************************


    // Getters y Setters *******************************************

        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public Long getPrecio() {
            return precio;
        }
        public void setPrecio(Long precio) {
            this.precio = precio;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

    //**************************************************************

    


}
