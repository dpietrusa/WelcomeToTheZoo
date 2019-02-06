package com.company;

import java.util.Scanner;

public class ZooDemo {


    public static void main(String[] args) {
        Zoo newZoo = new Zoo();
        boolean cycle = true;
        do {

            Scanner userInput = new Scanner(System.in);
            System.out.println("Welcome to the Zookeeper 5000 Alpha. What would you like to do?\n1. Set Up a New Pen" +
                    "\n2. Remove a Pen\n3. Add an Animal To a Pen\n4. Add a Baby Animal To a Pen" +
                    "\n5. Remove Animal or Baby Animal From a Pen\n6. Display All Animals In a Pen" +
                    "\n7. Display All Animals in the Zoo");
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
                    System.out.println("Which Pen Would You Like To Remove?");

            }


        } while (cycle);
    }
}
