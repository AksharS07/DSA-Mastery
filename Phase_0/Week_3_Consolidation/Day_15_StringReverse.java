import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reversed = "";
        for(int i=A.length()-1;i>=0;i--){
            char letter = A.charAt(i);
            reversed = reversed+letter;
        }
        if(A.equals(reversed)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
