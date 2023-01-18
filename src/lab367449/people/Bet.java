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
    String partOfBody1;
    String partOfBody2;
    String partOfBody3;
    private int countForBet = -1;
    protected int vision = 90;
    //от 1 до 100 и если больше 100, то ошибка
    protected int hearing = 70;
    public Bet(String name, String pronoun, String partOfBody1, String partOfBody2, String partOfBody3) {
        super(name);
        this.pronoun = pronoun;
        this.partOfBody1 = partOfBody1;
        this.partOfBody2 =partOfBody2;
        this.partOfBody3 = partOfBody3;

    }
    public String getPronoun(){
        return this.pronoun;
    }
    public  String getPartOfBody(){
        return this.partOfBody1;
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
             out = "слух " + this.name + " улучшился";
             countForBet = day.hashCode();
         }else {throw identical;}

     }
     public  void  burn(Frequency frequency){
        out = this.getName() + " " + frequency.getName() + " обжигала " + this.partOfBody2 + " " + this.partOfBody3;
     }

     public void  understand(Languages languages, Adjectives adg1){
        out = languages.getName() + " " + this.name + " " + adg1.getName() + " понимала ";

     }

     public void getRidOf(Adjectives adj1, Adjectives adj2, Things things ){
        out = " и " + adj1.getName() + " избавилась от " + adj2.getName() + " "+ things.getName();
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
        out = when.getName() + " " + this.pronoun + " " + frequency.getName() + " проснулась " + adj.getName() + ", ";
    }
    public void scream(Frequency frequency, Things things){
        out = frequency.getName() + " " + this.name + " визжала с " + things.getName();
    }

    public void learn(Time time,Things things1, Things things2, Things things3){
        out = time.getName() + " " + this.pronoun + " научилась слышать "+ things1.getName() + " чувствовать по " + things2.getName() + " "+ things3.getName();
    }
    public void keep(Things things){
        out = " " + this.pronoun + " сохраняла " + things.getName();
    }
    public void bumpInto (Things things1, Things things2){
        out = " " + this.pronoun + " натыкалась на " + things1.getName() + " " + things2.getName();
    }
    public  void drop(Things things){
        out = " роняла" + things.getName();
    }
    public void wander(Place place, Adjectives adjectives){
        out = " блуждала по " + place.getName() + " " + adjectives.getName();
    }

    public void feel(Time time, Things things1, Things things2){
        out = " " + time.getName() + " " + this.pronoun + " ощущала " + things1.getName()+ " " + things2.getName();
    }
    public void find(Things things, Place place){
        out = " находила " + place.getName() + " по " + things.getName();
    }
    public void foundOut(Umma umma, Things things,Servants servants, Novices novices, Ghost ghost, KindMan kindMan){
     out = " узнавала по "+ things.getName() +" "+  umma.getName() +" "+ servants.getName() + " "+ novices.getName() + " но не " + ghost.getName() + " и "+ kindMan.getName() + "которые ходили совершенно бесшумно.";
    }

    @Override
    public void asks (String phrase){
        out = "спрашивает: " +  " «" + phrase + "» ";
    }

    @Override
    public void speak(String phrase) {out = " «" + phrase + "» ";
    }
}
