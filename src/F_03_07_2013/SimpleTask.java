package F_03_07_2013;

import java.util.ArrayList;

public class SimpleTask extends Task {

    ArrayList<Resource> resources;
    Integer cte;
    Integer execution_time;
    ResourceManager resource_manager;

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
        return this.resource_manager.getCosto();
    }

    public void addResource(Resource r) throws Exception {
        this.resource_manager.addResource(r);
    }

    public void removeResource(Resource r) throws Exception {
        this.resource_manager.removeResource(r);
    }
}
