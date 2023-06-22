public class Auto {

    private String Automarke;

    private int Achsenanzahl;

    public Auto(String Automarke, int Achsenanzahl){
        this.Automarke = Automarke;
        this.Achsenanzahl = Achsenanzahl;
    }
    public void fahren(){
        System.out.println(this.Automarke + " fährt mit " +
                this.Achsenanzahl + " Achsen.");
    }
}
