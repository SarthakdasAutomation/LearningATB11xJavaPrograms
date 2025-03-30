package ex_01_Java_Basic;
//float,double,boolean value not allowed
//duplicate value not allowed, char will match to ASCII
//inputMissmatchException: happens when we give input of some different type than the expected data type
public class Lab010_Switch {
    public static void main(String[] args) {
        int input=10;
        switch (input){
            case 1:{
                System.out.println("Number is 1");
                break;
            } case 10:{
                System.out.println("Number is 10");
                break;
            } default:{
                System.out.println("Invalid input");
                break;
            }
        }

        //new way of switch: jdk>13
        switch (input){
            case 1 -> System.out.println("Ek number");
            case 10 -> System.out.println("Dus number");
            case 2-> System.out.println("Do Number");
            default -> System.out.println("Bhag ja yaha se :D");
        }

        //jdk>13 supports multiple items
        int num=2;
        switch (num){
            case 2,3,5:
                System.out.println("Prime");
                break;
            case 1,4,6:
                System.out.println("Composit");
                break;
            default:
                System.out.println("None");
                break;
        }


    }
}
