package lab367449.enums;

public enum Time {


    Dinner ("За ужином"),
    Evening("Вечером"),
    Now("Теперь"),
    BeforeGoingToBed("перед сном");

    public String name;
    Time(String name){
    this.name = name;
    }
    public String getName(){
        return  this.name;
    }

}
