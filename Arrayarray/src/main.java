public class main {
    public static void main(String[] args) {
        String[] dogs ={"Dackel", "Windhund", "Husky", "Labrador"};
        int[] alter ={1, 7, 3, 2};
        String[] redogs = dogray(dogs);
        print(redogs, alter);
        //meh(alter);
    }

    public static void print(String[] Brrrr, int[] klonk) {
        for (int i=0; i < Brrrr.length; i++) {
            if (i>0) System.out.print(", ");
            System.out.print(Brrrr[i] + " (" + klonk[i] +" Jahre) ");
        }
        meh(klonk);
    }

    public static String[] dogray(String[] array) {
        int wuffs = 0;
        String[] wrongdogs= new String[array.length];
        for (int i=array.length-1; i>=0 ; i--){

            wrongdogs[i] = (array[wuffs]);
            wuffs++;
        }
    return wrongdogs;
    }

    public static void meh(int[] altray){
        int ergebniss = 0;
        for (int i=0; i < altray.length; i++) {
            ergebniss = ergebniss + altray[i];
        }
        System.out.println(", alle Wuffs haben ein kombiniertes Alter von " + ergebniss + " Jahren. Das entspricht " + ergebniss*7 + " Hundejahren.");
    }
}