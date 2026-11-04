import java.util.*;
public class E3_Cifras {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de 4 cifras: ");
        int n = sc.nextInt();

        if(n < 1000 || n > 9999){
            System.out.println("Debe ser de 4 cifras");
        }
        int d1 = n / 1000;
        int d2 = (n / 100) % 10;
        int d3 = (n / 10) % 10;
        int d4 = n % 10;

        int suma = d1+d2+d3+d4;
        int invertido = d4*1000 + d3*100 + d2*10 + d1;
        boolean esPar = (n % 2 == 0);

        System.out.println("Suma cifras: " + suma);
        System.out.println("Invertido: " + invertido);
        System.out.println("Es par: " + esPar);
        sc.close();
    }
}