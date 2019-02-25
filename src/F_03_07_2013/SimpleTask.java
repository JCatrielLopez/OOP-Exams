package F_03_07_2013;

import sun.rmi.runtime.Log;

import java.util.ArrayList;

public class SimpleTask extends Task {

    ArrayList<Resource> resources;
    Integer cte;
    Integer execution_time;

    public SimpleTask(String name, Integer cte) {
        this.name = name;
        this.resources = new ArrayList<>();
        this.length = 0;
        this.cost = 0f;
        this.cte = cte;
        this.execution_time = 0; // Se modifica cuando la tarea esta en ejecucion.
        this.state = States.WAITING;
    }

    @Override
    public Integer getLength() {
        return this.length;
    }

    @Override
    public float getCost() {
        switch (state) {
            case WAITING:
                return this.cte;
//            case ON_HOLD:
//                return log(this.cost);
            case PROCESSING:
                return this.cost * this.execution_time / this.getLength();
            case EXECUTED:
                return this.cost + this.cte;
        }

        return 0;
    }

    public void addResource(Resource r) throws Exception {
        switch (state) {
            case WAITING:
                this.resources.add(r);
                this.cost += r.getCost();
                this.length++;
                break;
            case ON_HOLD:
                if (r.getCost() < 0.1 * this.getCost()) {
                    this.resources.add(r);
                    this.cost += r.getCost();
                    this.length++;
                }
                break;
            case PROCESSING:
                throw new Exception("CANNOT ADD RESOURCES TO A PROCESSING TASK.");
            case EXECUTED:
                break;
        }
    }

    public void removeResource(Resource r) throws Exception {
        switch (state) {
            case WAITING:
                this.resources.remove(r);
                this.cost -= r.getCost();
                this.length--;
                break;
            case ON_HOLD:
                for(Resource res: this.resources){
                    if (res.getDescription().equals(r.getDescription()))
                        if ((res.getAmount() - r.getAmount()) > 0)
                            res.setAmount(res.getAmount() - r.getAmount());
                }
                break;
            case PROCESSING:
                throw new Exception("CANNOT ADD RESOURCES TO A PROCESSING TASK.");
            case EXECUTED:
                break;
        }
    }
}
