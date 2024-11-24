/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.taller5.EJ1;

/**
 * nombre precio y stock
 * @author JESUS DAVID
 */
 class Producto {
    
    String nombre;
    double precio;
    String stock;
    
    
    Producto (String nombre, double precio, String stock){
        
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
                
        
        
    }
    
    void mostrarInfo(){
        
        System.out.println("Nombre:" + nombre + "Precio:" + precio + "Stock" + stock);
        
    }
            
    public class Main{
        
        public static void main(String[] args) {
            Producto producto = new Producto ("chocokrispy",22000,"Sip" );
         
            
            producto.mostrarInfo();
        }
    }
    
}
