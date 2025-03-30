package javaBasicPrograms;
/*
Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:

A: 90-100

B: 80-89

C: 70-79

D: 60-69

F: 0-59
*/
public class T001_GradeCalculator {
    public static void main(String[] args) {
        String inputMarks=args[0];
        int marks=Integer.parseInt(inputMarks);
        System.out.println("Grade is: "+(marks>=90?"A":(marks>=80?"B":(marks>=70?"C":
                (marks>=60?"D":"F")))));
    }
}
