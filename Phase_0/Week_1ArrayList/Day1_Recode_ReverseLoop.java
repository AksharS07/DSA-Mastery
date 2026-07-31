import java.util.ArrayList;
import java.util.Scanner;
public class Day1_Recode_ReverseLoop{
    public static void main(String[] args){
        ArrayList<String> mcumovies = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        /* 
        mcumovies.add("Iron Man");
        mcumovies.add("Avengers 2012");
        mcumovies.add("Avengers Infinity Wars");
        mcumovies.add("Deadpool and wolverine");
        */
        System.out.println("Enter any 4 MCU movies!:");
        for(int i = 0; i<4;i++)
        {
            String movie = sc.nextLine();
            mcumovies.add(movie);

        }
        System.out.println();
        
        for (int i = mcumovies.size()-1; i>=0; i--){
            System.out.println(mcumovies.get(i));

        }
        sc.close();
    }
}