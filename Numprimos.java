import java.util.Scanner;
public class Numprimos {
    public static boolean prim(int numero) {
        if (numero<=1) {
            return false;
        }
        if (numero<=3) {
            return true;
        }
        if (numero %2==0 || numero% 3== 0) {
            return false;
        }
        for (int i=5; i*i <=numero; i+=6) {
            if (numero% i==0 || numero% (i + 2)== 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            if (prim (numero)) {
                System.out.println("El numero " + numero + " es primo.");
            } else {
                System.out.println("El numero " + numero + " no es primo.");
            }
        } else {
            System.out.println("Ingresa otro numero c:");
        }
        scanner.close();
    }
}

