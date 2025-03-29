package ex_01_Java_Basic;

public class Lab004_Operators {
    public static void main(String[] args) {
        //types of operators@ arithmetic, logic, assignment, relational
        int a=5, b=2;
        int c=a%b; //modulus: gives the remainder
        System.out.println(c);

        //exception case
        //int divide by float will give bigger output, divide something by float will always give float
        float d=2f;
        System.out.println(a/b);
        System.out.println(a/d);

        //unary operator
        int e=-19;
        System.out.println(a);
        System.out.println(e);
        System.out.println(a+e);
        System.out.println(a-e);

        //operator overloading: + behaves differently for string and numeric values
        System.out.println(a+b);
        System.out.println("Sarthak"+"Das");

        //exception case --
        String fn="Sarthak";
        String ln="Das";
        System.out.println(fn+ln+a+b); //-- as 1st two are string, it takes rest as string
        System.out.println(a+b+fn+ln); // as on string arithmetic operation is not possible
    }
}
