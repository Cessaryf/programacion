package com.mycompany.palindromos;
import java.util.Scanner;
public class Palindromo {
// -> "\\s+" <- sirve para eliminar los espacios y poner fraces con mas palabras, lo pongo para que no haya dudas xd
    public static boolean esPalindromo(String texto) {
        String textohecho = texto.replaceAll("\\s+", " ").toLowerCase();
        int longitud = textohecho.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (textohecho.charAt(i) != textohecho.charAt(longitud - i - 1)) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();

        if (esPalindromo(cadena)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }

        scanner.close();
    }
}
