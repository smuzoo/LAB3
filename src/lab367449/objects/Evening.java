package lab367449.objects;

import lab367449.enums.DeterminativePronouns;

public class Evening extends Anything {
    private DeterminativePronouns condition;
    public Evening(String name, DeterminativePronouns condition){
        super(name);
        this.condition = condition;
    }

}
