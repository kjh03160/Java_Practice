package Exercises.Grade;

import java.util.ArrayList;

public class GradeCalculator {
    private final String name;
    private final double currentAvgScore;
    private final int currentCredit;
    private final ArrayList<Course> courses = new ArrayList<>();

    public GradeCalculator(String name, double currentAvgScore, int currentCredit) {
        this.name = name;
        this.currentAvgScore = currentAvgScore;
        this.currentCredit = currentCredit;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public void print(){
        System.out.printf("직전 학기 성적: %.1f (총 %d학점)\n", this.currentAvgScore, this.currentCredit);

        double scoreSum = 0;
        int creditSum = 0;

        for (Course c : courses){
            scoreSum += c.getTranslatedGrade() * c.getCredit();
            creditSum += c.getCredit();
        }
        double nowAvgScore = scoreSum / creditSum;

        System.out.printf("이번 학기 성적: %.10f (총 %d학점)\n", nowAvgScore, creditSum);
        double totalScore = currentAvgScore * currentCredit + scoreSum;
        int totalCredit = currentCredit + creditSum;
        double totalAvg = totalScore / totalCredit;
        System.out.printf("전체 예상 학점: %.10f (총 %d학점)", totalAvg, totalCredit);
    }
}
