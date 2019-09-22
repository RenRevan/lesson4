package lesson_4;

public class Ex_9 {
    public static void main(String[] arg){
        int r=7;

        for(int row=1;row<=r; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }
}
