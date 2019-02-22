package F_11_03_2016;

public class VerificationMemory extends Memory {

    Memory memory;

    public VerificationMemory(Memory memory){
        this.memory = memory;
    }

    @Override
    public boolean write(Integer position, Byte data) throws Exception {
        return this.memory.write(position, data);
    }

    @Override
    public Byte read(Integer position) throws Exception {
        if (position < this.size())
            return this.memory.read(position);
        else
            throw new Exception("MEMORY ACCESS EXCEPTION: NOT A VALID READING ADDRESS >:( ");
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
