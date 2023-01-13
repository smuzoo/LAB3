package objects;

import enums.*;
import interfaces.*;


public abstract class Thing implements IAdv{
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
