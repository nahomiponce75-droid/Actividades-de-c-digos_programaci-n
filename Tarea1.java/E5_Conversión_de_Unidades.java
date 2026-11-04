import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        double metros, kg, celsius, fahrenheit;

        do {
            System.out.println("\n--- CONVERSION DE UNIDADES ---");
            System.out.println("1. Metros a pies");
            System.out.println("2. Kilogramos a libras");
            System.out.println("3. Celsius a Fahrenheit");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese los metros: ");
                    metros = sc.nextDouble();

                    System.out.println("Resultado: " + (metros * 3.28084) + " pies");
                    break;

                case 2:
                    System.out.print("Ingrese los kilogramos: ");
                    kg = sc.nextDouble();

                    System.out.println("Resultado: " + (kg * 2.20462) + " libras");
                    break;

                case 3:
                    System.out.print("Ingrese los grados Celsius: ");
                    celsius = sc.nextDouble();

                    fahrenheit = (celsius * 9.0 / 5.0) + 32;

                    System.out.println("Resultado: " + fahrenheit + " Fahrenheit");
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 0);

        sc.close();
    }
}