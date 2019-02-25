package F_03_07_2013;

import java.util.ArrayList;

public class GroupTask extends Task {

    ArrayList<Task> tasks;

    public GroupTask(String name, ArrayList<Task> tasks) {
        this.name = name;
        this.tasks = tasks;
        this.state = tasks.get(tasks.size()-1).getState();
    }

    @Override
    public Integer getLength() {
        Integer out = 0;
        for(Task t: tasks)
            out += t.getLength();

        return out;
    }

    @Override
    public float getCost() {
        float out = 0f;
        for(Task t: tasks)
            out += t.getCost();

        return out;
    }

    public void addTask(Task t){
        this.tasks.add(t);
        this.state = t.getState();
    }

    public void removeTask(Task t){
        this.tasks.remove(t);
        this.state = this.tasks.get(tasks.size()-1).getState();
    }
}
