package Animals;

class Dog extends Mammal implements AnimalBehaviour {

    public Dog() {}

    public Dog(String name, int age, double weight, String FurColor) {
        super(name, age, weight, FurColor);
    }

    @Override
    public void eat() {
        System.out.println("Dog eats meat.");
    }

    @Override
    public void getVoice() {
        System.out.println("Dog barks.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps in kennel.");
    }

    @Override
    public void move() {
        System.out.println("Dog runs.");
    }

    @Override
    public String toString() {
        return getName() + " (Fur color: " + getFurColor() + ")";
    }


}