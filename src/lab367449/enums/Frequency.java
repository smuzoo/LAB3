package lab367449.enums;

public enum Frequency {
    EVERYTIME("каждый раз");
    private String name;
    Frequency(String name){
        this.name = name;
    }
    public String getName(){
        return  this.name;
    }
    }

