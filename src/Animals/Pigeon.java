package Animals;
public class Pigeon extends Bird implements AnimalBehaviour {

    private String species;

    public Pigeon() {
        super();
        this.species = "";

    }

    public String getSpecies() {
        return species;
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name,age,weight,featherColor);
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println("Pigeon pecks breadcrumbs.");
    }

    @Override
    public void getVoice() {
        System.out.println("Pigeon coos.");
    }

    @Override
    public void sleep() {
        System.out.println ("Pigeon sleeps in a nest.");
    }

    @Override
    public void move() {
        System.out.println ("Pigeon flies.");
    }
}
