/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;

/**
 *
 * @author dario
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final float PI = 3.141592f;
        
        float radioEsfera = 5.0f;
        float VolumenEsfera;
       
       VolumenEsfera = 4/3*PI*(float)Math.pow(radioEsfera,3.0);
       
        System.out.println("El volumen de la esfera es: "+ VolumenEsfera + "metros cubicos");
    }
    
}
