package lab367449.people;

import lab367449.enums.DeterminativePronouns;
import lab367449.enums.Things;
import lab367449.people.speech.DirectSpeech;

public class Bet extends Person implements DirectSpeech {
    public Bet(String name) {
        super(name);
    }

    public void CantStand (DeterminativePronouns witch){
        out = ", " + witch.getName() + " " + this.name +" не выносит, - ";
    }
    public void Vomit(DeterminativePronouns witch, Things thing){
        out = " от " + witch.getName() + " " + thing.getName();
     }

    @Override
    public void describe() {
        System.out.print(out);
        out = "";

    }

    @Override
    public void asks (String phrase){

    }

    @Override
    public void speak(String phrase) {

    }
}
