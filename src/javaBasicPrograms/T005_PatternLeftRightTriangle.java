package javaBasicPrograms;

public class T005_PatternLeftRightTriangle {
    public static void main(String[] args) {
        //wap to print a left right an left triangle
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
