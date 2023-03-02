package PriortyClass;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityClassExample {
    public static void main(String[] args) {
        Queue<Students> students = new PriorityQueue<>(new GPACompare());
        students.add(new Students("Maryann Ford",4,3.70));
		students.add(new Students("Sabrina Morris",1,3.60));
		students.add(new Students("Julius Hawkins",4,2.69));
		students.add(new Students("Benjamin Martinez",3,3.21));
		students.add(new Students("Katrina Collier",3,3.08));
		students.add(new Students("Dominic West",4,3.83));
		students.add(new Students("Ryan Ford",2,2.73));
		students.add(new Students("Sabrina Martinez",2,3.03));
		students.add(new Students("Gregg West",2,3.99));
		students.add(new Students("Katrina Hawkins",1,2.87));

		while (!students.isEmpty()){
			System.out.println(students.poll());
		}

    }
}
