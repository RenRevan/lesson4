package lesson_4;

public class Ex_11 {
    public static void main(String[] arg){
        int c=11, r=6, empty_col=5;

        for(int row=1;row<=r; row++) {
            for (int col = 1; col <= c; col++) {
                if(col<empty_col+1 || col>empty_col+row+(r-empty_col-1))
                {System.out.print(" ");}
                else{System.out.print("*");}
            }
            empty_col--;
            System.out.print("\n");
        }


    }
}
