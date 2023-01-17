package lab367449.people;

import lab367449.enums.*;
import lab367449.objects.Rock;
import lab367449.people.speech.DirectSpeech;

public class Ghost  extends Person implements DirectSpeech {
    public Ghost(String name ) {
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
     public void take (Bet bet){
        out = this.name +" взяла " + bet.getPronoun() + " за " + bet.getPartOfBody();
     }
    public void lead (Rock rock, Adjectives adg1,
                      Place place1, Place place2 ){
        out = " повела " + adg1.getName() + " " + rock.getName() + " "+
                rock.getContain()+ " " + place1.getName()+ " " +place2.getName();
    }

    @Override
    public void asks(String phrase) {

    }

    @Override
    public void speak(String phrase) {
    out = " «" + phrase + "» ";

    }
}
