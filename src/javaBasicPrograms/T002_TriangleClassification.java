package javaBasicPrograms;

import java.util.Scanner;

//Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides,
// determine if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
public class T002_TriangleClassification {
    public static void main(String[] args) {
        int side1, side2, side3;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter length for 3 sides of triangle: ");
        side1= scanner.nextInt();
        side2= scanner.nextInt();
        side3= scanner.nextInt();
        //1,1,1 --done
        //1,1,2 --done
        //1,2,1 --done
        //2,1,1 --done
        //1,2,3 --done
        if(side1==side2){
            if (side1==side3){
                System.out.println("Equilateral Triamgle");
            }else{
                System.out.println("Isosceles Triangle");
            }
        } else if (side1 == side3) {
            System.out.println("Isosceles Triangle");
        }else if (side2 == side3) {
            System.out.println("Isosceles Triangle");
        }else{
            System.out.println("Scalene Triangle");
        }
    }
}
