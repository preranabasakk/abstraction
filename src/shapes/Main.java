package shapes;

public class Main {

    public static void main(String[] args) {

        Shapes[] shapess = { new Circle(), new Square() };

        for (Shapes shape : shapess) {
            shape.perimeter();
        }
    }
}