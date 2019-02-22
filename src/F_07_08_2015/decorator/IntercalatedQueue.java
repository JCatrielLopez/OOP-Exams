package F_07_08_2015.decorator;


public class IntercalatedQueue extends QueueDecorator {

    Integer last_index;

    public IntercalatedQueue(Queue queue) {
        super(queue);
    }

    @Override
    public Object get(Integer index) {

        if ((last_index+2) > super.queue.size())
            last_index = 0;
        else{
            last_index+=2;
        }

        return super.get(last_index);
    }

    @Override
    public void add(Object element) {
        super.add(element);
    }
}
