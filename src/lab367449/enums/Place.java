package lab367449.enums;

public enum Place {
    CLOSET("каморку"),
    TEMPLE("храм"),
    KITCHEN("кухню"),
    UP("наверх"),
    POND("пруд");



    private String name;

    Place(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
