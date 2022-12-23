package objects;

public abstract class Thing {
    public String name;
    public Place place;
    public String status;
    public String material;
    public String color;
    public int amount;

    public String getStatus() {
        return status;
    }

    public void findThing() {
        System.out.println("находится где-то");
    }

    public Thing(String name, String status, String material, String color, int amount, Place place) {

        this.name = name;
        this.status = status;
        this.material = material;
        this.color = color;
        this.amount = amount;
        this.place = place;

    }

}
