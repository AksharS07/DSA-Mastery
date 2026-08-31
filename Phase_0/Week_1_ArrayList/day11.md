Challenge 1: The Update Drill
Create a HashMap<String, Integer> mapping 3 car models to their top speeds (e.g., "Mustang" -> 160).
You realize one of the speeds is wrong. Use the .put() method to update an existing car's speed to a new number.
Print the entire map.

    import java.util.*;
    class Main{
    public static void main(String[] args){
        HashMap<String, Integer> cars = new HashMap<>();
        cars.put("Mustang",160);
        cars.put("Bugatti Veryon", 70);
        cars.put("Porsche 911 GT3RS",200);
        cars.put("Bugatti Veryon",220);
        System.out.println(cars);
    }
}

Challenge 2: The Filter Drill
Create a HashMap<String, Double> mapping 4 items to their prices (e.g., "Laptop" -> 1200.50).
Write a for loop using .entrySet() to iterate through the map.
Print only the names (Keys) of the items that cost strictly less than 500.00.

    import java.util.*;
    class Main{
        public static void main(String[] args){
            HashMap<String, Double> prices = new HashMap<>();
            prices.put("Laptop",1200.50);
            prices.put("Smartphone",450.50);
            prices.put("TWS",45.00);
            for(Map.Entry<String, Double> entry : prices.entrySet()){
                if(entry.getValue()<500.00)
                {
                System.out.println(entry.getKey());
                }              
            }
        }
    }

Challenge 3: The Lookup Drill
Create a HashMap<String, String> mapping 3 employee IDs to their departments (e.g., "EMP01" -> "Engineering").
Hardcode a string variable searchID (e.g., String searchID = "EMP02";).
Write an if/else statement using .containsKey(). If the ID exists, print "Found in: " + department. If it does not exist, print "ID Not Found".

    import java.util.*;
    class Main{
        public static void main(String[] args){
            HashMap<String, String> emps = new HashMap<>();
            emps.put("EMP01","Engineering");
            emps.put("EMP02","Biotechnology");
            emps.put("EMP03","Aeronautical Engineering");
            String searchID = "EMP02";
            if(emps.containsKey(searchID))
                {
                    System.out.println("Found in: "+entry.get(searchID));
                }
            else
                {
                    System.out.println("ID not found");
                }
            }
        }