package lab367449;

public abstract class Anyting {
    protected String name;
    public Anyting(String name){
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
