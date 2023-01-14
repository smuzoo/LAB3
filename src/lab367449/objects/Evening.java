package lab367449.objects;

import lab367449.enums.DeterminativePronouns;

public class Evening extends Anything {
    public String condition;
    public Evening(String name, String condition){
        super(name);
        this.condition = condition;
    }

    @Override
    public void describe() {
    out = DeterminativePronouns.EACH
    }
}
