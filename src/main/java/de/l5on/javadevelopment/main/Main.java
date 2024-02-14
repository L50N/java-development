package de.l5on.javadevelopment.main;

import de.l5on.javadevelopment.oop.Car;
import de.l5on.javadevelopment.oop.Garage;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author - L5ON
 * GitHub - https://github.com/L50N
 * Created - 17.12.2023
 */

public class Main {

    public static void main(String[] args) {
        /* firstCharToUppercase();
         * arrayList();
         * nestedArrayLists();
         * forEachLoop();
         * printf();
         * forAndWhileLoop();
         */

        Car audi = new Car("Audi", "R8", 2020, "black", 1928.99);
        Car bmw = new Car("BMW", "TT", 2019, "blue", 2228.99);

        /* Car[] carCollection = new Car[2];
         *
         * carCollection[0] = audi;
         * carCollection[1] = bmw;
         *
         * System.out.println(carCollection[0].getMake());
         * System.out.println(carCollection[1].getMake());
         */

        Garage garage = new Garage();
        garage.park(audi);
        garage.park(bmw);

        audi.go();
    }

    private static void firstCharToUppercase() {
        String name = "leon";
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println(name);
    }

    private static void arrayList() {
        ArrayList<String> food = new ArrayList<String>();

        food.add("Banana");
        food.add("Hamburger");
        food.add("Pizza");
        food.add("Hotdog");

        food.set(0, "Not a banana anymore :(");

        food.remove(2);

        // food.clear();

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }

    private static void nestedArrayLists() {
        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Pasta");
        bakeryList.add("Baguette");
        bakeryList.add("Ketchup");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("Tomatoes");
        produceList.add("Zucchini");
        produceList.add("Pepper");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("Soda");
        drinkList.add("Coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }
    }

    private static void forEachLoop() {
        String[] animalList = {"Cat", "Dog", "Rat", "Bird"};

        // !! Use iter for autocomplete a foreach
        for (String s : animalList) {
            System.out.println(s);
        }
    }

    private static void printf() {
        System.out.printf("%d This is a format String", 123);

        boolean booleanValue = true;
        char charValue = '@';
        int intValue = 15;
        double doubleValue = 1000;
        String stringValue = "Hello world!";

        System.out.println(" ");
        System.out.printf("%b", booleanValue);
        System.out.println(" ");
        System.out.printf("%s", stringValue);
        System.out.println(" ");
        System.out.printf("%d", intValue);
        System.out.println(" ");
        System.out.printf("%f", doubleValue);
        System.out.println(" ");
        System.out.printf("%c", charValue);
        System.out.println(" ");

        // Printing with a minimum amount of characters
        System.out.printf("Hello, %10s", "Leon");
    }

    public void forAndWhileLoop() {
        Scanner input = new Scanner(System.in);

        System.out.println("[JavaDevelopment] Wie oft soll die Schleife durchgangen werden? ");
        int userInput = input.nextInt();

        for (int i = 0; i < userInput; i++) {
            System.out.println(i);
            if (i >= 9999) {
                break;
            }
        }

        /* otherwise, you can use the while loop to do exactly the same thing.
         *
         * int j = 0;
         * while (j <= userInput) {
         *    System.out.println(j);
         *    if (j >= 9999) {
         *        break;
         *    } else {
         *        j++;
         *    }
         * }
         *
         */

        System.out.println("[JavaDevelopment] Schleife wurde beendet!");

        // Funfact: Everything that is possible with the "fori" loop is also possible with the "while" loop. the other way round is also possible. The question is always which is more useful and easier to read.
    }

    public void switchCase() {
        String[] personOne = {"Max", "Mueller", "19"};
        Scanner input = new Scanner(System.in);

        System.out.println("[JavaDevelopment] Willst du den Vornamen(1), den Nachnamen(2) oder eher das Alter(3) der Person wissen?");
        int userInput = input.nextInt();

        for (int i = 0; i == 0; i++) {
            switch (userInput) {
                case 1:
                    System.out.println("[JavaDevelopment] Der Vorname der Person lautet: " + personOne[0]);
                    i++;
                    break;
                case 2:
                    System.out.println("[JavaDevelopment] Der Nachname der Person lautet: " + personOne[1]);
                    i++;
                    break;
                case 3:
                    System.out.printf("[JavaDevelopment] Die Person ist %d Jahre alt.", personOne[3]);
                    i++;
                    break;
                default:
                    System.out.println("[JavaDevelopment] Deine Angabe war nicht gültig! Versuche es erneut..");
                    break;
            }
        }
        System.out.println("[JavaDevelopment] Deine Angabe war gültig - die Schleife wurde beendet!");
    }
}