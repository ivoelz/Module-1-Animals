package us.mattgreen;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Type {

    private List<Talkable> animalList;

    public Type(List<Talkable> animalList) {
        this.animalList = animalList;
    }

    public void getType() {
        Scanner keyboard = new Scanner(System.in);
        // Ask the user what type of animal they want to create
        System.out.println("What type of animal do you want to create? (cat or dog): ");
        // Used try-catch statements to verify that the user has entered data of the correct type
        try {
            String userChoice = keyboard.nextLine();
            if (userChoice.equals("dog")) {

                boolean isFriendly = true;
                System.out.println("Is your dog friendly? (y/n): ");
                try {
                    char friendlyInput = Character.toUpperCase(keyboard.next().charAt(0));

                    if (friendlyInput == 'Y') {
                        isFriendly = true;
                    } else {
                        isFriendly = false;
                    }
                } catch (IllegalArgumentException xx) {
                    System.out.println(xx.getMessage());
                }
                System.out.println("What is your dog's name? ");
                String name = keyboard.nextLine();
                // Create an object of that type
                Dog dog = new Dog(isFriendly, name);
                // Add the object to the ArrayList
                animalList.add(dog);
            } else if (userChoice.equals("cat")) {
                System.out.println("What is your cat's name? ");
                String name = keyboard.nextLine();

                System.out.println("How many mice has your cat killed? ");
                try {
                    int miceKilled = keyboard.nextInt();
                    // Create an object of that type
                    Cat cat = new Cat(miceKilled, name);
                    // Add the object to the ArrayList
                    animalList.add(cat);
                } catch (InputMismatchException ex) {
                    System.out.println(ex.getMessage());
                }
            } else {
                System.out.println("Please enter 'cat' or 'dog': ");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
