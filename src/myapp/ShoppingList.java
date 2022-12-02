package src.myapp;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class ShoppingList {
    public static void main(String[] args) {

        List<String> shoppingList = new LinkedList<>();

        Console cons = System.console();

        String item = "";

        System.out.println("Welcome to your shopping cart.");

        while (true) {
            item = cons.readLine("> ").trim();

            if (item.equals("stop")) {
                break;
            } else if (item.equals("list")) {
                if (shoppingList.size() < 1) {
                    System.out.println("Your cart is empty");
                } else {
                    for (int i = 0; i < shoppingList.size(); i++) {
                        System.out.printf("%d. %s", (i + 1), item);
                    }
                }
            } else if (item.equals("add")) {

            }
        }

    }
    
}
