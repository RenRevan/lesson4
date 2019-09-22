package lesson_4;

public class Ex_8 {
    public static void main(String[] arg){
        int c=10, r=4;

        while(c>0 && r>0){
            if(c>1){System.out.print("*");c--;}
            else{System.out.print("*\n");c=10;r--;}
        }
    }
}
