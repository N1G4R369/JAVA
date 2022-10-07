package loop_numune;

import java.util.Scanner;
/* 10 dene ozunden reqem yazirsan ve sonda onlari toplayib neticeni yazdirir*/
public class _22_loop_numuneleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total= 0;
        int reqem;
        for (int i=0 ;i<10;i++)
        {
            System.out.println((i+1) +"-ci reqemi yazin ");
            reqem = input.nextInt();
            total= reqem+total;
        }
        System.out.println("yazdiginiz reqemlerin cemi : " +total);
    }
}
