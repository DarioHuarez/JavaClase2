/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author dario
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float numerosNaturales = 4.0f;
        float snumerosNaturales;
        
        snumerosNaturales = (float)Math.pow(numerosNaturales, 2.0)*(float)Math.pow(numerosNaturales +1 , 2.0) /4;
        System.out.println("La suma de los primeros 4 cubos naturales son:"+snumerosNaturales);
    }
    
}
