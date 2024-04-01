/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

/**
 *
 * @author dario
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float coordenadasx1 = 5.0f;
        float coordenadasx2 = 8.0f;
        float coordenadasy1 = 1.0f;
        float coordenadasy2 = 5.0f;
        float coordenadasz1 = 2.0f;
        float coordenadasz2 = 5.0f;
        float sumadeCoordenadas;
        
        sumadeCoordenadas = (float)Math.sqrt((float)Math.pow(coordenadasx2 - coordenadasx1,2.0)+(float)Math.pow(coordenadasy2 - coordenadasy1,2.0)+(float)Math.pow(coordenadasz2 - coordenadasz1,2.0));
        System.out.println("La suma de coordenadas es: "+ sumadeCoordenadas);
    }
    
}
