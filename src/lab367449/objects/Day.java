package lab367449.objects;

public class Day {
    protected int currentDay;
    public Day (int currentDay ){
        this.currentDay = currentDay;
    }
    public void nextDay(){
        currentDay++;
    }
    @Override
    public int hashCode(){
        return currentDay;
    }


}
