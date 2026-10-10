import java.util.*;
public class P11_ContainsDuplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int k=0;k<n;k++){
            arr[k] = sc.nextInt();
        }
        sc.close();
        HashSet<Integer> seen = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(!seen.add(arr[i])){
                System.out.println(true);
                return;
            }
        }
        System.out.println("false");
    }
}
