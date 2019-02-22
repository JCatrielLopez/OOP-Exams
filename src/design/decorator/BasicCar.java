package design.decorator;

public class BasicCar implements Car {

    public BasicCar(){}

    @Override
    public void assemble() {
        System.out.println("Assembling a basic car...");
    }
}
