package F_12_03_2014;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Account {

    String id_cliente;
    float balance;
    float limit;
    ArrayList<Transaction> transactions;
    boolean open;

    public abstract boolean addTransaction(Transaction transaction);

    public boolean removeTransaction(Transaction transaction){
        if (this.open)
            if (transactions.contains(transaction)) {
                transactions.remove(transaction);
                this.balance += transaction.getAmount();
                return true;
            }

        return false;
    }

    public void setLimit(float new_limit){
        this.limit = new_limit;
    }

    public void open(){
        this.open = true;
    }

    public void close(){
        this.open = false;
    }

    public boolean isOpen(){
        return this.open;
    }

    public ArrayList<Transaction> search(Condition condition) {

        ArrayList<Transaction> result = new ArrayList<>();
        for(Transaction transaction: transactions)
            if (condition.isSatisfiedBy(transaction))
                result.add(transaction);

        return result;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    @Override
    public boolean equals(Object o){
        return this.id_cliente.equals(((Account) o).getId_cliente());
    }
}
