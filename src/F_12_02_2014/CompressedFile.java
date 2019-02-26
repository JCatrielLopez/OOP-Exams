package F_12_02_2014;

import java.util.ArrayList;
import java.util.Date;

public class CompressedFile extends Directory {

    float compression_factor;

    public CompressedFile(float compression_factor, Date creation_date, String creator){
        super(creation_date, creator);
        this.compression_factor = compression_factor;
        this.creation_date = creation_date;
        this.creator = creator;
    }

    @Override
    public float getSize(){
        return super.getSize() * this.compression_factor;
    }

    @Override
    public ArrayList<FileElement> search(Condition condition){
        ArrayList<FileElement> result = new ArrayList<>();

        for(FileElement element: content)
            result.addAll(element.search(condition));

        if (result.size() != 0)
            result.add(this);

        return result;
    }
}
