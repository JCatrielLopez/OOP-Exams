/* NO LONGER NECESARY

package F_12_03_2014;

public class SpecialAccount extends Account {

    float limit;

    public SpecialAccount(String id, float initial_balance){
        this.id_cliente = id;
        this.balance = initial_balance;
    }


    @Override
    public boolean addTransaction(Transaction transaction) {
        if ((this.balance - transaction.getAmount()) >= 0f){
            this.transactions.add(transaction);
            this.balance -= transaction.getAmount();
            return true;
        }
        else
            return false;
    }


}
*/