
 // Autor: Mileydi Dueñas
import java.util.Scanner;
import java.util.Locale;

public class T2_P5_MayorDeTres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("Ingrese el primer numero: ");
        a = sc.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        b = sc.nextDouble();

        System.out.print("Ingrese el tercer numero: ");
        c = sc.nextDouble();

        if (a == b || a == c || b == c) {
            System.out.println("Error: los numeros deben ser distintos.");
        } else if (a > b) {
            if (b > c) {
                System.out.println(a + ", " + b + ", " + c);
            } else if (a > c) {
                System.out.println(a + ", " + c + ", " + b);
            } else {
                System.out.println(c + ", " + a + ", " + b);
            }
        } else {
            if (a > c) {
                System.out.println(b + ", " + a + ", " + c);
            } else if (b > c) {
                System.out.println(b + ", " + c + ", " + a);
            } else {
                System.out.println(c + ", " + b + ", " + a);
            }
        }

        sc.close();
    }
}
