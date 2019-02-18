package F_11_03_2015;

import java.util.ArrayList;
import java.util.TreeSet;

public class Identifier {

    TreeSet<Gesture> gestures;
    ArrayList<Condition> conditions;
    Action action;
//  ArrayList<Action> actions; // Solucion menos flexible!


    public Identifier(GestureComparator comparator, ArrayList<Condition> conditions){
        gestures = new TreeSet<>(comparator);
        this.conditions = (ArrayList<Condition>) conditions.clone();
    }

    public void addGesture(Gesture gesture){
        this.gestures.add(gesture);
    }

    public void removeGesture(Gesture gesture){
        this.gestures.remove(gesture);
    }

    public void addCondition(Condition c){
        this.conditions.add(c);
    }

    public void removeCondition(Condition c){
        this.conditions.remove(c);
    }

    public void removeCondition(Integer index){
        this.conditions.remove(index);
    }

    public void identify(){
        for(Gesture gesture: gestures){
            for(Condition condition: conditions){
                if (condition.isSatisfied(gesture))
                    // doSomething(); //Solucion menos flexible!
                    execute();
            }
        }
    }

    public void setAction(Action action){
        this.action = action;
    }

    public void execute(){
        this.action.execute();
    }


//    Solucion menos flexible:
//    public void doSomething(){
//        for(Action action: actions)
//            action.execute();
//    }
}
