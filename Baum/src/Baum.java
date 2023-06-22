public class Baum {

    private String Baumart;

    private int Aeste;

    public Baum(String Baumart, int Aeste){
        this.Baumart = Baumart;
        this.Aeste = Aeste;
    }
    public void wehen(){
        System.out.println("Die " + this.Baumart + " lässt ihre " + this.Aeste + " Äste im Wind wehen.");
    }
}
