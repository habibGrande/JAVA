import java.util.Set;
import java.util.HashMap;
public class band {
    public static void main(String[] args) {
        HashMap<String, String> songs = new HashMap<String, String>();
        songs.put("everything i wanted", "If they knew what they said would go straight to my head, what would they say instead?");
        songs.put("this is me trying", "they told me all of my cages were mental so i got wasted like all my potential and my words shoot to kill when im mad i have a lot of regrets about that");
        songs.put("everybody dies", "I just wonder why you'd wanna stay if everybody goes you'd still be alone");
        songs.put("Get free", "sometimes it feels like i got a war in my mind");
        songs.put("wiped out", "how can you feel the way that i'm feeling if you're not in mt head?");
        Set<String> keys = songs.keySet();
        System.out.println("song by title(everything i wanted): "+ songs.get( "everything i wanted"));
        for(String key : keys) {
            System.out.println("Track: " + key);
            System.out.println("Lyrics: " + (songs.get(key)));    
        }
    }
}

