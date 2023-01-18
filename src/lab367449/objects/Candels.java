package lab367449.objects;

import lab367449.enums.Adjectives;
import lab367449.enums.Things;

public class Candels extends AnythingReal{
    String contain;
    public Candels(String name) {
        super(name);
    }
    public void smell(Adjectives adjectives1, Adjectives adjectives2, Adjectives adjectives3, Things things){
        out_thing =" "+ adjectives1.getName()+ this.name + " пахли "+ adjectives2.getName() + " пускали "+ adjectives3.getName() + " "+ things.getName();
    }


    @Override
    public void exist() {
        System.out.print(out_thing);
        out_thing = "";
    }
}
