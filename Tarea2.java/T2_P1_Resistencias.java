
 // Autor: Mileydi Dueñas
import java.util.Scanner;
import java.util.Locale;

public class T2_P1_Resistencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double r1, r2, req;
        char tipo;

        System.out.print("Ingrese la primera resistencia: ");
        r1 = sc.nextDouble();

        System.out.print("Ingrese la segunda resistencia: ");
        r2 = sc.nextDouble();

        if (r1 <= 0 || r2 <= 0) {
            System.out.println("Error: las resistencias deben ser positivas.");
        } else {
            System.out.print("Tipo de conexion (S/P): ");
            tipo = sc.next().charAt(0);
            tipo = Character.toUpperCase(tipo);

            switch (tipo) {
                case 'S':
                    req = r1 + r2;
                    System.out.printf("Resistencia equivalente: %.2f ohmios%n", req);
                    break;

                case 'P':
                    req = (r1 * r2) / (r1 + r2);
                    System.out.printf("Resistencia equivalente: %.2f ohmios%n", req);
                    break;

                default:
                    System.out.println("Error: tipo de conexion no valido.");
            }
        }

        sc.close();
    }
}
