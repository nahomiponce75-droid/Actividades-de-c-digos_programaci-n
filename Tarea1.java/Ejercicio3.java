import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double horas, costo, adicionales;

        System.out.print("Ingrese las horas de parqueo: ");
        horas = sc.nextDouble();

        if (horas <= 0) {
            System.out.println("Las horas deben ser mayores que cero.");

        } else {
            if (horas <= 1) {
                costo = 1.00;

            } else {
                adicionales = Math.ceil(horas - 1);
                costo = 1.00 + adicionales * 0.50;
            }

            if (costo > 6.00) {
                costo = 6.00;
            }

            System.out.printf("Total a pagar: $%.2f%n", costo);
        }

        sc.close();
    }
}