package F_07_08_2015;

import java.util.ArrayList;

public class CompoundQueue implements Queue {

    ArrayList<Queue> content;
    IndexCalculator index_calculator;

//    Pto 3: Combinar las maneras de sacar y meter datos
//    IndexCalculator index_in;
//    IndexCalculator index_out;

    public CompoundQueue(IndexCalculator index_calculator){
        content = new ArrayList<>();
        this.index_calculator = index_calculator;
    }

    @Override
    public Object get() { // Aca usaria el index_out
        if (content.size() != 0) {
            Queue q = content.get(index_calculator.getIndex(content.size()));
            return q.get();
        }
        return null;
    }

    @Override
    public void add(Object element) { // Aca usaria el index_in;
        if (content.size() != 0) {
            Queue q = content.get(index_calculator.getIndex(content.size()));
            q.add(element);
        }
    }

    @Override
    public Integer size() {
        Integer out = 0;
        for(Queue q: content)
            out += q.size();

        return out;
    }

    @Override
    public Queue getMaxQueue() {
        Integer max_size = 0;
        Queue max_queue = null;
        for(Queue q: content)
            if (q.size() >= max_size)
                max_queue = q;

        return max_queue;
    }

    @Override
    public Integer terminalAmount() {
        Integer out = 0;
        for(Queue q: content)
            out += q.terminalAmount();

        return out;
    }

    public void addQueue(Queue q){
        this.content.add(q);
    }

    public void removeQueue(Queue q){
        this.content.remove(q);
    }

    public IndexCalculator getIndexCalculator(){
        return this.index_calculator;
    }

    public void setIndexCalculator(IndexCalculator index_calculator){
        this.index_calculator = index_calculator;
    }

}
