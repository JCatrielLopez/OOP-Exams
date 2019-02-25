package F_02_12_2010;

public class LoggerDecorator extends Logger{

    Logger logger;

    public LoggerDecorator(Logger logger, LoggerCollection col){
        this.logger = logger;
        col.addLogger(this);
    }

    @Override
    public void notify(Message m) {
        this.logger.notify(m);
    }
}
