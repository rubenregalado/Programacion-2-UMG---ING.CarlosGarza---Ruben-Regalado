/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodecadenas;

/**
 *
 * @author DELL
 */
public class Manejodecadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre = "Maria";
        String apellido = "Lopez";
        String nombre2 = "Ruben";
        int edad2 = 25;
        int edad = 28;
        
        
        System.out.println("Concatenacion;" + nombre + " " + apellido + " tiene " + edad + " anos de edad");
        
        System.out.println("Nueva linea: \n" + nombre + " " + apellido);
        
        System.out.println("Tabulador; \t" + nombre + " " + apellido);
        
        System.out.println("Retroceso; \b" + nombre + " " + apellido);
        
        System.out.println("Retorno de carro; \r" + nombre + " " + apellido);
        
        System.out.println("Comilla simple; \'" + nombre + " " + apellido);
        
        System.out.println("Comilla doble; \"" + nombre + " " + apellido);
        
        if (edad > edad2){
          System.out.println("Maria es mayor que Ruben");   
       
        }
        else {
          System.out.println("Ruben es mayor que Maria");
        }
        
        
       
        
        
        
        
    }
    
}




