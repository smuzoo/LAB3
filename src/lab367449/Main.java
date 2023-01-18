package lab367449;

import lab367449.enums.*;
import lab367449.objects.*;
import lab367449.people.*;

public class Main {
    public static void main(String[] args) throws Throwable {

        System.out.println("Танец с драконами, искры над пеплом, Отрывок");
        Ghost ghost = new Ghost("призрак");
        Bet bet = new Bet("Бэт", "она", "рука", "губы", " кончик мизинца");
        Drinking drinking = new Drinking("питья");
        Day day = new Day(0);
        They they = new They("они");
        Rock rock = new Rock(" скала", "на которой стоит Черно-Белый Дом");
        Lessions lession = new Lessions("урок", ", за которым последовали другие. ", " - зелья и яды ", " - языки. ", " игра с призраком в «верю - не верю». ");
        KindMan kindMan = new KindMan("добрый человек");
        Umma umma = new Umma("Умма");
        Candels candels = new Candels("свечи");
        Servants servants = new Servants("слуг");
        Novices novices = new Novices("послушников");
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
        lession.be(Adjectives.VERY, Adjectives.FIRST);
        lession.beCurrent1(Time.INTHEDAYTIME);
        lession.exist();
        lession.informationAboutLession1();
        lession.exist();
        bet.burn(Frequency.EVERYTIME);
        bet.describe();
        lession.beCurrent2(Time.DINNER);
        lession.exist();
        bet.understand(Languages.BRAAVOSSKY, Adjectives.GOOD);
        bet.describe();
        bet.getRidOf(Adjectives.ALMOST, Adjectives.BARBARIAN, Things.ACCENT);
        bet.describe();
        kindMan.was(Adjectives.UNHAPPY);
        kindMan.describe();
        kindMan.demanded(Adjectives.CLASSICAL, bet, Languages.VALYRIAN, Things.DIALET);
        kindMan.describe();
        lession.beCurrent3(Time.EVENING);
        lession.exist();
        bet.scream(Frequency.ATFIRST, Things.ANNOYANCE);
        bet.describe();
        bet.learn(Time.AFTER, Things.LIE, Things.TENSION, Things.MUSCLE);
        bet.describe();
        bet.keep(Things.DUTIES);
        bet.describe();
        bet.bumpInto(Things.FURNITURE, Things.WALLS);
        bet.describe();
        bet.drop(Things.TRAYS);
        bet.describe();
        bet.wander(Place.TEMPLE,Adjectives.HOWINFOREST );
        bet.describe();
        kindMan.speak("Зрение - лишь одно чувство из пяти, - говорил добрый человек. - Научишься пользоваться четырьмя остальными, меньше шишек будешь себе набивать");
        bet.feel(Time.NOW, Things.SKIN, Things.WIND);
        bet.describe();
        bet.find(Things.SMELL, Place.KITCHEN);
        bet.describe();
        bet.foundOut(umma, Things.STEPS, servants, novices, ghost, kindMan);
        bet.describe();
        candels.smell(Adjectives.BURNED, Adjectives.DIFF, Adjectives.SPECIAL, Things.SMOKE);
        candels.exist();












    }
}


