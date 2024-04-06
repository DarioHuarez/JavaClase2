/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication29;

/**
 *
 * @author dario
 */
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float variableX = 3.0f;
        float ecuacion;
        
        ecuacion = 2*(float)Math.pow(variableX,-3.0) + 5*(float)Math.pow(variableX,2.0) - 8*(variableX) /(float)Math.sqrt(9*(Math.pow(variableX,3.0)- 2*(float)Math.pow(variableX,2.0) + 1*(variableX)));
        
        System.out.println("La solucion de la ecuacion es;" +ecuacion);
    }
    
}
