/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;

/**
 *
 * @author dario
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1 =  (int) (Math.random()*100+1);
        int numero2 = (int) (Math.random()*100+1);
        int numero3 = (int) (Math.random()*100+1);
        int numero4 = (int) (Math.random()*100+1);
        int minimo1;
        int minimo2;
        int minimoreal;
        int maximo1;
        int maximo2;
        int maximoreal;
                
        
        int promedio ;
        
        
        
       minimo1 = Math.min(numero1,numero2);
       minimo2= Math.min(numero3,numero4);
       minimoreal= Math.min(minimo1,minimo2);
       maximo1 = Math.max(numero1,numero2);
       maximo2= Math.max(numero3,numero4);
       maximoreal= Math.max(maximo1,maximo2);
        
        promedio = (numero1 + numero2 + numero3 + numero4)/4;
        System.out.println("numero1=" +numero1);
        System.out.println("numero2=" +numero2);
        System.out.println("numero3=" +numero3);
        System.out.println("numero4=" +numero4);
        System.out.println("El promedio es:" +promedio);
        System.out.println("El minimo numero  es:" +minimoreal);
        System.out.println("El maximo numero  es:" +maximoreal);
         
        
       
        
    }
    
}
