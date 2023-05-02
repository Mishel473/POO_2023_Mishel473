/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.vista;

import java.util.Scanner;

/**
 *
 * @author Mishel
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int respuesta;
        int num1;
        int num2;
        float resultado;
        
        System.out.println("Menu de Opciones");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Division");
        System.out.println("4. Multiplicacion");
        
        respuesta=entrada.nextInt();
                       
        System.out.println("Ingrese un numero 1");
        num1=entrada.nextInt();
        System.out.println("Ingrese otro numero 2");
        num2=entrada.nextInt();
        
        
        switch(respuesta){
                case 1:
                    resultado =num1+num2;
                    System.out.println("El resultado de la suma es:"+resultado);
                    break;
                case 2:
                    resultado=num1-num2;
                    System.out.println("El resultado de la resta es:"+resultado);
                    break;
                case 3:
                    resultado=num1/num2;
                    System.out.println("El resultado de la division es:"+resultado);
                    break;
                case 4:
                    resultado=num1*num2;
                    System.out.println("El resuldado de la multiplicacion es:"+resultado);
                    break;
                default:
                    System.out.println("Esta no es una opcion valida");
                    break;
        
        
         }    
        // TODO code application logic here
    }
    
}            
        // TODO code application logic here
    
    

