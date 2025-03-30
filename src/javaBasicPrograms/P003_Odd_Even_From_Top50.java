package javaBasicPrograms;

public class P003_Odd_Even_From_Top50 {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }
            //alternative way
            for(int i=1;i<=50;i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                    continue;
                }
                System.out.println(i + " is Odd");
            }

    }
}
