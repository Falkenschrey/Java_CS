import java.util.Scanner;

    public class Euklid {
        public static void main(String[] args) {
            //Eingabe
            Scanner eingabe = new Scanner(System.in);

            System.out.print("Bitte geben Sie a ein: ");
            int a = eingabe.nextInt();
            System.out.print("Bitte geben Sie b ein: ");
            int b = eingabe.nextInt();

            // Sanity Check
            if (a == 0 || b == 0) {
                System.out.println("Sach ma, hast du Lack gesoffen?!");
                System.exit(1);
            }
            if (a < 0) a = -a;
            if (b < 0) b = -b;

            //Verarbeitung
            while (a != b) {
                if (a > b) {
                    a = a - b;
                }
                else {
                    b = b - a;
                }
                System.out.println("Ich bin die Schleife! Verbeug dich vor mir!!");
            }

            //Ausgabe
            System.out.print("Das Ergebnis lautet " + a + ". FUCK YEAH!");
        }
}
