
import java.util.Scanner;

public class Lab2_E4_Apellido {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;

        // Validar que el numero sea positivo e impar
        do {
            System.out.print("Ingrese un numero impar positivo: ");
            n = entrada.nextInt();

            if (n <= 0 || n % 2 == 0) {
                System.out.println("Error. Ingrese un numero impar positivo.");
            }

        } while (n <= 0 || n % 2 == 0);

        int mitad = n / 2;

        // Parte superior del rombo
        for (int i = 0; i <= mitad; i++) {

            for (int j = 0; j < mitad - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Parte inferior del rombo
        for (int i = mitad - 1; i >= 0; i--) {

            for (int j = 0; j < mitad - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        entrada.close();
    }
}
