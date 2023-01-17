package lab367449.objects;

public class Rock extends AnythingReal {

    String contain;

    public Rock(String name, String contain) {
        super(name);
        this.contain = contain;
    }
    public String getContain(){
        return this.contain;
    }

    @Override
    public void exist() {

    }
}
