import java.util.PriorityQueue;

public class PriorityExample {
    public static void main(String[] args) {
        PriorityQueue<String> ballers = new PriorityQueue<>();

        ballers.add("Nikola Jokić");
		ballers.add("Joel Embiid");
		ballers.add("Luka Dončić");
		ballers.add("Giannis Antetokounmpo");
		ballers.add("Anthony Davis");
		ballers.add("Damian Lillard");
		ballers.add("Shai Gilgeous-Alexander");
		ballers.add("Kevin Durant");
		ballers.add("Jimmy Butler");
		ballers.add("Stephen Curry");
		ballers.add("LeBron James");

        while(!ballers.isEmpty()){
            System.out.println(ballers.poll());
        }

    }
}
