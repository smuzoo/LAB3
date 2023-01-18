package lab367449.objects;


public abstract class AnythingReal {
    protected String name;
    protected String out_thing = null;

    public AnythingReal(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public abstract void exist(

    );

/*    String out = null;
    public abstract void describe();*/

}
