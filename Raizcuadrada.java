package com.mycompany.raizcuadrada;
import java.util.Scanner;
public class Raizcuadrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingresa un numero: ");
        
        if (scanner.hasNextDouble()) {
            double numero = scanner.nextDouble();
            
            if (numero<0) {
                System.out.println("No acepto numeros negativos, lo siento :c");
            } else {
                double raiz = Math.sqrt(numero);
                System.out.println("La raiz cuadrada de " + numero + " es: " + raiz);
            }
        } else {
            System.out.println("Ingresa un numero valido");
        }

        scanner.close();
    }
}
