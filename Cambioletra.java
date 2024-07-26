package com.mycompany.cambioletra;
import java.util.Scanner;

public class Cambioletra {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String texto = teclado.nextLine();

        System.out.print("Que letra quieres cambiar?: ");
        char caracterOriginal = teclado.next().charAt(0);

        System.out.print("Cual sera la nueva letra? ");
        char nuevoCaracter = teclado.next().charAt(0);

        String textoReemplazado = texto.replace(caracterOriginal, nuevoCaracter);

        System.out.println("Este es el texto nuevo: " + textoReemplazado);
        teclado.close();
    }
}
