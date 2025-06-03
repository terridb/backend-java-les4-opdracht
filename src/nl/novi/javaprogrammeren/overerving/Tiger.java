package nl.novi.javaprogrammeren.overerving;

public class Tiger extends WildAnimal {
    private int stripesCount;

    public Tiger(String animalName, String animalGender, String animalSound, String standardFood, String nameEnclosure, String dayLastFed, String originCountry, int stripesCount) {
        super(animalName, animalGender, animalSound, standardFood, nameEnclosure, dayLastFed, originCountry);
        this.stripesCount = stripesCount;
    }

    public int getStripesCount() {
        return stripesCount;
    }

    public void setStripesCount(int stripesCount) {
        this.stripesCount = stripesCount;
    }
}
