package lab367449.objects;

import lab367449.enums.Adjectives;
import lab367449.enums.Time;

public class Lessions extends AnythingReal {

    String feature;
    String lession1;
    String lession2;
    String lession3;
    public Lessions(String name, String feature , String lesson1, String lession2, String lession3) {
        super(name);
        this.feature = feature;
        this.lession1 = lesson1;
        this.lession2 = lession2;
        this.lession3 = lession3;


    }
    public void be(Adjectives adj1, Adjectives adj2 ){
        out_thing = " Это был " + adj1.getName() + " "
                +adj2.getName() + " "+ this.name + " "+ this.feature ;
    }
    public  void beCurrent1(Time time){
        out_thing = time.getName() + " "+ this.lession1;

    }
    public  void beCurrent2(Time time){
        out_thing = time.getName() + " "+ this.lession2;

    }
    public  void beCurrent3(Time time){
        out_thing = time.getName() + " "+ this.lession3;

    }



    public void informationAboutLession1(){
        out_thing= "Различать их можно с помощью обоняния, вкуса и осязания, но трогать,а тем более пробовать яды очень опасно. Некоторые даже и нюхать не стоит.";
    }

    public void  informationAboutLession2(){
        out_thing = "Слепому играть куда труднее, чем зрячему: полагаться приходиться на интонацию, выбор слов, да иногда призрак позволяет ощупать ее лицо";
    }



    @Override
    public void exist() {
        System.out.print(out_thing);
        out_thing = "";
    }
}
