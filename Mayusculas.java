package com.mycompany.mayusculas;
import java.util.Scanner;
public class Mayusculas{
 public static void main (String[] args){
 Scanner teclado= new Scanner(System.in);
 String frase;
 System.out.println("escribe una frase");
 frase=teclado.nextLine();
 while (!frase.equals(" ")) {
    System.out.println(frase.toUpperCase());

    System.out.println("escribe una frase");
frase=teclado.nextLine();
        }
    } 
}