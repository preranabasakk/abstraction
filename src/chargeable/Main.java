package chargeable;

public class Main {
    public static void main(String[] args) {
        Chargeable phone = new Phone();
        phone.charge();
        Chargeable laptop = new Laptop();
        laptop.charge();
    }
}