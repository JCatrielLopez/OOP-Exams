package F_02_12_2010;

public abstract class Logger implements Comparable<Logger>{

    Level level;

    String name;

    public abstract void notify(Message m);

    @Override
    public int compareTo(Logger o) {
        return this.name.compareTo(o.getName());
    }

    protected String getName(){
        return this.name;
    }

    protected Level getLevel(){
        return this.level;
    }
}