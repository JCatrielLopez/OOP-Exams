package F_03_07_2013;

import java.util.ArrayList;

public class ResourceManagerWaiting implements ResourceManager {

    ArrayList<Resource> resources;
    float cost;

    public ResourceManagerWaiting(ArrayList<Resource> resources){
        this.resources = (ArrayList<Resource>) resources.clone();
    }


    @Override
    public void addResource(Resource r) {
        this.resources.add(r);
        this.cost += r.getCost();
    }

    @Override
    public void removeResource(Resource r) {
        this.resources.remove(r);
        this.cost -= r.getCost();
    }

    @Override
    public float getCosto() {
        float out = 0f;
        for(Resource r: resources)
            out += r.getCost();

        return out;
    }

    @Override
    public Integer getSize() {
        return this.resources.size();
    }
}
