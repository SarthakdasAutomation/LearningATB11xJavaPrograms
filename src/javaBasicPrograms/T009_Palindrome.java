package javaBasicPrograms;

import java.util.Scanner;

public class T009_Palindrome {
    private static boolean flag=false;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input=sc.next();
        input=input.toLowerCase();
        int sizeOfInput=input.length();
        char[] inputCharArray= input.toCharArray();
        char[] reverse= new char[sizeOfInput];
        int j=0;
        for(int i=sizeOfInput-1;i>=0;i--){
            reverse[j]=inputCharArray[i];
            j++;
        }
        String reverseInput= new String(reverse);
        if(input.equals(reverseInput)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        //with function
        String input1o="A man, a plan, a canal: Panama";
        String input1=input1o.replaceAll("[^a-zA-Z0-9]","").toLowerCase(); //removing all special chars
        int a=0;
        int b=input1.length()-1;
        while(a<b){
            if(input1.charAt(a)!=input1.charAt(b)) {
                flag = true;
                break;
            }
            a++;
            b--;
        }
        if(flag)
            System.out.println("Not Palindrome");
        else
            System.out.println(input1o+" is Palindrome");
        sc.close();
    }
}
