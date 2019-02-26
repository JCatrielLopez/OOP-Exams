package F_12_02_2014;

import java.util.ArrayList;
import java.util.Date;

public abstract class FileElement implements Cloneable{

    String path_name;
    float size;
    Date creation_date;
    String creator;

    public abstract float getSize();

    public String getPath_name() {
        return path_name;
    }

    public void setPath_name(String path_name) {
        this.path_name = path_name;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public String getCreator() {
        return creator;
    }

    public abstract ArrayList<FileElement> search(Condition condition);

    public abstract FileElement clone();
}
