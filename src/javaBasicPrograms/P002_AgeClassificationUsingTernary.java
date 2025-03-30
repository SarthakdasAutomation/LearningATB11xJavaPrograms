package javaBasicPrograms;

public class P002_AgeClassificationUsingTernary {
    public static void main(String[] args) {
        //wap in java to identify age as minor(<18), adult(18) and senior citizen(60)
      //  int a=5,b=22,c=65;
        //taking input from user
        String ageInput= args[0];
        int age=Integer.parseInt(ageInput);
        System.out.println("The user is: "+(age<18?"Minor":(age>=60?"Senior Citizen":"Adult")));
    }
}
