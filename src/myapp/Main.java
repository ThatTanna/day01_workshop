package src.myapp;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> cart = new LinkedList<>();
        Console cons = System.console();
        Boolean stop = false;

        while (!stop) {
            // list
            // add <item>
            // delete <num>
            // exit
            String line = cons.readLine("> ");
            // command line delimited by space
            line = line.trim();
            // add apple => ["add", "apple"]
            // list => ["list"]
            String[] terms = line.split(" ");

            switch (terms[0]) {
                case "list":
                    if (cart.size() <= 0) {
                        System.out.println("Your cart is empty");
                    } else {
                        System.out.println("The contents of your cart");
                        for (Integer idx = 0; idx < cart.size(); idx++)
                            System.out.printf("%d. %s\n", idx + 1, cart.get(idx));
                    }
                    break;

                case "add": // add apple orange pear
                    // Check if add has any items
                    if (terms.length < 2)
                    {
                        System.out.println("Please enter item you wish to add to cart");
                        break;
                    }
                    if (cart.contains(terms[1])) {
                        System.out.printf("Cart already has %s.\n", terms[1]);
                        break;
                    }
                    cart.add(terms[1]);
                    System.out.printf("Added %s to cart\n", terms[1]);
                    break;

                case "delete":
                    // delete has any number and if the number is valid
                    cart.remove(terms[1]);
                    System.out.printf("%s has been removed from cart\n", terms[1]);
                    break;

                case "exit":
                    stop = true;
                    break;

                default:
                    System.err.printf("Unknown command: %s.\n Commands available are: add, list, delete and exit.\n", terms[0]);
            }
        }

        System.out.println("Thank you for shopping with us. Bye bye.");

    }

}