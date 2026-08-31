1.  A local MITE club just held an election for their new president, and the votes have been handed to you in a raw list. You need to count them.
        Your Tasks:
        Create a HashMap<String, Integer> to track the candidates and their vote counts.
        The votes are: "Rohan", "Priya", "Rohan", "Akshar", "Priya", "Rohan".
        Write the logic to process these votes. (You can either hardcode the .put() updates if you want to do it manually, or write a loop that processes an array of these names — your choice, as long as the map accurately reflects the final counts).
        Write a loop using .entrySet() to iterate through the map.
        Print the final results in this exact format: "CandidateName: X votes".

        import java.util.*;
        class Main{
            public static void main(String[] args){
                HashMap<String,Integer> candidates = new HashMap<>();
                candidates.put("Rohan",3);
                candidates.put("Akshar",1);
                candidates.put("Priya",2);
                for(Map.Entry<String, Integer> entry : candidates.entrySet()){
                    System.out.println(entry.getKey()+": "+entry.getValue());
                }

            }
        }

2.  You are building the "Undo" feature for a simple text editor. The user types words one by one, and when they hit undo, the most recently typed word is deleted.

    Your Tasks:

    Create a Stack<String> to represent the editor's memory.

    The user types three words. Use .push() to add them in this exact order: "Learning", "Java", "Collections".

    The user hits "Undo" once. Use .pop() to remove the most recent word, and print: "Undid: [word]".

    The user types a new word. .push() the word "DSA" onto the stack.

    Finally, write a while loop that empties the entire remaining stack, printing each word as it pops out.

        import java.util.*;
        class Main{
            public static void main(String[] args){
                Stack<String> memory = new Stack<>();
                memory.push("Learning");
                memory.push("Java");
                memory.push("Collections");
                System.out.println("Undid: "+ memory.pop());
                memory.push("DSA");
                while(memory.isEmpty()){
                    System.out.println(memory.pop());
                    
                }
            }
        }