package ex_01_Java_Basic;

public class Lab006_TypeCasting {
    public static void main(String[] args) {
        //type casting: 2 types: widening & narrowing; both are having implicit and explicit
        //implicit: automatically done by JVM; explicit: done by user
        int a=300;
        byte b= (byte) a; //explicit casting -- data loss will happen here --narrowing
        long c=a; //implicit casting --widening

        //data is converted to binary code 1st and then bit wise data is taken as per explicit cast

        System.out.println(b);
        System.out.println(c);

        //int and float practical example
        int price=100;
        float gst= 15.55f;
        int sum=price+(int)gst; //value loss will happen due to float;
        System.out.println(sum);
        float sum2=price+gst;
        System.out.println(sum2); //always take the larger datatype to store
    }
}
