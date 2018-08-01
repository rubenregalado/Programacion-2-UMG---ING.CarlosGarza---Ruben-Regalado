/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejovariables;

/**
 *
 * @author DELL
 */
public class ManejoVariablesTest {
    
    public static void main(String[] args){
        //Variable booleana, declaration
        boolean bool1;
        //inicializacion 
        bool1 = true;
        //Declaracion e inicializacion
        boolean bool2= false;
        System.out.println("valor bool1: " + bool1);
        System.out.println("valor bool2: " + bool2);
        System.out.println("");
        
        //variables byte
        byte b1 = 10;
        //Literal en hexadecimal 
        byte b2 = 0Xa; 
        System.out.println("valor byte1: " + b1);
        System.out.println("valor byte2: " + b2);
        System.out.println("");
        
        //Variables short
        short s1 = 2;
        System.out.println("valor short1: " + s1);
        System.out.println("");
        
        //Variables char 
        char ch1 = 65;
        char ch2 = 'A';
        System.out.println("valor char1: " + ch1);
        System.out.println("valor char2: " + ch2);
        System.out.println("");
        
        //variables enteras
        int decimal = 100;
        int octal = 0144; //valor octal inicia con 0
        int hexa = 0x64; // valor hexadecimal incia con 0x
        System.out.println("valor int decimal: " + decimal);
        System.out.println("valor int octal: " + octal);
        System.out.println("valor int hexadecimal " + hexa);
        System.out.println("");
        
        //Variables long
        long long1 = 10, long2 = 20L;
        System.out.println("valor long1: " + long1);
        System.out.println("valor  long2: " + long2);
        System.out.println("");
        
        //variables float
        System.out.println("valor float1: " + f1);
        System.out.println("valor  float2: " + f2);
        System.out.println("");
        
        //variables double 
        double d1= 11.0, d2 =30.15D;
        System.out.println("valor double1: " + d1);
        System.out.println("valor double2: " + d2);
        System.out.println("");
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}