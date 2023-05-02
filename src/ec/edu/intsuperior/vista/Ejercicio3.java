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
public class Ejercicio3 {
    public static void main(String[]args){
        //declaracion de variables
    int n1,n2;
    Scanner sc = new Scanner(System.in);
    //Leer el primer numero
    System.out.println("Intruduce un numero entero:");
    n1 = sc.nextInt();//leerun entero por teclado
    //leer el segundo numero
    System.out.println("Introduce otro numero entero");
    n2 = sc.nextInt();//leer un entero por teclado
    //mostrar resultado
        System.out.println("ha introducido los numeros : " + n1+"y"+n2);
    }
}


