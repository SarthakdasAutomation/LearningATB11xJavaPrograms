package Tuition;

public class TypeCasting {
    public static void main(String[] args) {
        //Type casting: it is used when we have to store a variable of different return type into other variable
        //Types: widening | narrowing
        //process: implicit |explicit
        // applicable for both

        byte a= 122;
        int b=a; //implicite widening
        int c= (int)a; //explicit widening : not required when converting to a data type of bigger size

        long d= 1234567L;
        int e= (int)d; //explicite narrowing: when ever there is nnarrowing, we will use explicite type casting

        //try for diff data types
        //float //double

        //practical example
        int price= 200;
        float gst= 36.56f;

        float total= price +gst;
       // int total= price + (int)gst; --memory loss
        System.out.println(total);
    }
}
