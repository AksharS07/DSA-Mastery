1.Create an ArrayList of integers, add the numbers 10, 20, 30, 40, and 50, and print them using a for-each loop.  
import java.util.ArrayList;
class Main{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        for(Integer number : numbers){
            System.out.println(number);
        }
    }
}

2.Create an ArrayList of strings and print them in reverse order.
import java.util.ArrayList;
class Main{
    public static void main(String[] args){
        ArrayList<String> marvel = new ArrayList<>();
        marvel.add("Iron Man");
        marvel.add("Captain America");
        marvel.add("Hulk");
        marvel.add("Black Widow");
        marvel.add("Spiderman");
        for(int i=marvel.size()-1;i>=0;i--)
        {
            System.out.println(marvel.get(i));
        }
    }
}

3.Create an ArrayList of integers containing [1, 2, 3, 4, 5, 6], remove all even numbers, and print what remains.  
import java.util.ArrayList;
class Main{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1;i<=6;i++){
            numbers.add(i);
        }
        for(int j=numbers.size()-1;j>=0;j--){
            if(numbers.get(j)%2==0){
                numbers.remove(j);
            }
        }
        for(Integer number: numbers)
        {
            System.out.println(number);
        }
    }
}
4.Create an ArrayList of 5 names, remove the name at index 2, check if the name "Alice" exists in the list, and print the boolean result.
import java.util.ArrayList;
class Main{
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Akshar");
        names.add("Akash");
        names.add("Vijay");
        names.add("Dhanush");
        names.add("Alex");
        names.remove(2);
        boolean target = names.contain("Alice");
        System.out.println(target);
        for(String name : names){
            System.out.println(name);
        }
    }
}

5.Create an ArrayList of 5 integers (out of order), sort it using Collections.sort(), and print the sorted list.
import java.util.ArrayList;
import java.util.Collections;
class Main{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);
        Collections.sort(numbers);
        for(Integer number : numbers){
            System.out.println(number);
        }
    }
}

