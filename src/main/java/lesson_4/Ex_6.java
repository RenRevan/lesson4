package lesson_4;
import java.util.Scanner;


public class Ex_6 {
    public static int sum;

    public static void main(String[] arg){
        System.out.print("Enter digit: ");
        Scanner scanner=new Scanner(System.in);
        int d = scanner.nextInt();
        sum = getEvenDigitSum(d);
        System.out.print("Sum: "+sum);

    }

    public static int getEvenDigitSum(int digit){
        int e, even=0;
        while(digit!=0){
            e=digit%10;
            if(e%2==0){even=even+e;}
            digit=digit/10;
        }
        if (even>0){return even;} else {return -1;}

    }
}
