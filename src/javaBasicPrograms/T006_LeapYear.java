package javaBasicPrograms;

import java.util.Scanner;

//wap to check the given year is leap year or not
//a year divisible by 4 and not divisible by 100 is a leap year  (century rule)
//a year divisible by 400 is a leap year
public class T006_LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any year in number: ");
        int year= sc.nextInt();
        if(year%400==0){
            System.out.println("Leap Year");
        } else if (year % 4==0 && year %100!=0) { //(Century rule)
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a leap year");
        }
        sc.close();
    }
}
