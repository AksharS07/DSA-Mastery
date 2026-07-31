import java.util.ArrayList;
public class Day1_ReverseAnimeList{
        public static void main(String[] args){
        ArrayList<String> animes = new ArrayList<>();
        animes.add("Freiren");
        animes.add("Naruto");
        animes.add("Dragon Ball Z");
        animes.add("Bleach");
        animes.add("One Piece");
        for (int i = animes.size()-1;i>0;i++){
            System.out.println(animes.get(i));
        }
    }
}