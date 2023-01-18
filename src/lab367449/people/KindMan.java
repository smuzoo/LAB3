package lab367449.people;

import lab367449.enums.Adjectives;
import lab367449.enums.Languages;
import lab367449.enums.Things;
import lab367449.enums.Time;
import lab367449.people.speech.DirectSpeech;

public class KindMan extends Person implements DirectSpeech {
    public KindMan(String name) {
        super(name);
    }

    public void was(Adjectives adjectives){
        out = " " + this.name + " был " + adjectives.getName();
    }

    public void demanded(Adjectives adjectives, Bet bet, Languages languages, Things things){
        out = this.name + " требовал " + " " + bet.pronoun + " работала над " + adjectives.getName() + " " + languages.getName() + " учила " + things.getName();

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
    public void speak(String phrase) {
        out = " «" + phrase + "» ";

    }
}
