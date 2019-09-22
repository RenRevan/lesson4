package lesson_4;

public class EX_4 {
    public static void main(String[] arg){
        int arr[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int sum=0;
        for(int i=1;i<9;i++){
            sum=sum+arr[i];
        }
        System.out.print("Sum = "+sum);
    }
}
