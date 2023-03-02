import java.util.Random;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> movieRatings = new TreeSet<>();
        Random r = new Random();
        for(int x=0; x<10;x++){
            movieRatings.add((Math.abs(r.nextInt()))%10 +1);
        }
        movieRatings.add(7);
        System.out.println(movieRatings);
        System.out.println(movieRatings.headSet(7));
    }
}
