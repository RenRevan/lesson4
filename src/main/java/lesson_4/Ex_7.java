package lesson_4;

public class Ex_7 {
    public static void main(String[] arg){
        int a=21, b=49;
        System.out.print("Divisior of num "+a+" and "+b+": "+getGreatestCommonDivisior(a, b));

    }

    public static int getGreatestCommonDivisior(int first, int second){
        int i;
        i=(first<second) ? second:first;
        boolean b=false;
        if(first>=10 || second>=10){
        while (b!=true && i!=0){
            if (first%i==0 && second%i==0){
                return i;
            }
                i--;
        }
            return -1;
        }
        else if(first<10){System.out.print("First num <10"); return -1;}
        else{System.out.print("Second num <10"); return -1;}

    }
}
