package objects;

public enum Place {
    Closet("каморку"),
    Temple("Храм"),
    Pond("пруд");



    private final String describe;
    Place(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return describe;
    }
}
