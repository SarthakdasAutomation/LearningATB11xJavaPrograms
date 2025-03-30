package ex_01_Java_Basic;

public class Lab007_TernaryOperator {
    public static void main(String[] args) {
        //ternary operator
        //syntax: result = condition ? True value : False value
        int age=15;
        String canVote= age >= 18 ? "can vote" : "can't vote" ;
        System.out.println(canVote);

        //nested ternary
        int num=-6;
        String res= num>0 ? (num%2==0?"Positive and even":"Positive and odd") : "Negative";
        System.out.println(res);

        System.out.println(Math.max(age,num));

    }
}

