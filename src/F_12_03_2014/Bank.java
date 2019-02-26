package F_12_03_2014;

import java.util.ArrayList;

public class Bank {

    ArrayList<Account> accounts;

    public Bank(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public ArrayList<Account> getAccounts() {
        return (ArrayList<Account>) accounts.clone();
    }

    public ArrayList<Transaction> search(Condition condition){
        ArrayList<Transaction> result = new ArrayList<>();

        for(Account account: accounts)
            result.addAll(account.search(condition));

        return result;
    }
}
