package com.mycompany.usoarchivos.Hilos;

/**
 *
 * @author saien
 */
public class CajeroHilos extends Thread{
    
    private int[] productos;
    private String nombre;
    
    public CajeroHilos(int productos[], String nombre){
        this.nombre = nombre;
        this.productos = productos;
    }
    
    @Override
    public void run(){
        procesarProducto();
        System.out.println( nombre + " ha terminado");
        
    }
    
    private void procesarProducto(){
        
        try {
        for (int i = 0; i < productos.length; i++) {
            int producto = productos[i];
            System.out.println(nombre + " procesando producto en posicion " + i);
            Thread.sleep(producto * 1000);
            System.out.println(nombre + " procesando producto en posicion " + i);
            
        }
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
