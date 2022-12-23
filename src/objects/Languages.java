package objects;

public enum Languages {
    Braavossky("Браавосский"),
    Valyrian("валирийским");

    private final String describe;
    Languages(String describe){this.describe = describe;}
    @Override
    public String toString(){return describe;}
}
