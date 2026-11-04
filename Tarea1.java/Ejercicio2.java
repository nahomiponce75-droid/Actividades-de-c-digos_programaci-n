import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anio;

        System.out.print("Ingrese el anio: ");
        anio = sc.nextInt();

        if (anio <= 0) {
            System.out.println("Ingrese un anio positivo.");

        } else if (anio % 400 == 0) {
            System.out.println("El anio es bisiesto.");

        } else if (anio % 100 == 0) {
            System.out.println("El anio no es bisiesto.");

        } else if (anio % 4 == 0) {
            System.out.println("El anio es bisiesto.");

        } else {
            System.out.println("El anio no es bisiesto.");
        }

        sc.close();
    }
}