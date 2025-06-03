package nl.novi.javaprogrammeren.overerving;

public class Lion extends WildAnimal {
    private int amountOfChildren;

    public Lion(String animalName, String animalGender, String animalSound, String standardFood, String nameEnclosure, String dayLastFed, String originCountry, int amountOfChildren) {
        super(animalName, animalGender, animalSound, standardFood, nameEnclosure, dayLastFed, originCountry);
        this.amountOfChildren = amountOfChildren;
    }

    public int getAmountOfChildren() {
        return amountOfChildren;
    }

    public void setAmountOfChildren(int amountOfChildren) {
        this.amountOfChildren = amountOfChildren;
    }
}
