package lab367449.people;

import lab367449.enums.*;
import lab367449.people.speech.DirectSpeech;

import static lab367449.enums.Things.CUPOFMILK;

public class Bet extends Person implements DirectSpeech {
    String pronoun;
    int vision;
    int hearing;
    public Bet(String name, String pronoun) {
        super(name);
        this.pronoun = pronoun;

    }

    public void cantStand(DeterminativePronouns witch){
        out = ", " + witch.getName() + " " + this.name +" не выносит, - ";
    }
    public void vomit(DeterminativePronouns witch, Things thing){
        out = " от " + witch.getName() + " " + thing.getName() + " " + this.pronoun + " начинает тошнить, -";
     }

     public void drink(Frequency frequency, DeterminativePronouns witch, Adjectives adj, Things things){
        out = "но " + this.pronoun + " " + frequency.getName() + " выпивает " + witch.getName()+ " " + adj.getName() + " и ";
         if (CUPOFMILK) {
             vision = 0;
             for (0 == vision; int i = 0; i++){
                 hearing+
             }
         }


     }

     public void beg(){
        out = " " + this.pronoun + " просит ";
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
