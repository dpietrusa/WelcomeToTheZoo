package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pen {

    String penName;

    List<Animal> animals = new ArrayList();
    List <BabyAnimal> babyAnimals = new ArrayList();

    public String getPenName() {
        return penName;
    }

    public void setPenName(String penName) {
        this.penName = penName;
    }

    public void addToAnimalsArray(Animal animal){
        animals.add(animal);
    }

    public void addToBabyAnimalsArray(BabyAnimal babyAnimal){
        babyAnimals.add(babyAnimal);
    }

    public void printEntirePen(){
        System.out.println(animals.toArray());
        System.out.println(babyAnimals.toArray());
    }


}
