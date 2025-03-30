package ex_01_Java_Basic;
//tricky questions for increment decrement operator
//pre and post are type types
//++a,a++ : pre and post increment
//--a,a==: pre and post decrement
public class Lab009_IncrementDecrementOperator {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a+++a); // a++ + a: 10 + 11(as a++ has increased value to 11
        int result= a++; //11
        System.out.println(a); //12
        System.out.println(result);
        System.out.println(a++ + ++a); //26. a=14
        System.out.println(++a + ++a); //31
        a=10;
        System.out.println(++a + a++ + a++); //34
        a=20;
        System.out.println(--a + a++ + a--); //58
    }
}
