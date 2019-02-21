package F_11_07_2014;

public class SimpleDrug extends Drug {


    @Override
    public float getPercentage(String drug) {
        if (drug.equals(this.name))
            return 1f;
        else
            return 0f;
    }

}
