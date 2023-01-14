package lab367449.enums;

public enum DeterminativePronouns {

    EACH("Каждый"),
    ANY("любой"),
    OTHER("другой"),
    WHOLE("весь");

    public String name;
    DeterminativePronouns(String name){
        this.name = name;
    }
    public String getName(){
        return  this.name;
    }
}
