import java.util.Scanner;
class P4_Palindrome
{
    public static void main(String[] args){
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int left =0;
        int right = s.length()-1;
        boolean isPalindrome = true;
        String r = s.toLowerCase();
        while(left<right)
        {
            if(r.charAt(left) != r.charAt(right))
            {
                isPalindrome = false;
                break;
            }
            else
            {
                left++;
                right--;
            }
        }
        if(isPalindrome)
        {
            System.out.println(s+" is a Palindrome");
        }
        else{
            System.out.println(s+" is not a Palindrome");
        }
    }
}