package lab367449.objects;

import lab367449.interfaces.Adverb;

public abstract class Anything implements Adverb {
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
    public void describe(){

        System.out.println(out);
    };

}
