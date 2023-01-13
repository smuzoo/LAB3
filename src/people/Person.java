package people;

import enums.*;


import java.util.Objects;

public abstract class Person {
    public String name;

    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

}
