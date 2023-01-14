package lab367449.people;

public abstract class Person {
    protected String name;
    public Person(String name){
        this.name = name;
    }
    public abstract void describe();
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }



}
