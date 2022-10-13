package Arraylar;

import java.util.Scanner;

public class ededler_yazib_array_icinde_muqaiseler {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[] reqemler = new int[10];
        int ilk_son_toplama=0;

        for (int i = 1; i<=5;i++)
        {
            System.out.println(i+".ci ededi yazin");
             reqemler[i]=input.nextInt();
             System.out.println(reqemler[i]);



        }
        ilk_son_toplama=reqemler[1]+reqemler[5];
        System.out.println("toplam : "+ilk_son_toplama);


    }
}
