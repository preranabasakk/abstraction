package chargeable;

 class Laptop implements Chargeable{
    @Override
    public void charge() {
        System.out.println("laptop is charging");
    }
}
