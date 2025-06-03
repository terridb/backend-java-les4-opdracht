package nl.novi.javaprogrammeren.overerving;

public class WildAnimal extends Animal {
    private String nameEnclosure;
    private String dayLastFed;
    private final String originCountry;

    protected WildAnimal(String animalName, String animalGender, String animalSound, String standardFood, String nameEnclosure, String dayLastFed, String originCountry) {
        super(animalName, animalGender, animalSound, standardFood);
        this.nameEnclosure = nameEnclosure;
        this.dayLastFed = dayLastFed;
        this.originCountry = originCountry;
    }

    public String getNameEnclosure() {
        return nameEnclosure;
    }

    public void setNameEnclosure(String nameEnclosure) {
        this.nameEnclosure = nameEnclosure;
    }

    public String getDayLastFed() {
        return dayLastFed;
    }

    public void setDayLastFed(String dayLastFed) {
        this.dayLastFed = dayLastFed;
    }

    public String getOriginCountry() {
        return originCountry;
    }
}
