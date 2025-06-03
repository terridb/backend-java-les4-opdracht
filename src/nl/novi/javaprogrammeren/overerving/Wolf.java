package nl.novi.javaprogrammeren.overerving;

public class Wolf extends WildAnimal {
    private String pack;

    public Wolf(String animalName, String animalGender, String animalSound, String standardFood, String nameEnclosure, String dayLastFed, String originCountry, String pack) {
        super(animalName, animalGender, animalSound, standardFood, nameEnclosure, dayLastFed, originCountry);
        this.pack = pack;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }
}
