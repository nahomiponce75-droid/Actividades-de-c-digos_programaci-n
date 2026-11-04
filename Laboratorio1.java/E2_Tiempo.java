import java.util.*;
public class E2_Tiempo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tiempo total en segundos: ");
        int total = sc.nextInt();

        int horas = total / 3600;
        int resto = total % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.printf("\n%02d:%02d:%02d\n", horas, minutos, segundos);
        System.out.printf("Horas: %d  Min: %d  Seg: %d\n", horas, minutos, segundos);
        sc.close();
    }
}