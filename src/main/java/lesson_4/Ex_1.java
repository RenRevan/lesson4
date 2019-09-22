package lesson_4;

public class Ex_1 {
    public static void main(String[] arg){
//        "1. Print numbers from 10 to 20 using all known cycles.

        int i3=10;

        System.out.println("while cycle:");
        while(i3<=20){
            System.out.print(i3+" ");
            i3++;
        }

        i3=10;
        System.out.println("\ndo.. while cycle:");
        do{
            System.out.print(i3+" ");
            i3++;
        }while(i3<=20);


        System.out.println("\nfor cycle:");
        for(i3=10;i3<=20;i3++){
            System.out.print(i3+" ");
        }


    }
}
