package F_07_08_2015.decorator;

public class QueueDecorator implements Queue {

    protected Queue queue;

    public QueueDecorator(Queue queue){
        this.queue = queue;
    }

    @Override
    public Object get(Integer index) {
        return this.queue.get(index);
    }

    @Override
    public void add(Object element) {
        this.queue.add(element);
    }

    @Override
    public int size() {
        return this.queue.size();
    }
}
