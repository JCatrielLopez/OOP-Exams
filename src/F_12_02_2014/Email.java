package F_12_02_2014;

import java.util.ArrayList;
import java.util.Date;

public class Email extends File {

    String title;
    String content;

    public Email(String recipient, String origin, Date creation_date, float size, String title, String content) {
        super(size, creation_date, origin);
        this.title = title;
        this.content = content;
    }

    @Override
    public FileElement clone() {
        return null; //TODO
    }
}
