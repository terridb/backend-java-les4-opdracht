package nl.novi.javaprogrammeren.overerving;

public class Cat extends Pet {
    private String catType;

    public Cat(String animalName, String animalGender, String animalSound, String standardFood, String ownerName, String favoriteFoodBrand, String breed, String catType) {
        super(animalName, animalGender, animalSound, standardFood, ownerName, favoriteFoodBrand, breed);
        this.catType = catType;
    }

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }
}
