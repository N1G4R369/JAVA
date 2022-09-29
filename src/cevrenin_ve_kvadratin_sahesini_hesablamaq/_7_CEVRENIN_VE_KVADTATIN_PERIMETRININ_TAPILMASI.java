package cevrenin_ve_kvadratin_sahesini_hesablamaq;

import java.util.Scanner;

public class _7_CEVRENIN_VE_KVADTATIN_PERIMETRININ_TAPILMASI {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("cevrenin radiusunu yazin :");
            int r = input.nextInt();
            double pi=3.14;
            double cevre_netice = 2*pi*r;
            System.out.println("cevre radius hesablama neticeniz : " + cevre_netice);
            System.out.println(" ");
            System.out.println(" ");
            /*cevrenin sahesini hesablayiriq */


            ////////////////

            System.out.print("kvadratinin enini yazin :");
            int en = input.nextInt();

            System.out.print("kvadratin uzunlugunu yazin :");
            int uzunluq = input.nextInt();

            System.out.print("kvadratin hecmini hesablama neticeniz :");
            int kvadrat_netice;
            kvadrat_netice = en * uzunluq ;
            System.out.println(kvadrat_netice);

            /*kvadratin sahesini hesablayiriq*/


    }

}
