package PriortyClass;

public class Students implements Comparable<Students> {
    private String name;
    private int classGrade;
    private double GPA;

    public Students(){

    }

    public Students(String name, int classGrade,  double GPA){
        this.name = name;
        this.classGrade = classGrade;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(int classGrade) {
        this.classGrade = classGrade;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString(){
        String gradeLevel = "";
        switch (this.classGrade){
            case 1:
                gradeLevel = "Freshman";
                break;
            case 2:
                gradeLevel = "Sophomore";
                break;
            case 3:
                gradeLevel = "Junior";
                break;
            case 4:
                gradeLevel = "Senior";
                break;
            default:
                gradeLevel = "Teacher";
        }
        return "Name: "+name+"   Class: "+gradeLevel+"  GPA: "+GPA;
    }


    public int compareTo(Students other){
        int results;
        results = this.classGrade - other.getClassGrade();
        if (results != 0){
            return results;
        }
        else {
            return this.name.compareTo(other.getName());

        }
    }
}
