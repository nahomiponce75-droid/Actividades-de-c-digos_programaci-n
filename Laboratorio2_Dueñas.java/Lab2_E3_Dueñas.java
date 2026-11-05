
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Lab2_E3_Dueñas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);
        Random azar = new Random();

        int secreto = azar.nextInt(100) + 1;
        int numero, intentos = 0;
        boolean acerto = false;

        do {
            System.out.print("Adivine el numero (1-100): ");
            numero = entrada.nextInt();

            intentos++;

            if (numero == secreto) {
                acerto = true;
                System.out.println("¡Correcto! Adivinaste el numero.");
            } else if (numero < secreto) {
                System.out.println("Mas alto.");
            } else {
                System.out.println("Mas bajo.");
            }

        } while (!acerto && intentos < 7);

        if (acerto) {
            System.out.println("Acertaste en " + intentos + " intentos.");
        } else {
            System.out.println("Se acabaron los intentos.");
            System.out.println("El numero era: " + secreto);
        }

        entrada.close();
    }
}