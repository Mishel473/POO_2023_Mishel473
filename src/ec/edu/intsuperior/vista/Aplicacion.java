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
public class Aplicacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Introduzca Número entero: ");                                                 
        N = sc.nextInt();
        if(N%2==0)
           System.out.println("Par");   
        else
            System.out.println("Impar"); 
    }

}

