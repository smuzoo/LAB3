package lab367449.objects;

import lab367449.enums.Adjectives;

public class Lession extends AnythingReal {

    String feature;
    public Lession(String name, String feature) {
        super(name);
        this.feature = feature;
    }
    public void exist(Adjectives adj1, Adjectives adj2 ){
        System.out.println(" Это был " + adj1.getName() + " "
                +adj2.getName() + " "+ this.name + " "+ this.feature );
    }

    @Override
    public void exist() {

    }
}
