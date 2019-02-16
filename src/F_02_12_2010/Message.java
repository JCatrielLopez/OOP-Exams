package F_02_12_2010;

public class Message {

    Level level;
    String content;

    public Message(Level level, String content){
        this.level = level;
        this.content = content;
    }

    public Level getLevel() {

        return this.level;
    }

    public String getContent() {
        return this.content;
    }
}
