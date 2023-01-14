package lab367449.people;

import lab367449.people.speech.DirectSpeech;

public class Bet extends Person implements DirectSpeech {
    public Bet(String name) {
        super(name);
    }

    @Override
    public void describe() {

    }

    @Override
    public void asks (String phrase){
        System.out.println("Спрашивала");

    }

    @Override
    public void speak(String phrase) {

    }
}
