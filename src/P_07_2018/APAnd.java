package P_07_2018;

public class APAnd implements AcceptancePolicy{

    AcceptancePolicy a1;
    AcceptancePolicy a2;

    public APAnd(AcceptancePolicy a1, AcceptancePolicy a2){
        this.a1 = a1;
        this.a2 = a2;
    }

    @Override
    public boolean accepts() {
        return (a1.accepts() && a2.accepts());
    }
}
