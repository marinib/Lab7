import java.util.Scanner;

/**
 * Created by uComp1337me on 4/17/2017.
 */

public class studentsArray {
    public static void main(String[] args) {


        String[] names = {"marin", "michael", "maurice", "nick"};
        String[] hometown = {"canton", "pinckney", "detroit", "middle school"};
        String[] favFood = {"byrek", "pulled pork chicken", "tacos", "candy"};
        int[] age = {28, 30, 32, 12};

        System.out.printf("Welcome to our java class. Which student would you like to learn about? (enter a number 1-4) \n");
        Scanner scan = new Scanner(System.in);
        int nameChoice = scan.nextInt() - 1;

        System.out.printf("Student is " + names[nameChoice] + ". Would you like to know more about them? (enter \"hometown\" or \"favorite food\") \n");
        scan.nextLine();

        String foodOrTown = scan.nextLine();
//        String ageChoice = scan.nextLine();

        if (foodOrTown.equals("hometown")) {
            System.out.printf(names[nameChoice] + " lives in " + hometown[nameChoice] + ". Would you like to know more about them? (enter \"favorite food\" or \"age\") \n");
            scan.nextLine();

        } else if (foodOrTown.equals("favorite food")) {
            System.out.printf(names[nameChoice] + "'s favorite food is " + favFood[nameChoice] + ". Would you like to know more about them (enter \"age\" or \"no\"?) \n");

//            } else if (ageChoice.equals("age")) {
                    System.out.printf(names[nameChoice] + "'s favorite food is " + age[nameChoice] + ". Would you like to know more about them (enter \"age\" or \"no\"?) \n");

        } else {
                    System.out.println("done");
                }

//            for (int i = 0; i < names.length; i++) {
//                System.out.printf("Student name: %s \t|\t Jersey number: %d", names[i], jerseyNum[i]);
//
//                for (int i = 0; i < names.length; i++) {
//                    System.out.printf("Student name: %s \t|\t Jersey number: %d", names[i], jerseyNum[i]);
//
//                    for (int i = 0; i < names.length; i++) {
//                        System.out.printf("Student name: %s \t|\t Jersey number: %d", names[i], jerseyNum[i]);
//
//                        for (int i = 0; i < names.length; i++) {
//                            System.out.printf("Student name: %s \t|\t Jersey number: %d", names[i], jerseyNum[i]);
                }
            }