import java.util.Locale;
import java.util.Scanner;

public class Lab2_E5_Dueñas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        double saldo = 500;
        double monto;
        int opcion;

        do {
            System.out.println("\n===== CAJERO AUTOMATICO =====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    System.out.printf("Saldo: $%.2f%n", saldo);
                    break;

                case 2:
                    System.out.print("Ingrese el monto a depositar: ");
                    monto = entrada.nextDouble();

                    if (monto > 0) {
                        saldo += monto;
                        System.out.println("Deposito aceptado.");
                    } else {
                        System.out.println("Monto invalido.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el monto a retirar: ");
                    monto = entrada.nextDouble();

                    if (monto > 0 && monto <= saldo) {
                        saldo -= monto;
                        System.out.println("Retiro aceptado.");
                    } else {
                        System.out.println("Fondos insuficientes o monto invalido.");
                    }
                    break;

                case 0:
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 0);

        entrada.close();
    }
}