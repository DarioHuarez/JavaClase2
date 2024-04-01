/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author dario
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Coordenadas en 2D
        float coordenadasx1 = 5.0f;
        float coordenadasx2 = 8.0f;
        float coordenadasy1 = 1.0f;
        float coordenadasy2 = 5.0f;
        float sumadeCoordenadas;
        
        sumadeCoordenadas = (float)Math.sqrt((float)Math.pow(coordenadasx2 - coordenadasx1,2.0)+(float)Math.pow(coordenadasy2 - coordenadasy1,2.0));
        System.out.println("La suma de coordenadas es: "+ sumadeCoordenadas);
       
       
    }
    
}
