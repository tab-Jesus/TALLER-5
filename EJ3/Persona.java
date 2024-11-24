/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.taller5.EJ3;

/**
 *
 * @author JESUS DAVID
 */
public class Persona {
    private String nombre;
    private int edad;
    

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        
        setEdad(edad);
        
        
    }

    public String getNombre() {
        
        return nombre;
   }

    public int getEdad() {
        
        return edad;
   }

  

    public void setNombre(String nombre) {
        
        this.nombre = nombre;
  }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        
 }
 }

    public class Main {
  
        public static void main(String[] args) {
            
        Persona persona = new Persona ("JESUS", 18);
        
            System.out.println("Nombre del fiel:" + persona.getNombre() );
            
        }
        
    }
            
    
    
    
    }


  