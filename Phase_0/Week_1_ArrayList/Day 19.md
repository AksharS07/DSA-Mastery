public class Solution {
    public static boolean isPalindrome(String word)
        {
        int left = 0;
        int right = word.length() - 1;
        while(left<right)
        {
            // char[] character = word.charAt(index); 
            char leftchar = word.charAt(left);
            char rightchar = word.charAt(right);
            if(leftchar!=rightchar)
            {
            return false;
            }
            
            else if(leftchar==rightchar)
            {
            left++;
            right--;
            }
           
        }
        return true;
        }

public static void main(String[] args) {
        String testWord = "racecar";
        boolean result = isPalindrome(testWord);
        System.out.println("Is palindrome: " + result); 
    }
}