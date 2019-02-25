package F_07_08_2015.decorator;

import java.util.ArrayList;

public class SimpleQueue implements Queue {

    ArrayList<Object> content;

    public SimpleQueue() {
        this.content = new ArrayList<>();
    }

    @Override
    public Object get(Integer index) {
        return this.content.get(index);
    }

    @Override
    public void add(Object element) {
        this.content.add(element);
    }

    @Override
    public int size() {
        return this.content.size();
    }

}
