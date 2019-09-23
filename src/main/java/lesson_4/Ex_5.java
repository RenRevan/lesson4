package lesson_4;

public class Ex_5 {
    public static void main(String[] arg){
        int sum;
        sum= min(2,4,6,8);
        System.out.print("Min = "+sum);

    }

    public static int min(int a, int b, int c, int d){
//
        int min1 = min(a, b);
        int min2 = min(c,d);

        return min(min1, min2);
    }

    public static int min(int a, int b){
        if(a<b){return a;}else{return b;}
    }
}
