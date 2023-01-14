package lab367449.objects;

import lab367449.enums.Adjectives;

public class Drinking extends  Anything{
    public Drinking(String name) {
        super(name);
    }
    public void taste(Adjectives adj1, Adjectives adg2){
        out = "У " + this.name + " " + adj1.getName() + " " + adg2.getName() + " вкус";
    }

    @Override
    public void describe() {
        System.out.print(out);
        out = "";

    }
}
