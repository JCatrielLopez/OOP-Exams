package F_13_02_2013;

import java.util.ArrayList;
import java.util.HashMap;

public class SingleUser extends User {

    HashMap<Content, Group> content; //map[Contenido] = [usuarios bloqueados para ese contenido]

    public SingleUser(){
        this.content = new HashMap<>();
    }

    public void publish(Content content){
        this.content.put(content, new Group());
    }

    public void block(User user){
        for(Content content: this.content.keySet())
            if (!this.content.get(content).contains(user))
                this.content.get(content).add(user);
    }

    public void block(User user, Content content){
        if (!this.content.get(content).contains(user))
            this.content.get(content).add(user);
    }

    public void unblock(User user){
        for(Content content: this.content.keySet())
            if (this.content.get(content).contains(user))
                this.content.get(content).remove(user);
    }

    public void unblock(User user, Content content){
        if (this.content.get(content).contains(user))
            this.content.get(content).remove(user);
    }

    public ArrayList<Content> seePublications(User user){  // OtherUser.seePublications(myself)
        ArrayList<Content> out = new ArrayList<>();
        for(Content content: this.content.keySet())
            if(!this.content.get(content).contains(user))
                out.add(content);

        return out;
    }

}
