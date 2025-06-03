package nl.novi.javaprogrammeren.overerving;

public class Animal {
    private final String animalName;
    private final String animalGender;
    private final String animalSound;
    private final String standardFood;

    protected Animal(String animalName, String animalGender, String animalSound, String standardFood) {
        this.animalName = animalName;
        this.animalGender = animalGender;
        this.animalSound = animalSound;
        this.standardFood = standardFood;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalGender() {
        return animalGender;
    }

    public String getAnimalSound() {
        return animalSound;
    }

    public String getStandardFood() {
        return standardFood;
    }

    public void printMove() {
        System.out.println("The " + animalName + " has moved 0,25 meters.");
    }

    public void printSound() {
        System.out.println("The " + animalName + " makes a " + animalSound + " sound.");
    }

    public void printSleep() {
        System.out.println("The " + animalName + " sleeps soundly for 8 hours a day.");
    }

    public void printEat() {
        System.out.println("The " + animalName + " eats " + standardFood);
    }
}
