/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vicente.model;

/**
 *
 * @author vicen
 */
public class Contacto {
    //Atributos del modelo
    private String nombre;
    private String apellido;
    private String email;
    private String descripcion;
    // contructor vacio
    public Contacto(){
    }
    public Contacto(String name){
        this.nombre = name;
    }
    //getters y setters obtener el valor
 
    //obtener 
    public void setNombre(String name){
        this.nombre= name;
    }
    // mostrar valor 
       public String getNombre(){
        return nombre;
    }
}
