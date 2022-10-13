package Arraylar;

import java.util.Scanner;

public class ededler_yazib_array_icinde_muqaiseler {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[] reqemler = new int[10];
        int ilk_son_toplama=0;
        int umumiToplam=0;

        for (int i = 1; i<=5;i++)
        {
            System.out.println(i+".ci ededi yazin");
             reqemler[i]=input.nextInt();

             umumiToplam+=reqemler[i];
            System.out.println("umumi toplama : "+reqemler[i] );


        }


        System.out.println("umumi toplama : "+ umumiToplam );

        ilk_son_toplama=reqemler[1]+reqemler[5];
        System.out.println("ilktoplam : "+ilk_son_toplama);

        double ortalama =+ ilk_son_toplama/umumiToplam;
        System.out.println("ortalama qiymeti : "+ortalama );

    }
}


/*
 burda da umumi toplayir userin yazdigi 5 reqemi , sonra ilk ve son reqemleri toplayir,en sonda da ortalasin tapit
 */