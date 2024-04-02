package com.mycompany.usoarchivos.Hilos;

/**
 *
 * @author saien
 */
public class Main {

    public static void main(String[] args) {
//        int[] productosCajero = new int[] {1, 3, 2};
//        int[] productosCajero2 = new int[] {2, 4, 1, 7};
//        int[] productosCajero3 = new int[] {3, 10};
//        
//        Cajero cajero = new Cajero(productosCajero, "CAJERO 1");
//        
//        Cajero cajero2 = new Cajero(productosCajero2,  "CAJERO 2");
//        
//        Cajero cajero3 = new Cajero(productosCajero3,  "CAJERO 3");
//        
//        cajero.procesarProductos();
//        cajero2.procesarProductos();
//        cajero3.procesarProductos();


        int[] productosCajero = new int[] {1, 3, 2};
        int[] productosCajero2 = new int[] {2, 4, 1, 7};
        int[] productosCajero3 = new int[] {3, 10};
        
        CajeroHilos cajero1 = new CajeroHilos(productosCajero, "cajero 1");
        CajeroHilos cajero2 = new CajeroHilos(productosCajero2, "cajero 2");
        CajeroHilos cajero3 = new CajeroHilos(productosCajero3, "cajero 3");
        
        cajero1.start();
        cajero2.start();
        cajero3.start();

            


    }
        
}
