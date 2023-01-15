package lab367449.objects;


public abstract class Anything  {
    protected String name;
    String out = null;
    public Anything(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }


    public abstract void describe();

}
