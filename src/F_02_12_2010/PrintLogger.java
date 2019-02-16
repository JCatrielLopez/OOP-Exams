package F_02_12_2010;

public class PrintLogger extends Logger {


    public PrintLogger(String name, Level level, LoggerCollection col){

        this.level = level;
        this.name = name;
        col.addLogger(this);
    }


    @Override
    public void notify(Message m) {

        if ((m.getLevel().compareTo(this.level)) >= 0){
            System.out.printf("[%s] %s", this.level, m.getContent());
        }
    }


}
