package F_07_08_2015.decorator;

import java.util.Random;

public class RandomQueue extends QueueDecorator {

    float random_prob;

    public RandomQueue(Queue queue, float random) {
        super(queue);
        this.random_prob = random;
    }

    @Override
    public Object get(Integer index) {
        float probability = new Random().nextFloat();

        if (probability > this.random_prob)
            return super.get(index);
        else{
            return new Random().nextInt();
        }
    }

    @Override
    public void add(Object element) {
        float probability = new Random().nextFloat();

        if (probability > this.random_prob)
            super.add(element);
        else{
            super.add(new Random().nextInt());
        }
    }
}
