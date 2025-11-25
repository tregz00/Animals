package Animals;

class Blowfish extends Fish implements AnimalBehaviour {



    public Blowfish() {}

    public boolean iscleanwater() { return super.iscleanwater(); }

    public Blowfish(String name, int age, double weight, boolean cleanwater) {
        super(name, age, weight, cleanwater );
    }

    @Override
    public void eat() {
        System.out.println("Blowfish eats small crustaceans.");
    }

    @Override
    public void getVoice() {
        System.out.println("Blowfish makes popping sounds.");
    }

    @Override
    public void sleep() {
        System.out.println("Blowfish sleeps near the seabed.");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swims.");
    }
}

