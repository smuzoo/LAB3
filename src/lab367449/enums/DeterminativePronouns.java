package lab367449.enums;

public enum DeterminativePronouns {

    EACH("Каждый"),
    ANY("любой"),
    OTHER("другой"),
    WITCH("которого"),
    ONE("одного"),
    ALL("всё"),
    WHOLE("весь");



    private String name;
    DeterminativePronouns(String name){
        this.name = name;
    }
    public String getName(){
        return  this.name;
    }
}
