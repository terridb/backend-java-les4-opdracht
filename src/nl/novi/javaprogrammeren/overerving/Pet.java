package nl.novi.javaprogrammeren.overerving;

public class Pet extends Animal {
    private String ownerName;
    private String favoriteFoodBrand;
    private final String breed;

    protected Pet(String animalName, String animalGender, String animalSound, String standardFood, String ownerName, String favoriteFoodBrand, String breed) {
        super(animalName, animalGender, animalSound, standardFood);
        this.ownerName = ownerName;
        this.favoriteFoodBrand = favoriteFoodBrand;
        this.breed = breed;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getFavoriteFoodBrand() {
        return favoriteFoodBrand;
    }

    public void setFavoriteFoodBrand(String favoriteFoodBrand) {
        this.favoriteFoodBrand = favoriteFoodBrand;
    }

    public String getBreed() {
        return breed;
    }
}
