package com.mycompany.usoarchivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author saien
 */
public class ManejoArchivos {

    private static final String PATH_CARPETA = "/home/saien/Documentos/IPC1 2024/.Manejo Archivos";
    private static final String PATH_ARCHIVO = "/home/saien/Documentos/IPC1 2024/.Manejo Archivos/texto.txt";

    public void conectarConCarpeta() {
        File carpeta = new File(PATH_CARPETA);
        System.out.println("Existe?: " + carpeta.exists());
        System.out.println("Es carpeta?: " + carpeta.isDirectory());
        System.out.println("Se puede alterar?: " + carpeta.canWrite());
        System.out.println("Esta oculta?: " + carpeta.isHidden());
 
        System.out.println("\n\n");

        if (carpeta.exists() && carpeta.isDirectory()) {
            System.out.println("Archivos dentro de la carpeta " + carpeta.getName());
            for (String filename : carpeta.list()) {
                File archivoEnCarpeta = new File(PATH_CARPETA + File.separator + filename);
                if (archivoEnCarpeta.isHidden()) {

                    System.out.println(filename);
                }
            }
        }
    }

    public void escribirEnArchivoDeTexto(String contenido) {
        File archivoTexto = new File(PATH_ARCHIVO);
        File carpeta = new File(PATH_CARPETA);
//        try {
//
//            FileOutputStream fileOutputStream = new FileOutputStream(archivoTexto);
//            fileOutputStream.write(contenido.getBytes());
//            fileOutputStream.close();
//        } catch (FileNotFoundException e) {
//            //Cuando es FileNotFoundException
//            System.out.println("El archivo no se encuentra en " + carpeta.getName());
//            e.printStackTrace();
//        }catch (IOException e){
//            System.out.println("El archivo tiene restringida la escritura");
//            e.printStackTrace();
//            
//        }
//        
        try(FileWriter fileWriter = new FileWriter(archivoTexto, true); 
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            bufferedWriter.newLine();
            bufferedWriter.append(contenido);
           // bufferedWriter.append(contenido);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
