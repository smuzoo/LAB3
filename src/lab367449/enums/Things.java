package lab367449.enums;

import lab367449.objects.Drinking;

public enum Things {
    SMELL("запаха"),
    DRINKING("питье"),
    TASTE("вкус"),
    ACCENT("акцента"),
    ANNOYANCE("досады"),
    LIE("ложь"),
    STEPS("шагам"),
    TENSION("напряжение"),
    MUSCLE("мышц"),
    SMOKE("дымок"),
    FURNITURE("мебель"),
    WALLS("стены"),
    SKIN("кожей"),
    WIND("потоки воздуха"),

    DUTIES("обязанности"),
    TRAYS("подносы"),
    DIALET("диалекты Лисса и Пентоса."),
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

