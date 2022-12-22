package people;

import people.speech.IDirectSpeech;

public class Bet extends Person implements IDirectSpeech {
    public Bet(String name) {
        super(name);
    }
    @Override
    public void asks (){
        System.out.println("Спрашивала");

    }

    @Override
    public void speak() {

    }
}
