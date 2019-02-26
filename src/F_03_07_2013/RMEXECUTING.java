package F_03_07_2013;

import java.util.ArrayList;

public class RMEXECUTING implements ResourceManager {

    ArrayList<Resource> resources;
    float cost;
    private float execution_time;

    public RMEXECUTING(ArrayList<Resource> resources){
        this.resources = (ArrayList<Resource>) resources.clone();
        this.execution_time = 0f;
    }


    @Override
    public void addResource(Resource r) throws Exception {
        throw new Exception("CANNOT ADD RESOURCES TO A PROCESSING TASK.");
    }

    @Override
    public void removeResource(Resource r) throws Exception {
        throw new Exception("CANNOT REMOVE RESOURCES FROM A PROCESSING TASK.");
    }

    @Override
    public float getCosto(){
        float out = 0f;
        for(Resource r: resources)
            out += r.getCost();

        return out * this.execution_time / this.resources.size();
    }

    @Override
    public Integer getSize() {
        return this.resources.size();
    }
}
