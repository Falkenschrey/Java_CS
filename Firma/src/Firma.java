public class Firma {

    private String Proffesion;
    private String Produkt1;
    private String Produkt2;

    public Firma(String Proffesion, String Produkt1, String Produkt2){
        this.Proffesion = Proffesion;
        this.Produkt1 = Produkt1;
        this.Produkt2 = Produkt2;
    }

    public String getProffesion() {
        return Proffesion;
    }
    public void setProffesion(String proffesion) {
        Proffesion = proffesion;
    }

    public String getProdukt1() {
        return Produkt1;
    }
    public void setProdukt1(String produkt1) {
        Produkt1 = produkt1;
    }

    public String getProdukt2() {
        return Produkt2;
    }
    public void setProdukt2(String produkt2) {
        Produkt2 = produkt2;
    }

    public void produzieren(){
        System.out.println("Die " + this.Proffesion + " produziert " + this.Produkt1 + " und " + this.Produkt2 + ".");
    }
}
