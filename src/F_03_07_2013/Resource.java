package F_03_07_2013;

public class Resource {

    Integer amount;
    String description;
    float cost;

    public Resource(Integer amount, String description, float cost) {
        this.amount = amount;
        this.description = description;
        this.cost = cost;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
