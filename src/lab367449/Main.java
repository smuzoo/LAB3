package lab367449;

import lab367449.enums.DeterminativePronouns;
import lab367449.enums.Things;
import lab367449.enums.Time;
import lab367449.objects.Evening;
import lab367449.people.Ghost;

public class Main {
    public static void main(String[] args) {

        System.out.println("Танец с драконами. Искры над пеплом, Отрывок");
        Ghost ghost = new Ghost("призрак");
        ghost.bring(Things.CUPOFMILK,DeterminativePronouns.EACH, Time.EVENING, Time.DINNER);
        ghost.describe();

        ghost.speak("Пока тьма не станет для тебя столь же милой, как свет, или пока сама не попросишь. Попроси - и прозреешь");
        ghost.describe();

    }
}


