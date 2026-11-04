import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, d, x1, x2;

        System.out.print("Ingrese a: ");
        a = sc.nextDouble();

        System.out.print("Ingrese b: ");
        b = sc.nextDouble();

        System.out.print("Ingrese c: ");
        c = sc.nextDouble();

        if (a == 0) {
            System.out.println("No es una ecuacion cuadratica.");
        } else {
            d = b * b - 4 * a * c;

            if (d > 0) {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);

                System.out.println("Raiz 1: " + x1);
                System.out.println("Raiz 2: " + x2);

            } else if (d == 0) {
                x1 = -b / (2 * a);
                System.out.println("Raiz doble: " + x1);

            } else {
                System.out.println("No existen raices reales.");
            }
        }

        sc.close();
    }
}