package F_02_12_2010;

import java.util.ArrayList;

public class LoggerCollection {

    ArrayList<Logger> collection;

    public LoggerCollection(){
        collection = new ArrayList<Logger>();
    }

    public void addLogger(Logger logger) {

        if (!collection.contains(logger))
            collection.add(logger);
        else{
            PrintLogger l = new PrintLogger("warningCollection", Level.WARN, this);
            Message m = new Message(Level.WARN, "El nombre ya existe. No se ingreso el BasicLogger!");
            l.notify(m);
        }
    }

    public Logger getLogger(String name){
        for (Logger l: collection) {
            if (name.equals(l.getName())){
                return l;
            }
        }

        return null;
    }

}
