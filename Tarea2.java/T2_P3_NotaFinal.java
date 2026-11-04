
 // Autor: Mileydi Dueñas
import java.util.Scanner;
import java.util.Locale;

public class T2_P3_NotaFinal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, promedio;

        System.out.print("Ingrese la primera nota (0 a 20): ");
        n1 = sc.nextDouble();

        System.out.print("Ingrese la segunda nota (0 a 20): ");
        n2 = sc.nextDouble();

        System.out.print("Ingrese la tercera nota (0 a 20): ");
        n3 = sc.nextDouble();

        if (n1 < 0 || n1 > 20 ||
            n2 < 0 || n2 > 20 ||
            n3 < 0 || n3 > 20) {
            System.out.println("Error: las notas deben estar entre 0 y 20.");
        } else {
            promedio = (n1 + n2 + n3) / 3;

            System.out.printf("Promedio: %.2f%n", promedio);

            if (promedio >= 14) {
                System.out.println("Aprobado");
            } else if (promedio >= 9) {
                System.out.println("Supletorio");
            } else {
                System.out.println("Reprobado");
            }
        }

        sc.close();
    }
}

