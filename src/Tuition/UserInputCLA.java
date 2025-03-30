package Tuition;

public class UserInputCLA {
    public static void main(String[] args) {
        String a= args[0];
        System.out.println(a);
        int b= Integer.parseInt(args[1]); //converting string to int using wrapper class
        System.out.println(b);
        System.out.println(b instanceof Integer); //to check the data type
        System.out.println(a instanceof String);
    }
}
