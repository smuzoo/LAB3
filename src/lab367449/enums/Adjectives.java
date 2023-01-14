package lab367449.enums;

public enum Adjectives {
    STRANGE("странный"),
    BLIND ("незрячей"),
    BITTER("горький");
    private String name;

    Adjectives(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
