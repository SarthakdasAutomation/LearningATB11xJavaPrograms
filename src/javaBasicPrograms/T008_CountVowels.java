package javaBasicPrograms;

import java.util.Scanner;

//wap tpo count vowels and consonants
public class T008_CountVowels {
    public static void main(String[] args) {
        int vowels=0;
        int consonants=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input=sc.nextLine();
        input=input.toLowerCase();
        char[] inputCharacters= input.toCharArray();
        for(int i=0;i<inputCharacters.length;i++){
            if(inputCharacters[i]=='a'||inputCharacters[i]=='e'||inputCharacters[i]=='i'
               ||inputCharacters[i]=='o'||inputCharacters[i]=='u'){
                vowels++;
            }else{
                consonants++;
            }
        }
        System.out.println("Number of Vowels: "+vowels);
        System.out.println("Number of Consonants: "+consonants);
        sc.close();
    }
}
