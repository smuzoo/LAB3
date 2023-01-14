package lab367449.objects;

public enum TimeOfDay {
    Evening("вечер"),
    DAY("день"),
    Morning("утро");

    private final String describe;
    TimeOfDay(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString(){
        return describe;
    }
}
