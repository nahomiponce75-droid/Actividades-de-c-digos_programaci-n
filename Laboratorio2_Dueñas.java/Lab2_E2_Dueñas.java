
import java.util.Scanner;

public class Lab2_E2_Dueñas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double temperatura, suma = 0;
        double maximo = 0, minimo = 0;
        int contador = 0;

        System.out.print("Ingrese la temperatura: ");
        temperatura = entrada.nextDouble();

        while (temperatura >= 0) {

            if (contador == 0) {
                maximo = temperatura;
                minimo = temperatura;
            } else {
                if (temperatura > maximo) {
                    maximo = temperatura;
                }

                if (temperatura < minimo) {
                    minimo = temperatura;
                }
            }

            suma += temperatura;
            contador++;

            System.out.print("Ingrese otra temperatura (-1 para terminar): ");
            temperatura = entrada.nextDouble();
        }

        if (contador > 0) {
            System.out.println("Lecturas: " + contador);
            System.out.printf("Promedio: %.2f%n", suma / contador);
            System.out.printf("Maximo: %.2f%n", maximo);
            System.out.printf("Minimo: %.2f%n", minimo);
        } else {
            System.out.println("No hubo lecturas.");
        }

        entrada.close();
    }
}
