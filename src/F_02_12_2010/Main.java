package F_02_12_2010;

public class Main {

    public static void main(String[] args) {

        LoggerCollection col = new LoggerCollection();
        PrintLogger logger = new PrintLogger("logger", Level.DEBUG, col);

        Message m = new Message(Level.DEBUG, "HOLA, SOY UN MENSAJE");

        logger.notify(m);
    }




}
