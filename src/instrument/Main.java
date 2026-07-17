package instrument;

public class Main {
    public static void main (String []args){
        Instrument piano = new Piano() ;
        piano.play();
        piano.tune();

        Instrument guitar=new Guitar();
        guitar.play();
        guitar.tune();

    }
}
