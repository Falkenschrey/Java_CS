/*
    Berechnung des Body Mass Index (BMI)

    Abfragen vom Anwender (Eingabe):
    - Name
    - Geburtsjahr
    - Größe
    - Gewicht

    Berechnung (Verarbeitung)
    - Alter
    BMI = Gewicht / (Größe + Größe)

    Ausgabe des Ergebnisses (Ausgabe)
    - Hallo v, du bist w Jahre alt.
    - du wiegst x Kilogramm und bist y Meter groß
    - dein BMI lautet: z

    Feature Request:
    BMI soll bewertet werden!
 */

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        System.out.print("Bitte geben Sie Ihren Namen ein: ");
        String v = eingabe.next();

        System.out.print("Bitte geben Sie Ihr Geburtsjahr ein: ");
        float w = eingabe.nextFloat();

        System.out.print("Bitte geben Sie Ihr Gewicht ein: ");
        float x = eingabe.nextFloat();

        System.out.print("Bitte geben Sie Ihre Größe in Metern ein: ");
        float y = eingabe.nextFloat();

        float z = x / (y * y);


        System.out.println("Hallo " + v + " du bist " + (2022 - w) + " Jahre alt.");
        System.out.println("Du wiegst " + x + " Kilogramm und bist " + y + " Meter Groß.");
        System.out.println("Dein BMI beträgt " + z);
        //Entscheidung
        System.out.println("Du bist ");
        // <10
        if (z < 10) System.out.println("nicht mit dem Leben vereinbar.");
        else if (z <= 18.5) System.out.println("Untergewichtig. Wie wäre es mit Lieferando.de?");
        else if (z <= 25) System.out.println("Normal... Langweilig.");
        else if (z <= 30) System.out.println("Übergewichtig.");
        else System.out.println("Sehr Übergewichtig, muss ich dazu noch mehr sagen?");
    }
}
/*
        //>=10 ... <18,5
        if (z >= 10 && z <= (float)18.5) {
            System.out.println("Untergewichtig. Wie wäre es mit Lieferando.de?");
        }
        //>18,5 ... <25
        if (z >= (float)18.5 && z <= 25) {
            System.out.println("Normal... Langweilig.");
        }
        // >25 ... <=30
        if (z >= 25 && z <= 30) {
            System.out.println("Übergewichtig.");
        }
        //>30
        if (z >= 30) {
            System.out.println("Sehr Übergewichtig, muss ich dazu noch mehr sagen?");
        }
    }
}*/
