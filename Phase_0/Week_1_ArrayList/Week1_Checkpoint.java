import java.util.ArrayList;

public class Week1_Checkpoint {
    public static void main(String[] args) {
        // Problem 1: The Cargo Hold
        ArrayList<String> cargo = new ArrayList<>();
        cargo.add("Iron");
        cargo.add("Water");
        cargo.add("Tritium");
        cargo.add("Oxygen");
        
        for(int i = cargo.size() - 1; i >= 0; i--){
            if(cargo.get(i).equals("Tritium")){
                cargo.set(i, "Di-hydrogen");
            }
        }
        
        System.out.println("Final Cargo: " + cargo);
    }
}
