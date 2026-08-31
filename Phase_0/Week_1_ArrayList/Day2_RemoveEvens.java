import java.util.ArrayList;
public class Day2_RemoveEvens{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1; i<=8;i++)
        {
            numbers.add(i);         
        }
        System.out.println("The original array:");
           for(Integer number: numbers){
            System.out.println(number);
        }
        for(int i= numbers.size()-1; i>=0; i--){
            if(numbers.get(i)%2==0)
            {
                numbers.remove(i);
            }
        }
        System.out.println("Array after removing even numbers:");
        for(Integer number: numbers){
            System.out.println(number);
        }
    }
}