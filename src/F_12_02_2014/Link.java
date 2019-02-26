package F_12_02_2014;

import java.util.ArrayList;
import java.util.Date;

public class Link extends FileElement{

    FileElement file;

    public Link(FileElement file, Date creation_date, String creator) {
        this.file = file;
        this.size = this.file.size;
        this.creation_date = creation_date;
        this.creator = creator;
    }

    @Override
    public float getSize() {
        return this.file.getSize();
    }

    @Override
    public ArrayList<FileElement> search(Condition condition) {
        return this.file.search(condition);
    }

    @Override
    public FileElement clone() {
        Link out = new Link(this.file, this.creation_date, this.creator);

        return out;
    }
}
