import java.util.*;

public class Week2_Checkpoint {
    public static void main(String[] args) {
        // Problem 1: The Election Tally
        HashMap<String,Integer> candidates = new HashMap<>();
        candidates.put("Rohan",3);
        candidates.put("Akshar",1);
        candidates.put("Priya",2);
        for(Map.Entry<String, Integer> entry : candidates.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }

        System.out.println("---");

        // Problem 2: The Text Editor Undo
        Stack<String> memory = new Stack<>();
        memory.push("Learning");
        memory.push("Java");
        memory.push("Collections");
        System.out.println("Undid: " + memory.pop());
        
        memory.push("DSA");
        while(!memory.isEmpty()){
            System.out.println(memory.pop());
        }
    }
}
