package src.myapp;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class ShoppingList {
    public static void main(String[] args) {

        List<String> shoppingList = new LinkedList<>();

        Console cons = System.console();

        String input = "";

        System.out.println("Welcome to your shopping cart.");

        while (true) {
            input = cons.readLine("> ").trim();
            // String[] item = input.split(" ");

            if (input.equals("stop")) {
                System.out.println("Thank you for shopping with us.");
                break;
            } else if (input.equals("list")) {
                if (shoppingList.size() < 1) {
                    System.out.println("Your cart is empty");
                } else {
                    for (int i = 0; i < shoppingList.size(); i++) {
                        System.out.printf("%d. %s", (i + 1), input);
                    }
                }
            } else if (input.equals("add")) {

            }
        }

    }
    
}
