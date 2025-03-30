package javaBasicPrograms;

public class P001_MaxOf3numUsingTernary {
    public static void main(String[] args) {
        //wap to find max of 3 numbers using ternary operator
        int a=42,b=22,c=32;
        System.out.println("Result is: "+(a>b?(a>c?a:c):(b>c?b:c)));
    }
}
