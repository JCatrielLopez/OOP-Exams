package F_11_03_2011;

import java.util.ArrayList;

public class SimpleMemory extends Memory {

    ArrayList<Byte> content;

    public SimpleMemory(){
        this.content = new ArrayList<>();
    }

    @Override
    public boolean write(Integer position, Byte data) {
        this.total_access++;
        if (position < this.content.size())
            return false;
        else
            this.content.add(position, data);

        return true;
    }

    @Override
    public Byte read(Integer position) throws Exception {
        this.total_access++;
        return this.content.get(position);
    }

    @Override
    public Integer size() {
        return this.content.size();
    }

    @Override
    public Integer getTotalAccess() {
        return this.total_access;
    }
}
