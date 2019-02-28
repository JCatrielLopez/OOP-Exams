package P_07_2018;

public class APRecipeQueue implements AcceptancePolicy {

    Section section;
    Integer queue_size;

    public APRecipeQueue(Section section, Integer queue_size) {
        this.section = section;
        this.queue_size = queue_size;
    }

    @Override
    public boolean accepts() {
        return this.section.recipesLeft().equals(this.queue_size);
    }
}
