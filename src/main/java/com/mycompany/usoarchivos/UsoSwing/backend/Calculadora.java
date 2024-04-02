package com.mycompany.usoarchivos.UsoSwing.backend;

import com.mycompany.usoarchivos.UsoSwing.excepciones.CalculadoraExcepciones;

/**
 *
 * @author saien
 */
public class Calculadora {

    //Metodo suma
    public double sumar(String num1, String num2) throws CalculadoraExcepciones {
        double valor1;
        double valor2;
        try {
            valor1 = Double.valueOf(num1);
            
        } catch (NumberFormatException e) {
            throw new CalculadoraExcepciones(String.format("El valor '%s' del campo de texto 'Numero 1' no es valido", num1));
        }
        
        try {
            valor2 = Double.valueOf(num2);
        } catch (NumberFormatException e) {
            throw new CalculadoraExcepciones(String.format("El valor '%s' del campo de texto 'Numero 2' no es valido", num2));
        }
            return valor1 + valor2;
    }
    //Metodo Resta
    public double Resta(String num1, String num2) throws CalculadoraExcepciones {
        double valor1;
        double valor2;
        try {
            valor1 = Double.valueOf(num1);
            
        } catch (NumberFormatException e) {
            throw new CalculadoraExcepciones(String.format("El valor '%s' del campo de texto 'Numero 1' no es valido", num1));
        }
        
        try {
            valor2 = Double.valueOf(num2);
        } catch (NumberFormatException e) {
            throw new CalculadoraExcepciones(String.format("El valor '%s' del campo de texto 'Numero 2' no es valido", num2));
        }
            return valor1 - valor2;
    }
    //Metodo Multiplicar
    public double Multiplicacion(String num1, String num2) throws CalculadoraExcepciones {
        double valor1;
        double valor2;
        try {
            valor1 = Double.valueOf(num1);
            
        } catch (NumberFormatException e) {
            throw new CalculadoraExcepciones(String.format("El valor '%s' del campo de texto 'Numero 1' no es valido", num1));
        }
        
        try {
            valor2 = Double.valueOf(num2);
        } catch (NumberFormatException e) {
            throw new CalculadoraExcepciones(String.format("El valor '%s' del campo de texto 'Numero 2' no es valido", num2));
        }
            return valor1 * valor2;
    }
    //Metodo Dividr
    public double Division(String num1, String num2) throws CalculadoraExcepciones {
        double valor1;
        double valor2;
        try {
            valor1 = Double.valueOf(num1);
            
        } catch (NumberFormatException e) {
            throw new CalculadoraExcepciones(String.format("El valor '%s' del campo de texto 'Numero 1' no es valido", num1));
        }
        
        try {
            valor2 = Double.valueOf(num2);
        } catch (NumberFormatException e) {
            throw new CalculadoraExcepciones(String.format("El valor '%s' del campo de texto 'Numero 2' no es valido", num2));
        }
            return valor1 / valor2;
    }
}
