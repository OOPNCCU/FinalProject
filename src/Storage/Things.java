package Storage;

import java.util.ArrayList;
import Equipment.*;

public class Things {
    private String name;
    private ArrayList<Thing> group;

    public Things(String name){
        this.name = name;
        this.group = new ArrayList<>();
    }

    public void addThing(Thing t){
        this.group.add(t);
    }

    public int totalNumber(){
        int total = 0;
        for(Thing t: group){
            if(t.getUsable()){
                total++;
            }
        }
        return total;
    }
}
