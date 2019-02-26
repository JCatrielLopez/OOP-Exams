package F_13_02_2013;

import java.util.ArrayList;

public class Group extends User {

    ArrayList<User> users;

    public Group(){
        this.users = new ArrayList<>();
    }

    public boolean contains(User user){
        return this.users.contains(user);
    }

    public void remove(User user){
        this.users.remove(user);
    }

    public void add(User user){
        this.users.add(user);
    }
}
