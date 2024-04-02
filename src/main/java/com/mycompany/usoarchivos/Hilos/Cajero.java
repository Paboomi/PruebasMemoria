package com.mycompany.usoarchivos.Hilos;

/**
 *
 * @author saien
 */
public class Cajero {
    
    private int[] productos;
    private String nombre;
    public Cajero(int[] productos, String nombre){
        this.productos = productos;
        this.nombre = nombre;
    }
    
    public void procesarProductos(){
        
        try {
        for (int i = 0; i < productos.length; i++) {
            int producto = productos[i];
            System.out.println(nombre + " esta procesando producto en posicion: " + i);
            Thread.sleep(producto * 1000);
            System.out.println(nombre + " esta procesando producto en posicion: " + i);
        }
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
