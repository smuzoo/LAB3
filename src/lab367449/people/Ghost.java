package people;

import people.speech.IDirectSpeech;

public class Ghost  extends Person implements IDirectSpeech {
    public Ghost(String name) {
        super(name);
    }

    @Override
    public void asks() {

    }

    @Override
    public void speak() {

    }
}
