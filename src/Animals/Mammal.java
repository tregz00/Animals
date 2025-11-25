package Animals;
public class Mammal extends Animal {

    private String furColor;

    public Mammal() {
        super();
        this.furColor = "";
    }

    @Override
    public void eat(String food) {

    }

    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public Mammal(String name, String furColor) {
        super(name, 0, 0);
        this.furColor = furColor;
    }

    public String getFurColor() { return furColor; }
    public void setFurColor(String furColor) { this.furColor = furColor; }

    @Override
    public void eat() {
        System.out.println("Mammal eats.");
    }

    @Override
    public void getVoice() {
        System.out.println("Mammal sound.");
    }

    @Override
    public String toString() {
        return super.toString() + ", furColor='" + furColor + "'";
    }

    @Override
    public void move() {
        super.move();
    }
}





















