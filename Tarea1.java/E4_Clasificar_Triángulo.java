import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("Ingrese el lado a: ");
        a = sc.nextDouble();

        System.out.print("Ingrese el lado b: ");
        b = sc.nextDouble();

        System.out.print("Ingrese el lado c: ");
        c = sc.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Los lados deben ser positivos.");

        } else if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Los lados no forman un triangulo.");

        } else if (a == b && b == c) {
            System.out.println("Triangulo equilatero.");

        } else if (a == b || a == c || b == c) {
            System.out.println("Triangulo isosceles.");

        } else {
            System.out.println("Triangulo escaleno.");
        }

        sc.close();
    }
}