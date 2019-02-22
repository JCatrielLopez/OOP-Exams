package F_11_03_2016;

public abstract class Memory {

    Integer total_access;

    public abstract boolean write(Integer position, Byte data) throws Exception;

    public abstract Byte read(Integer position) throws Exception;

    public abstract Integer size();

    public abstract Integer getTotalAccess();
}
