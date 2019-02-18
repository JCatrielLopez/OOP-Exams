package F_07_08_2015;

public interface Queue {

    Object get();
    void add(Object element);

    Integer size();
    Queue getMaxQueue();
    Integer terminalAmount();
}
