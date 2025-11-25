package Animals;

public class Bird extends Animal {

    private String featherColor;

    public Bird() {
        super();
        this.featherColor = "";
    }

    @Override
    public void eat(String food) {

    }


    public Bird(String name) {
        super();
        this.featherColor = featherColor;


    }

    public String getFeatherColor() {
        return featherColor;
    }

    public String setFeatherColor() {
        return featherColor;
    }

    public Bird(String name, int age, double weight,String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;

    }



    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println("Bird eats");

    }

    @Override
    public void getVoice() {
        System.out.println(name + " (Bird) chirps.");
    }



}
