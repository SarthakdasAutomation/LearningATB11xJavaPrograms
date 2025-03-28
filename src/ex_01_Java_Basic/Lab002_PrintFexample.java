package ex_01_Java_Basic;



public class Lab002_PrintFexample {
    public static void main(String[] args) {
        byte a=9,b=1;   //choose byte here to save memory, range: -128 to 127
        System.out.printf("%dx%d = %d%n",a,b,(a*b++));  //here, we have changed byte to int
        System.out.printf("%dx%d = %d%n",a,b,(a*b++));  //printf is used to change the format while printing
        System.out.printf("%dx%d = %d%n",a,b,(a*b++));  //%n is used for new line
        System.out.printf("%dx%d = %d%n",a,b,(a*b++));
        System.out.printf("%dx%d = %d%n",a,b,(a*b++));
        System.out.printf("%dx%d = %d%n",a,b,(a*b++));
        System.out.printf("%dx%d = %d%n",a,b,(a*b++));
        System.out.printf("%dx%d = %d%n",a,b,(a*b++));
        System.out.printf("%dx%d = %d%n",a,b,(a*b++));
        System.out.printf("%dx%d = %d%n",a,b,(a*b));
    }
}
