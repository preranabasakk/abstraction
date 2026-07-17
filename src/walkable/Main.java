package walkable;

public class Main {
    public static void main (String []args){
        Swimable mach= new Fish();
        mach.swim();
        Walkable he = new Human();
        Swimable she = new Human() ;
        he.walk();
        she.swim();
    }
}
