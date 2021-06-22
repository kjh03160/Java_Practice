package Exercises.Grade;

public class Course {
    public static final int CREDIT_MAJOR = 3;
    public static final int CREDIT_GENERAL = 2;

    private final String courseName;
    private final String grade;
    private final int credit;

    public Course(String courseName, int credit, String grade) {
        this.courseName = courseName;
        this.grade = grade;
        this.credit = credit;
    }

    public double getTranslatedGrade() {
        switch (this.grade){
            case "A+":
                return 4.5;
            case "A":
                return 4.0;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            case "C+":
                return 2.5;
            case "C":
                return 2.0;
            case "D+":
                return 1.5;
            case "D":
                return 1.0;
            default:
                return 0.0;
        }
    }

    public int getCredit() {
        return credit;
    }

}
