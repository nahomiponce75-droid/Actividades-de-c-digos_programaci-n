
 // Autor: Mileydi Dueñas
import java.util.Scanner;
import java.util.Locale;

public class T2_P2_Descuento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double PRECIO_SACO = 8.50;
        final double IVA = 0.15;
        final double DESC_5 = 0.05;
        final double DESC_10 = 0.10;

        int cantidad;
        double subtotal, descuento, base, iva, total;

        System.out.print("Ingrese la cantidad de sacos: ");
        cantidad = sc.nextInt();

        if (cantidad <= 0) {
            System.out.println("Error: la cantidad debe ser positiva.");
        } else {
            subtotal = cantidad * PRECIO_SACO;

            if (cantidad <= 20) {
                descuento = 0;
            } else if (cantidad <= 50) {
                descuento = subtotal * DESC_5;
            } else {
                descuento = subtotal * DESC_10;
            }

            base = subtotal - descuento;
            iva = base * IVA;
            total = base + iva;

            System.out.printf("Subtotal: $%.2f%n", subtotal);
            System.out.printf("Descuento: $%.2f%n", descuento);
            System.out.printf("Base imponible: $%.2f%n", base);
            System.out.printf("IVA (15%%): $%.2f%n", iva);
            System.out.printf("Total a pagar: $%.2f%n", total);
        }

        sc.close();
    }
}
