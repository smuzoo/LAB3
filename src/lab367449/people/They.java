package lab367449.people;

public class They extends Person  {
    public They(String name) {
        super(name);
    }
    public void banish(Bet bet){
        out = this.name + " " + "прогоняют " +bet.pronoun + " ";
    }

    @Override
    public void describe() {
        System.out.print(out);
        out = "";
    }
}
