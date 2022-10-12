package Deyisgenler;

import java.util.Scanner;

public class _6_ALINAN_DATALARLA_EMELIYATLAR {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("reqem1 yazin :");
            int reqem1 = input.nextInt();

            System.out.print("reqem2 yazin :");
            int reqem2 = input.nextInt();

            System.out.print("reqem3 yazin :");
            int reqem3 = input.nextInt();

            System.out.print("neticeniz :");
            int netice;
            netice = reqem1+reqem2 -reqem3 ;
            System.out.println(netice);

            /*burda ise userden aldigimiz datanlari netice olaraq toplayib  ,cixib ekrana yazdirir ekranda cavabi goruruk*/
        }

}
