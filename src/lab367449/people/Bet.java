package lab367449.people;

import lab367449.enums.*;
import lab367449.exception.DidntDrinkMilk;
import lab367449.exception.SameDay;
import lab367449.exception.ToMuchHearing;
import lab367449.objects.Day;
import lab367449.people.speech.DirectSpeech;

import static lab367449.enums.Things.CUPOFMILK;

public class Bet extends Person implements DirectSpeech {
    String pronoun;
    private int countForBet = -1;
    protected int vision = 90;
    //от 1 до 100 и если больше 100, то ошибка
    protected int hearing = 70;
    public Bet(String name, String pronoun) {
        super(name);
        this.pronoun = pronoun;

    }
    public String getPronoun(){
        return this.pronoun;
    }

    public void cantStand(DeterminativePronouns witch){
        out = ", " + witch.getName() + " " + this.name +" не выносит, - ";
    }
    public void vomit(DeterminativePronouns witch, Things thing){
        out = " от " + witch.getName() + " " + thing.getName() + " " + this.pronoun + " начинает тошнить, -";
     }

     public void drink(Frequency frequency, DeterminativePronouns witch, Adjectives adj,
                       Things things1, Things things2, Adjectives adj1, Adjectives adg2, Things things3 ){
        out = "у " + things2.getName() + " " + adj1.getName() + " "+ adg2.getName() + " "+ things3.getName() + " но " +
                this.pronoun + " " + frequency.getName() + " выпивает " + witch.getName()+ " " + adj.getName() + " и ";
         if (things1 == CUPOFMILK) {
             vision = 0;
             out = "у " + things2.getName() + " " + adj1.getName() + " "+ adg2.getName() + " "+ things3.getName() + " но " + this.pronoun + " " + frequency.getName() + " выпивает " + witch.getName()+ " " + adj.getName() + " становиться слепой" + " и ";
         }


     }

     public void hearingIncrease(Day day) throws Throwable{


        Throwable possibility = new DidntDrinkMilk("Молоко не выпито");
        Throwable overflow = new ToMuchHearing("Слух не может повыситься ещё");
        Throwable identical = new SameDay("Слух не может повыситься дважды в день");
         if (vision != 0) {
         throw possibility;
         }
         if (hearing > 100){
             throw overflow;
         }
         if(countForBet < day.hashCode()) {
             hearing++;
             countForBet = day.hashCode();
         }else {throw identical;}


     }


     public void beg(){
        out = " " + this.pronoun + " просит ";
     }
    @Override
    public void describe() {
        System.out.print(out);
        out = "";

    }
    public void wakeUp(Time when, Frequency frequency, Adjectives adj){
        out = when.getName() + " " + this.pronoun + " " + frequency.getName() + " проснулась " + adj.getName();
    }

    @Override
    public void asks (String phrase){
        out = "спрашивает: " +  "«" + phrase + "» ";
    }

    @Override
    public void speak(String phrase) {out = "«" + phrase + "» ";
    }
}
