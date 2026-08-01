import java.util.*;
public class Day2_Recode_RemoveEvens{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the number of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            numbers.add(i);
        }
        for(int j=numbers.size()-1;j>=0;j--){
            if(numbers.get(j)%2==0){
                numbers.remove(j);
            }
        }
            System.out.println("Removed even numbers array:");
            for(Integer number : numbers){
                System.out.println(number);
                
            }
        
    }
}