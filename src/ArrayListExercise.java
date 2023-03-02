import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListExercise {

    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        Random r = new Random();

        for (int x = 0; x < 7; x++){
                numbers.add(Integer.toString(r.nextInt()) +" Just to prove it's a string");
        }

        for(String num: numbers){
            System.out.println(num);
        }
    }
}
