package lab367449.enums;

import lab367449.objects.Drinking;

public enum Things {
    SMELL("запаха"),
    DRINKING("питье"),
    TASTE("вкус"),
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

