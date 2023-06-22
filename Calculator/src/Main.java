import java.util.Scanner;

public class Main {

    public static double add ( double zahl1, double zahl2) {
        return zahl1 + zahl2;
    }

    public static double sub ( double zahl1, double zahl2) {
        return zahl1 - zahl2;
    }

    public static double multiplizieren ( double zahl1, double zahl2) {
        return zahl1 * zahl2;
    }

    public static double dividieren ( double zahl1, double zahl2) {
        return zahl1 / zahl2;
    }

    public static void main(String[] args) {
        double zwischensumme = 0;
        String op;
        String a = String.valueOf('+');
        String b = String.valueOf('-');
        String c = String.valueOf('*');
        String d = String.valueOf('/');
        String e = String.valueOf('=');
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die erste Zahl ein und bestätigen Sie mit 'Enter':");
        double zahl1 = scanner.nextDouble();
        while (true) {
            if (zwischensumme != 0) {
                zahl1 = zwischensumme;
            }
            while (true) {
                System.out.println("Rechensymbol: ");
                op = scanner.next();
                if (!a.equals(op) && !b.equals(op) && !c.equals(op) && !d.equals(op) && !e.equals(op)) {
                    System.out.println("Unbekanntes oder noch nicht implementiertes Rechensymbol.");
                } else if (op.equals(e)) {
                    System.out.println("Ergebnis der Rechenoperation: " + zwischensumme);
                    return;
                } else {
                    break;
                }
            }
            if (!e.equals(op)) {
                System.out.println("Geben Sie die nächste Zahl ein und bestätigen Sie mit 'Enter':");
                double zahl2 = scanner.nextDouble();

                if (a.equals(op)) {
                    double sumAdd = add(zahl1, zahl2);
                    zwischensumme = sumAdd;
                    System.out.println("Zwischensumme: " + sumAdd);
                } else if (b.equals(op)) {
                    double sumSub = sub(zahl1, zahl2);
                    zwischensumme = sumSub;
                    System.out.println("Zwischensumme: " + sumSub);
                } else if (c.equals(op)) {
                    double sumMul = multiplizieren(zahl1, zahl2);
                    zwischensumme = sumMul;
                    System.out.println("Zwischensumme: " + sumMul);
                } else if (d.equals(op)) {
                    double sumDiv = dividieren(zahl1, zahl2);
                    zwischensumme = sumDiv;
                    System.out.println("Zwischensumme: " + sumDiv);
                }
            }
        }
    }
}