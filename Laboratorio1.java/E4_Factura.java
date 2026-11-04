import java.util.*;
public class E4_Factura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Producto: ");
        String prod = sc.nextLine();
        System.out.print("Cantidad: ");
        int cant = sc.nextInt();
        System.out.print("Precio unitario: ");
        double precio = sc.nextDouble();

        double subtotal = cant * precio;
        double iva = subtotal * 0.15;
        double total = subtotal + iva;

        System.out.printf("\n%-15s %-8s %-10s %-10s\n", "Producto","Cant","P.Unit","Subtotal");
        System.out.printf("%-15s %-8d %-10.2f %-10.2f\n", prod,cant,precio,subtotal);
        System.out.printf("\n%-15s: %.2f\n", "IVA 15%", iva);
        System.out.printf("%-15s: %.2f\n", "TOTAL", total);
        sc.close();
    }
}