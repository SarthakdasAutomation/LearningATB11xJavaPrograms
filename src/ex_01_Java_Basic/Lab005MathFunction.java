package ex_01_Java_Basic;

public class Lab005MathFunction {
    public static void main(String[] args) {
        int x=10,y=10,z=10;
        //find cube root of (x's square + y's square - abs of z using math.h)

        double result=0;
        result=Math.cbrt((Math.pow(x,2)+Math.pow(y,2))-Math.abs(z));
        //cbrt= cube root, pow= to calculate power, abs=absolute value

        System.out.println(result);
    }




}
