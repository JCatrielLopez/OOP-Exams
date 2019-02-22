package F_11_03_2016;

import java.util.Random;

public class ErrorMemory extends Memory {

    Memory memory;
    float error_prob;

    public ErrorMemory(Memory memory, float error_prob){
        this.memory = memory;
        this.error_prob = error_prob;
    }

    @Override
    public boolean write(Integer position, Byte data) throws Exception {
        float prob = new Random().nextFloat();
        if (prob < error_prob) {
            byte[] b = new byte[1];
            new Random().nextBytes(b);
            return this.memory.write(position, b[new Random().nextInt(b.length)]);
        }
        else
            return this.memory.write(position, data);
    }

    @Override
    public Byte read(Integer position) throws Exception {
        float prob = new Random().nextFloat();
        if (prob < error_prob) {
            byte[] b = new byte[1];
            new Random().nextBytes(b);
            return b[new Random().nextInt(b.length)];
        }
        else
            return this.memory.read(position);
    }

    @Override
    public Integer size() {
        return this.memory.size();
    }

    @Override
    public Integer getTotalAccess() {
        return this.memory.getTotalAccess();
    }
}
