package F_11_03_2015;

public class ActionAND implements Action {

    Action action_1;
    Action action_2;

    public ActionAND(Action action, Action action_2){
        this.action_1 = action;
        this.action_2 = action_2;
    }

    @Override
    public void execute() {
        this.action_1.execute();
        this.action_2.execute();
    }
}
