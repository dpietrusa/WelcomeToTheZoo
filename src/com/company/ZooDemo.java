package com.company;

import java.util.Scanner;

public class ZooDemo {


    public static void main(String[] args) {


        Zoo newZoo = new Zoo();
        boolean cycle = true;
        do {

            Scanner userInput = new Scanner(System.in);
            System.out.println("Welcome to the Zookeeper 5000 Alpha. What would you like to do?\n1. Set Up a New Pen" +
                    "\n2. Remove a Pen\n3. Add an Animal or Baby Animal To a Pen\n4. Remove Animal or Baby Animal From a Pen" +
                    "\n5. Display All Animals In a Pen\n6. Display All Animals in the Zoo");
            int choice = userInput.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Name This Pen:");
                    userInput.nextLine();
                    String penName = userInput.nextLine();

                    Pen newPen = new Pen();
                    newPen.setPenName(penName);
                    newZoo.addPenToArray(newPen);
                    System.out.println("Pen Created!\n");
                    break;

                case 2:
                    System.out.println("Enter The Number of The Pen Would You Like To Remove");
                    newZoo.printPenNamesInArray();
                    int removePenChoice = userInput.nextInt();
                    newZoo.pensArray.remove(removePenChoice);
                    System.out.println("Pen Removed!\n");

                case 3:
                    System.out.println("Select The Number of The Pen You Wish To Add To: ");
                    newZoo.printPenNamesInArray();
                    int addToPenChoice = userInput.nextInt();
                    System.out.println("Is This an Animal, or a Baby Animal?\n1 - Animal\n2 - Baby Animal");
                    int animalOrBabyAnimal = userInput.nextInt();

                    if (animalOrBabyAnimal == 1) {
                        Animal newAnimal = new Animal();
                        System.out.println("Please Enter the Species of This Lovely Animal:");
                        String species = userInput.nextLine();
                        newAnimal.setSpecies(species);
                        System.out.println("Please Describe the Size of This Lovely Animal:");
                        String size = userInput.nextLine();
                        newAnimal.setSize(size);
                        System.out.println("Please Enter the Gender of This Lovely Animal:");
                        String gender = userInput.nextLine();
                        newAnimal.setGender(gender);
                        System.out.println("Animal Added!");
                    }

            }


        } while (cycle);
    }
}
