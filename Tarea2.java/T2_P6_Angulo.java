
 // Autor: Mileydi Dueñas
import java.util.Scanner;
import java.util.Locale;

public class T2_P6_Angulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        double angulo;

        System.out.print("Ingrese el angulo en grados: ");
        angulo = sc.nextDouble();

        if (angulo < 0) {
            System.out.println("Error: el angulo no puede ser negativo.");
        } else {
            if (angulo > 360) {
                angulo = angulo % 360;
            }

            System.out.printf("Angulo considerado: %.2f grados%n", angulo);

            if (angulo == 0) {
                System.out.println("Angulo nulo");
            } else if (angulo < 90) {
                System.out.println("Angulo agudo");
            } else if (angulo == 90) {
                System.out.println("Angulo recto");
            } else if (angulo < 180) {
                System.out.println("Angulo obtuso");
            } else if (angulo == 180) {
                System.out.println("Angulo llano");
            } else if (angulo < 360) {
                System.out.println("Angulo concavo");
            } else {
                System.out.println("Angulo completo");
            }
        }

        sc.close();
    }
}
