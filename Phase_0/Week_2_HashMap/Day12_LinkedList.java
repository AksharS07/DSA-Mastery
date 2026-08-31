import java.util.*;

public class Day12_LinkedList {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("Alpha");
        list.add("Beta");
        list.add("Gamma");
        
        list.remove(1); // removes Beta
        
        Iterator<String> it = list.iterator(); 
        while(it.hasNext()) {
            String item = it.next();
            System.out.println(item);
        }
    }
}
