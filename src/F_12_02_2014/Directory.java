package F_12_02_2014;

import java.util.ArrayList;
import java.util.Date;

public class Directory extends FileElement {

    ArrayList<FileElement> content;

    public Directory(Date creation_date, String creator){

        content = new ArrayList<>();
        this.creation_date = creation_date;
        this.creator = creator;
    }

    @Override
    public float getSize() {
        float out = 0f;
        for(FileElement element: content)
            out += element.getSize();

        return out;
    }

    public void setContent(ArrayList<FileElement> new_content){
        this.content = (ArrayList<FileElement>) new_content.clone();
    }

    @Override
    public ArrayList<FileElement> search(Condition condition) {
        ArrayList<FileElement> result = new ArrayList<>();

        for(FileElement element: content)
            result.addAll(element.search(condition));

        if  (condition.isSatisfiedBy(this))
            result.add(this);

        return result;
    }

    @Override
    public FileElement clone() {
        Directory out = new Directory(this.creation_date, this.creator);
        ArrayList<FileElement> out_content = (ArrayList<FileElement>) this.content.clone();
        out.setContent(out_content);

        return out;
    }
}
