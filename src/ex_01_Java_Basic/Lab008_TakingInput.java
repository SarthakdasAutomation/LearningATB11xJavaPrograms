package ex_01_Java_Basic;

public class Lab008_TakingInput {
    public static void main(String[] args) {
        //taking input from user
        //giving input as CLI(Command line argument)
        String age=args[1]; //use space in the command line argument space, press arrow, configure run
        System.out.println(age);
        System.out.println(age instanceof String); //to check the data is of type string
        int age1=Integer.parseInt(age); //wrapper class: converting String into int
//        System.out.println(args[4]); // this will give ArrayIndexOutOfBoundsException as only 2 arguments are present and we are trying to get the 3rd element

        //printing max of arg 1 and 2
        System.out.println("Max of arg1:"+args[0]+" and arg2: "+args[1]+"is: "
        +(Integer.parseInt(args[0])>Integer.parseInt(args[1])?args[0]:args[1]));
        //String result=Integer.parseInt(args[0])>Integer.parseInt(args[1])?args[0]:args[1];

        //taking input name,age, salary and printing
        String sal=args[0];
        String name= args[2];
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: $"+sal);
    }
}
