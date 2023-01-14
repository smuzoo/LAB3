package lab367449.people;

import lab367449.enums.DeterminativePronouns;
import lab367449.enums.Things;
import lab367449.enums.Time;
import lab367449.people.speech.DirectSpeech;

public class Ghost  extends Person implements DirectSpeech {
    public Ghost(String name) {
        super(name);
    }

    public void bring (Things thing, DeterminativePronouns frequency, Time when, Time where){
        out = frequency.getName() + " " + when.getName() + " " + where.getName() + " " + this.name +" приносит "+  thing.getName()+ " и " ;
    }

    public void order(){
        out = "велит выпить. ";
    }

    @Override
    public void describe() {
        System.out.print(out);
        out = "";
    }

    @Override
    public void asks(String phrase) {

    }

    @Override
    public void speak(String pharse) {
    out = "«" + pharse + "»";

    }
}
