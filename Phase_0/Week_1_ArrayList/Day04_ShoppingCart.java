import java.util.ArrayList;

public class Day04_ShoppingCart {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        cart.add("Milk");
        cart.add("Eggs");
        cart.add("Bread");
        cart.add("Coffee");

        if(cart.contains("Bread")) {
            cart.remove("Bread");
        }
        
        cart.add("Apples");

        for(String item : cart) {
            System.out.println(item);
        }
    }
}
