// Program #3: Reverse a String (no library)
// Given a hardcoded String, print it reversed.
// Example: "hello" → "olleh"
// You CANNOT use StringBuilder.reverse() or any library reverse method.
//
// Run with: java P3_ReverseString.java

// YOUR CODE BELOW:


// P3 cold 26th september

class P3_ReverseString{
    public static void main(String[] args){
        String s = "Hello";
        String r = "";
        for(int i=0;i<s.length();i++)
        {
            r = s.charAt(i) + r;
        }
        System.out.println(r);
    }
}