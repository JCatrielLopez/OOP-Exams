package F_07_08_2015;

import java.util.Stack;

public class SimpleQueue implements Queue {

    Stack<Object> content;

    @Override
    public Object get() {
        return this.content.pop();
    }

    @Override
    public void add(Object element) {
        this.content.add(element);
    }

    @Override
    public Integer size() {
        return content.size();
    }

    @Override
    public Queue getMaxQueue() {
        return this;
    }

    @Override
    public Integer terminalAmount() {
        return 1;
    }
}
