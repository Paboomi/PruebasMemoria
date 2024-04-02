package com.mycompany.usoarchivos.UsoSwing;

import com.mycompany.usoarchivos.ManejoArchivos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author saien
 */
public class FrameAMano {

    public void crearFrameBasico() {
        //Los componentes se crean segun el orden en que los agreguemos
        
        //Creamos una instancia de manejo de archivos para escribir contenido en nuestro archivo
        
        ManejoArchivos archivo = new ManejoArchivos();
        
        JFrame primerFrame = new JFrame("Mi primer Frame");
        primerFrame.setSize(250, 250);
        primerFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        primerFrame.getContentPane().setLayout(new FlowLayout());

        //Etiqueta
        JLabel etiqueta1 = new JLabel("Ingrese texto");
        etiqueta1.setSize(100, 40);
        primerFrame.add(etiqueta1);
        
        //Cuadro de texto
        JTextField text1 = new JTextField();
        text1.setSize(100, 40);
        text1.setPreferredSize(new Dimension(100, 40));
        primerFrame.add(text1);

        //Boton
        JButton botonGrabar = new JButton("Grabar");
        botonGrabar.setSize(75, 40);
        primerFrame.add(botonGrabar);
        botonGrabar.setName("Boton Grabar");
        botonGrabar.setBackground(Color.ORANGE);
        botonGrabar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Se ha pulsado " + botonGrabar.getName());
                archivo.escribirEnArchivoDeTexto(text1.getText());
            }
        });


        primerFrame.setVisible(true);
    }
}
