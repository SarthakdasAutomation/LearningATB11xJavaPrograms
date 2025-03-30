package javaBasicPrograms;

import java.util.Scanner;

public class P004_Factorial {
    public static void main(String[] args) {
        //for loop
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input=sc.nextInt();

        int factorial=1;
        if (input != 0 && input != 1) {
//            for (int i = input; i > 1; i--) {
//                factorial *= i;
//            }
            //while loop
            int i=input;
            while (i>=2){
                factorial*=i;
                i--;
            }
        }
        System.out.println("Factorial of "+input+" is: "+factorial);

        //while loop
//        System.out.println("Enter another number: ");
//        int num=sc.nextInt();
//        factorial=1;

    }
}
