package Animals;

public class Fish  extends  Animal{

    private boolean cleanwater;

    public Fish() {
        super();
        this.cleanwater =true;
    }

    public Fish(String name, int age, double weight,boolean cleanwater) {

        super(name,age,weight);
        this.cleanwater =cleanwater;


    }

    @Override
    public void eat(String food) {

    }

    public Fish(String name) {
        super();
        this.cleanwater =true;
    }

    public boolean iscleanwater() {
        return cleanwater;
    }

    @Override
    public String toString() {
        return super.toString() + "Fish" + "cleanwater=" + cleanwater;

    }

    @Override
    public void eat() {
        System.out.println(name + " (Fish) eats plankton.");
    }

    @Override
    public void getVoice() {
        System.out.println(name + " (Fish) makes bubbles.");
    }



}
