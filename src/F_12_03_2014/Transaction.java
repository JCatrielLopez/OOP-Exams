package F_12_03_2014;

import java.util.Date;

public class Transaction {

    Account origin;
    float amount;
    Account recipient;

    Date date;

    public Transaction(Account origin, Account recipient, float amount, Date date){
        this.origin = origin;
        this.recipient = recipient;
        this.amount = amount;
        this.date = date;
    }

    public float getAmount() {
        return this.amount;
    }

    public Account getOrigin(){
        return this.origin;
    }

    public Account getRecipient(){
        return this.recipient;
    }

    public Date getDate() {
        return date;
    }
}
