import java.util.ArrayList;

public class Day01_ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        
        for(Integer num : nums) {
            System.out.println(num);
        }
    }
}
