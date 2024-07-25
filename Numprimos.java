import java.util.Scanner;
public class Numprimos {
    public static boolean prim(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            if (prim (numero)) {
                System.out.println("El número " + numero + " es primo.");
            } else {
                System.out.println("El número " + numero + " no es primo.");
            }
        } else {
            System.out.println("Por favor, ingresa un número entero válido.");
        }
        
        scanner.close();
    }
}

