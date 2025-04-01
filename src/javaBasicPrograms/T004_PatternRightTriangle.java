package javaBasicPrograms;

public class T004_PatternRightTriangle {
    public static void main(String[] args) {
        //wap top print a right angle triangle of size 5
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
