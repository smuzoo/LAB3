package lab367449;

import lab367449.enums.*;
import lab367449.objects.Day;
import lab367449.objects.Drinking;
import lab367449.people.Bet;
import lab367449.people.Ghost;

public class Main {
    public static void main(String[] args) throws Throwable {

        System.out.println("Танец с драконами. Искры над пеплом, Отрывок");
        Ghost ghost = new Ghost("призрак");
        Bet bet = new Bet("Бэт", "она");
        Drinking drinking = new Drinking("питья");
        Day day = new Day(0);

        ghost.bring(Things.CUPOFMILK,DeterminativePronouns.EACH, Time.EVENING, Time.DINNER);
        ghost.describe();
        //bet.hearingIncrease(new Day(1));
        ghost.order();
        ghost.describe();
        drinking.taste(Adjectives.STRANGE, Adjectives.BITTER);
        drinking.describe();
        bet.cantStand(DeterminativePronouns.WITCH);
        bet.describe();
        bet.vomit(DeterminativePronouns.ONE, Things.SMELL);
        bet.describe();
        bet.drink(Frequency.EVERYTIME, DeterminativePronouns.ALL, Adjectives.EVERYDROP, Things.CUPOFMILK);
        bet.describe();
        /*for (int i = 1; i<200; i++) {
            bet.hearingIncrease(day);
            day.nextDay();
        }*/
        //bet.hearingIncrease(new Day(-1));
        bet.asks(" «Долго мне еще быть слепой?» ");
        bet.describe();
        ghost.speak("Пока тьма не станет для тебя столь же милой, как свет, или пока сама не попросишь. Попроси - и прозреешь");
        ghost.describe();
        bet.beg();
        bet.describe();

    }
}


