package lesson_4;

public class Ex_3 {
    public static void main(String[] arg){
        int[] arr=new int[101];
        int a=0;
        for (int i=100;i>=0;i--){
            arr[a]=i;
            System.out.println("arr{"+a+"} = "+arr[a]);
            a++;
        }
    }
}
