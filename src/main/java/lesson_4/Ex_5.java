package lesson_4;

public class Ex_5 {
    public static void main(String[] arg){
        int sum;
        sum= min(2,4,6,8);
        System.out.print("Sum = "+sum);

    }

    public static int min(int a, int b, int c, int d){
        int s1;
        s1 = min(a, b)+c+d;
        return s1;
    }

    public static int min(int a, int b){
        int s2;
        s2= a+b;
        return s2;
    }
}
