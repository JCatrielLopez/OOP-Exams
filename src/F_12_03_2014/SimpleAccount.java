package F_12_03_2014;


public class SimpleAccount extends Account {

    public SimpleAccount(String id, float initial_balance){
        this.id_cliente = id;
        this.balance = initial_balance;
        this.limit = 0f;
        this.open = true;
    }

    @Override
    public boolean addTransaction(Transaction transaction) {
        if (this.open)
            if ((this.balance - transaction.getAmount()) >= this.limit){
                this.transactions.add(transaction);
                this.balance -= transaction.getAmount();
                return true;
            }

        return false;
    }



    /*
        Por que tengo implementada una clase abstracta Account de la que hereda una clase SimpleAccount?
            - Al principio implemente esta estructura teniendo una clase SpecialAccount que verificara, al
                momento de agregar una transaccion, que la diferencia de su balance actual con la plata
                que vas a sacar no supere un cierto limite. Esto es lo mismo que hacia la SimpleAccount, simplemente
                que esta tenia el limite hardcodeado a 0f.
            - Decidi eliminar la clase SpecialAccount, poner el limite como uno de los datos de la clase Account y dejarla,
                si bien ya no es necesaria, para el caso futuro en el que se quiera agregar otro tipo de Account. Por
                ejemplo, una clase que defina un limite para las transacciones que se quieran borrar.
     */
}
