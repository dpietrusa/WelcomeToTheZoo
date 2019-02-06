package com.company;

public class BabyAnimal extends Animal {

    boolean cute;

BabyAnimal (boolean cute, String species, String size, String gender) {
    this.cute=cute;
    this.setSpecies(species);
    this.setSize(size);
    this.setGender(gender);

}



}
