package F_03_07_2013;

import java.util.ArrayList;

public class RMHOLD implements ResourceManager {

    ArrayList<Resource> resources;
    float cost;

    public RMHOLD(ArrayList<Resource> resources){
        this.resources = (ArrayList<Resource>) resources.clone();
    }


    @Override
    public void addResource(Resource r) {
        if (r.getCost() < 0.1 * this.getCosto()) {
            this.resources.add(r);
            this.cost += r.getCost();
        }
    }

    @Override
    public void removeResource(Resource r) {
        for(Resource res: this.resources) {
            if (res.getDescription().equals(r.getDescription()))
                if ((res.getAmount() - r.getAmount()) > 0)
                    res.setAmount(res.getAmount() - r.getAmount());
        }
    }

    @Override
    public float getCosto(){
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
