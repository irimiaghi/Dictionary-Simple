package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Dictionary dictionary = new Dictionary();
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("---------------------------" +
                    "\n| Dictionary commands :" +
                    "\n| 1 - Add new word" +
                    "\n| 2 - Remove a word" +
                    "\n| 3 - Search for a word" +
                    "\n| 4 - Dictionary contents" +
                    "\n| 5 - Exit application" +
                    "\n---------------------------");
            int options = input.nextInt();
            Words findWord;
            switch (options) {
                case 1:
                    input.nextLine();
                    System.out.println("Enter a word : ");
                    String word = input.nextLine();
                    System.out.println("Enter the translation of " + word + " : ");
                    String translation = input.nextLine();
                    System.out.println("Enter the opposite of " + word + " : ");
                    String opposite = input.nextLine();
                    //boolean success = dictionary.addList(word, translation, opposite);
                    findWord = dictionary.findList(word);
                    if(findWord != null) {
                        System.out.println("The word <" + word + "> already exists!");
                        System.out.println("Do you want to overwrite the word <" + ">? Yes?");
                        opposite = input.nextLine();
                        if(opposite.equalsIgnoreCase("Yes")) {
                            try {
                                dictionary.addListEnhanced(word, translation, opposite, true);
                            } catch (Error error) {
                                error.printStackTrace();
                                System.out.println("There is no such word!");
                                break;
                            }
                            System.out.println("The word <" + word + "> has been overwritten.");
                        }
                    } else {
                        try {
                            dictionary.addListEnhanced(word, translation, opposite, false);
                        } catch (Error error) {
                            error.printStackTrace();
                            System.out.println("There is no such word!");
                            break;
                        }
                        System.out.println("The word <" + word + "> was added to the dictionary!");
                    }

                    break;
                case 2:
                    System.out.println("Enter the word you want to remove : ");
                    word = input.next();
                    //success = dictionary.removeList(word);
                    findWord = dictionary.removeListEnhanced(word);
                    if(findWord != null) {
                        System.out.println("The word <" + word + "> not found!");
                    } else {
                        System.out.println("The word <" + word + "> was removed.");
                    }
                    break;
                case 3:
                    System.out.println("Enter the word you want to find : ");
                    word = input.next();
                    findWord = dictionary.findList(word);
                    if(findWord == null) {
                        System.out.println("The word <" + word + "> doest not exist!");
                    } else {
                        System.out.println(findWord);
                    }
                    break;
                case 4:
                    System.out.println("The dictionary contains " + dictionary.listWords.size() + " words.");
                    System.out.println("The dictionary contains the following words : \n" + dictionary.listWords.toString());
                    break;
                case 5:
                    System.out.println("The Emperor Protects...");
                    return;
                default:
                    System.out.println("The signs of heresy and corruption surround us." +
                            "\nWe need but open our eyes and allow the Emperor to guide our sight." +
                            "\nPlease stop entering wrong commands.");
            }
        }
    }
}
