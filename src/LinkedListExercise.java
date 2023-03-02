import java.util.LinkedList;
import java.util.List;

public class LinkedListExercise {
    public static void main(String[] args) {
        List<String> newLink = new LinkedList<>();
        int listLength;
        newLink.add("Responsibility");
        newLink.add("Great");
        newLink.add("Comes");
        newLink.add("Power");
        newLink.add("Great");
        newLink.add("With");


        listLength = newLink.size()-1;

        while (listLength>=0){
            System.out.println(newLink.get(listLength));
            listLength--;
        }
    }
}
