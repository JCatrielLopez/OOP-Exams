package F_02_12_2010;

public class TwoPrintsLogger extends LoggerDecorator {

    public TwoPrintsLogger(Logger logger, LoggerCollection col) {
        super(logger, col);
    }

    @Override
    public void notify(Message m){
        super.notify(m);

        System.out.println("Tambien imprimo este mensaje, pero bien podria mandar un email!");
    }
}
