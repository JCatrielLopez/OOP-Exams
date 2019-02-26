package F_12_02_2014;

import java.util.ArrayList;
import java.util.Date;

public class File extends FileElement {

    public File(float size, Date creation_date, String creator){
        this.size = size;
        this.creation_date = creation_date;
        this.creator = creator;
    }

    @Override
    public float getSize() {
        return this.size;
    }

    @Override
    public ArrayList<FileElement> search(Condition condition) {
        if (condition.isSatisfiedBy(this)){
            ArrayList<FileElement> result = new ArrayList<>();
            result.add(this);
            return result;
        }
        else
            return null;
    }

    @Override
    public FileElement clone() {
        File out = new File(this.size, this.creation_date, this.creator);
        return out;
    }


}
