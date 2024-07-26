import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Maximocomundivisor {
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("ingresa un numero ");
        while (!scanner.hasNextInt()) {
            System.out.println("ingresa un numero valido");
            scanner.next(); 
            System.out.print("ingresa un numero  ");
        }
        int numero1 = scanner.nextInt();

        System.out.print("ingresa otro numero ");
        while (!scanner.hasNextInt()) {
            System.out.println("ingresa un numero valido");
            scanner.next();
            System.out.print("ingresa el segundo numero ");
        }
        int numero2 = scanner.nextInt();

        
        int mcd = calcularMCD(numero1, numero2);
        System.out.println("El MCD de: " + numero1 + " y " + numero2 + " es: " + mcd);

        scanner.close();
    }
}
