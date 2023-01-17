package lab367449;

import lab367449.enums.*;
import lab367449.objects.Day;
import lab367449.objects.Drinking;
import lab367449.objects.Lession;
import lab367449.objects.Rock;
import lab367449.people.Bet;
import lab367449.people.Ghost;
import lab367449.people.They;

public class Main {
    public static void main(String[] args) throws Throwable {

        System.out.println("Танец с драконами, искры над пеплом, Отрывок");
        Ghost ghost = new Ghost("призрак");
        Bet bet = new Bet("Бэт", "она", "рука");
        Drinking drinking = new Drinking("питья");
        Day day = new Day(0);
        They they = new They("они");
        Rock rock = new Rock(" скала", "на которой стоит Черно-Белый Дом");
        Lession lession = new Lession("урок", ", за которым последовали другие. ");
        ghost.bring(Things.CUPOFMILK,DeterminativePronouns.EACH, Time.EVENING, Time.DINNER);
        ghost.describe();
        //bet.hearingIncrease(new Day(1));
        //слух так не улучшается пока молоко не выпито
        ghost.order();
        ghost.describe();
        //drinking.taste(Adjectives.STRANGE, Adjectives.BITTER);
        //drinking.describe();
        bet.cantStand(DeterminativePronouns.WITCH);
        bet.describe();
        bet.vomit(DeterminativePronouns.ONE, Things.SMELL);
        bet.describe();
        bet.drink(Frequency.EVERYTIME, DeterminativePronouns.ALL, Adjectives.EVERYDROP, Things.CUPOFMILK, Things.DRINKING, Adjectives.STRANGE, Adjectives.BITTER, Things.TASTE);
        bet.describe();
        /*for (int i = 1; i<200; i++) {
            bet.hearingIncrease(day);
            day.nextDay();
        }*/
        //максимум слуха достигнут

        //bet.hearingIncrease(new Day(-1));
        //только 1 раз в день

        bet.asks("Долго мне еще быть слепой");
        bet.describe();
        ghost.speak("Пока тьма не станет для тебя столь же милой, как свет, или пока сама не попросишь. Попроси - и прозреешь");
        ghost.describe();
        bet.hearingIncrease(day);
        bet.describe();
        bet.beg();
        bet.describe();
        they.banish(bet);
        they.describe();
        bet.speak("Нет уж, лучше слепой побыть.");
        bet.wakeUp(Time.WHEN, Frequency.FIRSTTIME, Adjectives.BLIND);
        bet.describe();
        ghost.take(bet);
        ghost.describe();
        ghost.lead(rock, Adjectives.THROUGH, Place.UP, Place.TEMPLE);
        ghost.describe();
        ghost.speak("Считай ступени и придерживайся за стену, - говорила она, пока они шли. - Там есть\n" +
                "зарубки - глазу они незаметны, но пальцы их чувствуют.");
        ghost.describe();
        lession.exist(Adjectives.VERY, Adjectives.FIRST);



    }
}


