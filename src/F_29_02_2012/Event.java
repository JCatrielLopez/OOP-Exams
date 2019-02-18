package F_29_02_2012;

import java.util.Date;

public class Event {

    private String name;
    private Date date;

    public Event(String name, Date date){
        this.name = name;
        this.date = date;
    }

    public String getName(){
        return this.name;
    }

    public Date getDate(){
        return this.date;
    }

}
