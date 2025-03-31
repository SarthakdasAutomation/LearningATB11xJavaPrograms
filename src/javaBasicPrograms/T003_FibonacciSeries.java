package javaBasicPrograms;

import java.util.Scanner;

//wap to print fibonacci series upto n element
//0,1,1,2,3,5,8,13....
public class T003_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n=sc.nextInt();
        int sum=0, a=0, b=1;
        System.out.println("Fibonacci Series: ");
        if(n<3){
            for(int i=0;i<n;i++){
                System.out.print(i+", ");
            }
        }else{
            System.out.print(a+", "+b+", ");
            for(int i=3;i<=n;i++){
                sum=a+b;
                System.out.print(sum+", ");
                a=b;
                b=sum;
            }
        }
//        for(int i=1;i<n;i++){
//            sum=a+b;
//            System.out.print(sum+", ");
//            b++;
//            a=b;
//            b=sum;
//        }
    }
}
