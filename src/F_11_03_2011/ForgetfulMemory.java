package F_11_03_2011;

import java.util.ArrayList;
import java.util.HashMap;

public class ForgetfulMemory extends Memory{

    Memory memory;
    ArrayList<HashMap<Integer, Byte>> last_actions;
    Integer forgetfulness;
    int last_index;


    public ForgetfulMemory(Memory memory, Integer forgetfulness){
        this.memory = memory;
        this.last_actions = new ArrayList<>(forgetfulness); //WriteID: <Position, Byte>
        this.last_index = 0;
        this.forgetfulness = forgetfulness;
    }

    @Override
    public boolean write(Integer position, Byte data) throws Exception {
        HashMap<Integer, Byte> old_data = new HashMap<>();
        old_data.put(position, this.memory.read(position));

        if ((last_index+1) > this.forgetfulness)
            last_index = 0;
        else
            last_index++;

        last_actions.add(last_index, old_data);

        if (!this.memory.write(position, data)) {
            last_actions.remove(last_index);
            return false;
        }

        return true;

    }

    @Override
    public Byte read(Integer position) throws Exception {
        return this.memory.read(position);
    }

    @Override
    public Integer size() {
        return null;
    }

    @Override
    public Integer getTotalAccess() {
        return null;
    }

    public void forget() throws Exception {
        boolean result = false;

        HashMap<Integer, Byte> old_data = last_actions.get(last_index);

        for(Integer position: old_data.keySet())
            result = this.memory.write(position, old_data.get(position));

        if (result)
            last_index--;
    }
}
