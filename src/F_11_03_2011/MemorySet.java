package F_11_03_2011;

import java.util.ArrayList;

public class MemorySet extends Memory {

    ArrayList<Memory> memories;

    public MemorySet(){
        this.memories = new ArrayList<>();
    }

    @Override
    public boolean write(Integer position, Byte data) {
        Integer temp_size = this.memories.get(0).size();

        if (position < temp_size) {
            return this.memories.get(0).write(position, data);
        }
        else {
            for (Memory memory : memories) {
                if (position < temp_size) {
                    return memory.write(position - temp_size, data);
                }
                else
                    temp_size += memory.size();
            }

            return false;
        }
    }

    @Override
    public Byte read(Integer position) throws Exception {
        Integer temp_size = this.memories.get(0).size();

        if (position < temp_size) {
            return this.memories.get(0).read(position);
        }
        else {
            for (Memory memory : memories) {
                if (position < temp_size) {
                    return memory.read(position - temp_size);
                }
                else
                    temp_size += memory.size();
            }

            return null;
        }
    }

    @Override
    public Integer size() {
        Integer out = 0;

        for(Memory m: memories)
            out += m.size();

        return out;
    }

    @Override
    public Integer getTotalAccess() {
        Integer out = 0;
        for(Memory memory: memories)
            out += memory.getTotalAccess();

        return out;
    }
}
