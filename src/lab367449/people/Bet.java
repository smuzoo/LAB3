package lab367449.people;

import lab367449.enums.Adjectives;
import lab367449.enums.DeterminativePronouns;
import lab367449.enums.Frequency;
import lab367449.enums.Things;
import lab367449.people.speech.DirectSpeech;

public class Bet extends Person implements DirectSpeech {
    String pronoun;
    public Bet(String name, String pronoun) {
        super(name);
        this.pronoun = pronoun;

    }

    public void CantStand (DeterminativePronouns witch){
        out = ", " + witch.getName() + " " + this.name +" не выносит, - ";
    }
    public void Vomit(DeterminativePronouns witch, Things thing){
        out = " от " + witch.getName() + " " + thing.getName() + " " + this.pronoun + " начинает тошнить, -";
     }

     public void  Drink (Frequency frequency, DeterminativePronouns witch, Adjectives adj){
        out = "но " + this.pronoun + " " + frequency.getName() + " выпивает " + witch.getName()+ " " + adj.getName() + " и ";
     }
    @Override
    public void describe() {
        System.out.print(out);
        out = "";

    }

    @Override
    public void asks (String phrase){
        out = "спрашивает: " +  "«" + phrase + "»";
    }

    @Override
    public void speak(String phrase) {

    }
}
