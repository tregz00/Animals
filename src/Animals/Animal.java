package Animals;
abstract class Animal implements AnimalName,AnimalMove {
    protected String name;
    protected int age;
    protected double weight;

    public Animal(){
        this.age = 0;
        this.weight = 0;
        this.name = null;
    }



    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;

    }

    public abstract void eat(String food);
    public abstract void getVoice ();



    public String toString() {

        return "Animal{" + "name=" + name + ", age=" + age + ", weight=" + weight + '}';
    }


    public abstract void eat();
}