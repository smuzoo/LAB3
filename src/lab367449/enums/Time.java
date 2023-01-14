package lab367449.enums;

public enum Time {


    DINNER ("За ужином"),
    EVENING("Вечером"),
    NOW("Теперь"),
    BEFOREGOINGTOBED("перед сном");

    public String name;
    Time(String name){
    this.name = name;
    }
    public String getName(){
        return  this.name;
    }

}
