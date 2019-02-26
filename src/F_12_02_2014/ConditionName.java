package F_12_02_2014;

public class ConditionName implements Condition {

    String name;

    public ConditionName(String name){
        this.name = name;
    }

    @Override
    public boolean isSatisfiedBy(FileElement file) {
        return file.getPath_name().equals(this.name);
    }
}
