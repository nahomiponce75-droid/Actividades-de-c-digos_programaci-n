
 // Autor: Mileydi Dueñas
import java.util.Scanner;
import java.util.Locale;

public class T2_P4_HoraSiguiente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int hh, mm, ss;

        System.out.print("Ingrese hora, minutos y segundos: ");
        hh = sc.nextInt();
        mm = sc.nextInt();
        ss = sc.nextInt();

        if (hh < 0 || hh > 23 ||
            mm < 0 || mm > 59 ||
            ss < 0 || ss > 59) {
            System.out.println("Error: hora no valida.");
        } else {
            ss++;

            if (ss == 60) {
                ss = 0;
                mm++;

                if (mm == 60) {
                    mm = 0;
                    hh++;

                    if (hh == 24) {
                        hh = 0;
                    }
                }
            }

            System.out.printf("%02d:%02d:%02d%n", hh, mm, ss);
        }

        sc.close();
    }
}
