1. Create an ArrayList of Strings called cities. Add "Bangalore", "Mumbai", and "Chennai" to it. Print the city at index 1.


    import java.util.*;
    class Main{
        public static void main(String[] args){
            ArrayList <String> cities = new ArrayList<>();
            cities.add("Bangalore");
            cities.add("Mumbai");
            cities.add("Chennai");
            System.out.println(cities.get(0));
        }
    }

2. Create a HashMap mapping Strings to Integers called ages. Add yourself ("Akshar" -> 21) and a friend. Write the code to instantly check if "Akshar" exists in the map, and if he does, print his age.

        import java.util.*;
        class Main{
            public static void main(String[] args){
                HashMap<String, Integer> ages = new Hashmap<>();
                ages.put("Akshar",20);
                ages.put("Akash",18);
                ages.put("Anika",17);
                ages.put("Nikitha",22);
                boolean check = ages.contains("Akshar");
                if(check){
                    System.out.println(ages.get("Akshar"));
                }
            }
        }

3. Write a standard for-each loop to print every city inside your cities ArrayList.

        import java.util.*;
        class Main{
            public static void main(String[] args){
                ArrayList<String> cities = new ArrayList<>();
                cities.put("Bangalore");
                cities.put("Mangalore");
                cities.put("Udupi");
                for(String city : cities)
                {
                    System.out.println(city);
                } 
            }
        }

