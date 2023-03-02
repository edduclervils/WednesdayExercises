package PriortyClass;

import java.util.Comparator;

public class GPACompare implements Comparator<Students> {

    @Override
    public int compare(Students s1, Students s2){
        if(s1.getGPA() > s2.getGPA())
            return 1;
        else if (s1.getGPA() < s2.getGPA()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
