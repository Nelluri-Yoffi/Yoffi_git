import java.util.HashMap;
class Playlist {
    public static void main(String[] args) {
        HashMap<String, Integer> songs = new HashMap<>();
        songs.put("Nokia", 9);
        songs.put("Blinding Lights", 8);
        songs.put("APT.", 10);
        songs.put("Birds of a Feather", 9);
        String bestSong = "";
        int bestRating = 0;
        System.out.println("My Playlist:");
        for (String song : songs.keySet()) {
                System.out.println(song + " - " + songs.get(song) + "/10");
                if (songs.get(song) > bestRating) {
                bestRating = songs.get(song);
                bestSong = song;
            }
        }
        System.out.println();
        System.out.println("My favourite song: " + bestSong);
        System.out.println("Rating: " + bestRating + "/10");
    }
}