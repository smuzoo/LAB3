package lab367449.enums;

public enum Things {
    CUPOFMILK("чашку молока");

    private String name;

     Things(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

