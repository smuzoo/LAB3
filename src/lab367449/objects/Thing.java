package lab367449.objects;

import lab367449.enums.*;
import lab367449.interfaces.*;



public class Thing extends Anything implements IAdv{
    public Condition condition;
    public String name;
    public Place place;

    public Thing(String name, Place place){
        this.name = name;
        this.place = place;
    }
    abstract void getConditionThong();
    abstract void getPlace();
}
