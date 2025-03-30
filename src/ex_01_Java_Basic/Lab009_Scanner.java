package ex_01_Java_Basic;

import java.util.Scanner;

//scanner class is use to take input from the users
//break and continue can't e used with if else statement
public class Lab009_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("User input: "+input);
        if(input%2==0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd number");
        }
        scanner.close();
    }
}
