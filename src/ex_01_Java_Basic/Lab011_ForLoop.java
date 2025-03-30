package ex_01_Java_Basic;
//loops
public class Lab011_ForLoop {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(i);
        }

        //trickly example
        for(int i=0;i>10;i++){  //this code will not run as i=0 is not greater than 10
            System.out.println(i);
        }

//        for(int i=0;;i++){  //this code will run till infinity
//            System.out.println(i);
//        }

        //exit code: 0 : successful execution, exit code: 130: (stop by user- kill)

//        for(int i=0; ; ){
//            System.out.println("Hello"); //infinite loop as there is no condition
//        }
        System.out.println("Trick");
        int i=0;
        for(;i<10;i++){  //only initialization part can be outside loop
            System.out.println(i);
        }
        //continue: skip the below code and move to next iteration
        //break: move out of loop
    }
}
