package F_07_08_2015.decorator;

import java.util.ArrayList;

public class SimpleQueue extends QueueDecorator {

    ArrayList<Object> content;

    public SimpleQueue(Queue queue) {
        super(queue);
    }

    @Override
    public Object get(Integer index) {
        return this.content.get(index);
    }

    @Override
    public void add(Object element) {
        this.content.add(element);
    }

}
