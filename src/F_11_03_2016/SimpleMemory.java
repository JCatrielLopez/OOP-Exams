package F_11_03_2016;

import java.util.ArrayList;

public class SimpleMemory extends Memory {

    ArrayList<Byte> content;

    public SimpleMemory(Integer size){
        this.total_access = 0;
        this.content = new ArrayList<>(size);
        byte def = 0;
        for(int i = 0; i < size; i++)
            this.content.add(i, def);
    }

    @Override
    public boolean write(Integer position, Byte data) {
        this.total_access++;
        if (position > this.content.size())
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
