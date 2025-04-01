package javaBasicPrograms;

import java.util.Scanner;

//wap to do arithmetic operations
public class P006_ArithmeticOperations {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a=0;
        if(sc.hasNextInt()){ //to check the value is int //has to give for all imoutes
           a=  sc.nextInt();
        }else{
            System.out.println("Only Interger value allowed");
            System.exit(0);
        }
        int b=sc.nextInt();

        System.out.println("Sum is: "+sum(a,b));
        System.out.println("Difference is: "+subtract(a,b));
        System.out.println("Product is: "+multiply(a,b));
        System.out.println("Division is: "+divide(a,b));
        System.out.println("Modulus is: "+mod(a,b));


                sc.close();
    }

    static int sum(int a, int b){
        return a+b;
    }

    static int multiply(int a, int b){
        return a*b;
    }

    static int divide(int a, int b){
        return b/a;
    }

    static int subtract(int a, int b){
        return b-a;
    }

    static int mod(int a, int b){
        return b%a;
    }
}
