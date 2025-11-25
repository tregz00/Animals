package Animals;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = {
                new Dog("Blue", 5, 70.0, "Brown"),
                new Pigeon("R", 2, 0.5, "Grey", "Rock Pigeon"),
                new Blowfish("Nemo", 1, 1.0, true)
        };

        System.out.println("\nANIMAL MOTION");
        for (Animal a : animals) {
            a.move();
        }

        System.out.println("\nANIMAL FOOD");
        for (Animal a : animals) {
            a.eat();
        }

        System.out.println("\nANIMAL VOICES");
        for (Animal a : animals) {
            a.getVoice();
        }

        System.out.println("\nANIMAL NAME");
        for (Animal a : animals) {
            AnimalName.name(a.getName());
        }

        System.out.println("\nANIMAL BEHAVIOURS");
        AnimalBehaviour[] behaviours = {
                new Dog("Boat", 3, 25, "Black"),
                new Pigeon("Rio", 1, 0.4, "White", "City Pigeon"),
                new Blowfish("Dory", 2, 1.5, false)
        };

        for (AnimalBehaviour ab : behaviours) {
            Animal a = (Animal) ab;

            String info = "";
            if (a instanceof Dog dog) {
                info = a.getName() + " (Dog, Fur color: " + dog.getFurColor() + ", Weight: " + a.getWeight() + "kg)";
            } else if (a instanceof Pigeon pigeon) {
                info = a.getName() + " (Pigeon, Feather color: " + pigeon.getFeatherColor() + ", Species: " + pigeon.getSpecies() + ", Weight: " + a.getWeight() + "kg)";
            } else if (a instanceof Blowfish blowfish) {
                info = a.getName() + " (Blowfish, Clean water: " + blowfish.iscleanwater() + ", Weight: " + a.getWeight() + "kg)";
            } else {
                info = a.getName() + " (" + a.getClass().getSimpleName() + ")";
            }
            System.out.println();

            System.out.println(info);

            a.eat();
            a.move();
            a.getVoice();
            ab.sleep();


        }







    }




}
