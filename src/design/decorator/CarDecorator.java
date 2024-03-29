package design.decorator;

public class CarDecorator implements Car {

    Car car;

    public CarDecorator(Car car){
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

     /*
        Decorator Design Pattern – Important Points

        Decorator design pattern is helpful in providing runtime modification abilities
        and hence more flexible. Its easy to maintain and extend when the number of
        choices are more.

        The disadvantage of decorator design pattern is that it uses a lot of similar
        kind of objects (decorators). Decorator pattern is used a lot in Java IO
        classes, such as FileReader, BufferedReader etc.
     */

}
