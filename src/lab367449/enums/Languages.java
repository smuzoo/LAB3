package lab367449.enums;

public enum Languages {
    BRAAVOSSKY("Браавосский "),
    VALYRIAN("валирийским ");
    private String name;

    Languages(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
