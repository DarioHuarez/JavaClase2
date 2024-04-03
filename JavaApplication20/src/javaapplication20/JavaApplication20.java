/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication20;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        
        System.out.print("Por favor ingrese un numero: ");
        numero=teclado.nextInt();
        
        if(numero % 2 == 0) {
        System.out.println(numero+" es un numero par");
        }else {
            System.out.println(numero+" no es un numero par");
        }
        
                
        
     
       
                
    }
    
}
