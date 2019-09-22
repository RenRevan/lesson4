package lesson_4;

public class Ex_10 {
    public static void main(String[] arg){
        int c=10, r=5;

        for(int row=1;row<=r; row++) {
            System.out.print("*");
            if(row==1||row==r){
                for (int col = 1; col <= c-2; col++) {
                    System.out.print("*");
                }
            }
            else{
                for (int col = 1; col <= c-2; col++) {
                    System.out.print(" ");
                }
            }
            System.out.print("*\n");
        }
    }
}
