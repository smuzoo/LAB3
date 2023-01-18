package lab367449.enums;

public enum Adjectives {
    STRANGE("странный"),
    BLIND ("незрячей"),
    EVERYDROP ("до капли"),
    HOWINFOREST("как по лесу"),
    THROUGH("сквозь"),
    FIRST("первый"),
    DIFF("по-разному"),
    VERY("самый"),
    BURNED("горящие"),
    SPECIAL("своеобразый"),
    BARBARIAN("варварского"),
    ALMOST("почти"),
    GOOD("хорошо"),
    CLASSICAL (" классический"),
    UNHAPPY ("недоволен"),
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
