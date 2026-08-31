Surprise Problem 1: The Maximum Tracker

Create an ArrayList of integers and populate it with: [15, 42, 7, 99, 23].

Write the logic to find and print the highest number in the list.


    import java.util.ArrayList;
    import java.util.Collections;
    class Main{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(42);
        numbers.add(7);
        numbers.add(99);
        numbers.add(23);
        Collections.sort(numbers);
        System.out.println("Highest number in the list is: "+numbers.get(4));
        }
    }

Surprise Problem 2: The Purge

Create an ArrayList of strings and add these names: ["Akshar", "Rohan", "Ananya", "Vijay", "alex"].

Write the logic to remove any name that starts with the letter "A" (or "a"), and print the final list.



    import java.util.ArrayList;
    class Main{
        public static void main(String[] args){
            ArrayList<String> names = new ArrayList<>();
            names.add("Akshar");
            names.add("Rohan");
            names.add("Ananya");
            names.add("Vijay");
            names.add("alex");

            for(int i= names.size()-1;i>=0;i--){
                String word = names.get(i);
            if(word.startsWith("A")|| word.startsWith("a")){
                names.remove(i);
            }
            }
            System.out.println("Final list");
            for(String name: names){
                System.out.println(name);
            }
        }
    }


