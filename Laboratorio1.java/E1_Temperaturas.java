import java.util.Locale;
import java.util.Scanner;

public class E1_Temperaturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese temperatura en Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsius * 9.0 / 5.0 + 32.0;
        double kelvin = celsius + 273.15;

        // Tabla alineada con 2 decimales como pide la diapositiva
        System.out.println("\n--- CONVERSION ---");
        System.out.printf("%-12s %-12s %-12s\n", "Celsius", "Fahrenheit", "Kelvin");
        System.out.printf("%-12.2f %-12.2f %-12.2f\n", celsius, fahrenheit, kelvin);

        sc.close();
    }
}