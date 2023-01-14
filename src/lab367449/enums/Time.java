package lab367449.enums;

public enum Time {


    DINNER ("За ужином"),
    EVENING("вечером"),
    NOW("Теперь"),
    INTHEDAYTIME("днем"),
    BEFOREGOINGTOBED("перед сном");


    public String name;
    Time(String name){
    this.name = name;
    }
    public String getName(){
        return  this.name;
    }

}
