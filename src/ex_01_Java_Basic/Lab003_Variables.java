package ex_01_Java_Basic;

public class Lab003_Variables {
    public static void main(String[] args) {
        //comments single line

        /*bloc comment
        * used for multiple lines
        * sarthak
        * -----*/

        //different types of variable in java
        boolean b=true; // or false,
//        boolean b1=True; this will give error as True or False, caps is not applicable
        System.out.println("Boolean: "+b);
        byte b1=1; //range -128 to 127
        System.out.println("byte: "+b1);
        char c='a'; //value gets converted into ASCII, range 0 to 65535, single place only
        //char c='1'; //this is also valid
        System.out.println("Char: "+c);
        short s=12456; //range -32768 to 32767
        System.out.println("Short: "+s);
        int i=1214344567; //range -2147483648 to 2147483647
        System.out.println("int: "+i);
        long l=1234567890123L; //L or l needed to be used
        System.out.println("long: "+l);
        float f=122.344567555555555f; //f or F need to be mentioned, print up to 5 places after decimal
        System.out.println("Float: "+f);
        double d=1223234.31233983424; //up to 10 places after decimal
        System.out.println("Double: "+d);
        System.out.printf("Decimal formating: %.7f%n",d); //formating up to 7 decimal places
        String s1="Asd";
        System.out.println("String: "+s1);

        final float pi=3.14f; //constant: value cannot be changed throughout the program
        /* pi++; //error */

        //escape sequence
        char newLine='\n';
        char tab_line='\t';
        char backspace='\b';
        char carriage_return='\r';

        System.out.println("Sarthak Das");
        System.out.println("Sarthak"+newLine+"Das");
        System.out.println("Sarthak"+tab_line+"Das");
        System.out.println("Sarthak"+backspace+"Das");
        System.out.println("Sarthak"+carriage_return+"Das"); //use to remove the 1st string, here in case Sarthak will get removed

        //new line printing
        System.out.println("Hi, This is 1st line\n This is second line \n This is 3rd line ");

        //below 3 are just for knowledge
        int binary_num=0b1010; //storing binary number, start with 0b, number =10
        int octal_num=0101; //octal use 0: number8
        int hexaDec=0Xface; //base 16
    }
}
