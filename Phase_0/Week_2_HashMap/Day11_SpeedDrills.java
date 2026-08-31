import java.util.*;

public class Day11_SpeedDrills {
    public static void main(String[] args) {
        // Challenge 1: Update
        HashMap<String, Integer> cars = new HashMap<>();
        cars.put("Mustang",160);
        cars.put("Bugatti Veryon", 70);
        cars.put("Porsche 911 GT3RS",200);
        cars.put("Bugatti Veryon",220); // Update
        System.out.println(cars);

        // Challenge 2: Filter
        HashMap<String, Double> prices = new HashMap<>();
        prices.put("Laptop",1200.50);
        prices.put("Smartphone",450.50);
        prices.put("TWS",45.00);
        for(Map.Entry<String, Double> entry : prices.entrySet()){
            if(entry.getValue() < 500.00) {
                System.out.println(entry.getKey());
            }
        }

        // Challenge 3: Lookup
        HashMap<String, String> emps = new HashMap<>();
        emps.put("EMP01","Engineering");
        emps.put("EMP02","Biotechnology");
        emps.put("EMP03","Aeronautical Engineering");
        String searchID = "EMP02";
        
        if(emps.containsKey(searchID)) {
            System.out.println("Found in: " + emps.get(searchID));
        } else {
            System.out.println("ID not found");
        }
    }
}
