Day 11: The Playlist Challenge
Create a LinkedList<String> called playlist.
Add 3 of your favorite songs to it using standard .add().
You decide you want a new song to play first. Use .addFirst() to put a new song at the absolute top of the list.
You hate the last song. Use .removeLast() to kick it off the playlist entirely.
Print the entire playlist.

    import java.util.*;
    class Main{
        public static void main(String[] args){
            LinkedList<String> playlist = new LinkedList<>();
            playlist.add("Marandhu Poche");
            playlist.add("Pavazha Malli");
            playlist.add("Kalyani");
            playlist.addFirst("Pavazha Malli");
            playlist.removeLast();
            System.out.println(playlist);
        }
    }