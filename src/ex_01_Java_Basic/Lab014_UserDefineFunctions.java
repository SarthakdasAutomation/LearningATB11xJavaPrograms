package ex_01_Java_Basic;

public class Lab014_UserDefineFunctions {
    public static void main(String[] args) {
        getting();
        System.out.println(main()); //calling another main method
        System.out.println(main(2.3f));
    }

    //always use static before defining a function
    static void getting(){
        System.out.println("Hi!!!");
    }

    //interview question, can we have multiple main method: yes we can, but with different parameter and return type: method overloading

    static int main(){
        return 1;
    }

    static float main(float f){
        return f;
    }
}
