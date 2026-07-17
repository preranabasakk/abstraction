package walkable;

public class Human implements Walkable ,Swimable{
    @Override
    public void walk() {
        System.out.println("human is walking");

    }

    @Override
    public void swim() {
        System.out.println("human is swimmmmim");
    }
}
