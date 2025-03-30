package ex_01_Java_Basic;

public class Lab008_TakingInput {
    public static void main(String[] args) {
        //taking input from user
        //giving input as CLI(Command line argument)
        String age=args[1]; //use space in the command line argument space, press arrow, configure run
        System.out.println(age);
        System.out.println(age instanceof String); //to check the data is of type string
        int age1=Integer.parseInt(age); //wrapper class: converting String into int

    }
}
