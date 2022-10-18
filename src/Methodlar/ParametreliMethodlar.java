package Methodlar;

import java.util.Scanner;

public class ParametreliMethodlar {

    public static void ortalamaTap(int reqem1 , int reqem2){
        int toplama = reqem1+reqem2;
        double ortalama=toplama/2;
        System.out.println(ortalama);
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("birinci reqemi yazin : ");
        int reqem_1 = input.nextInt();
        System.out.println("ikinci reqemi yazin : ");
        int reqem_2 = input.nextInt();
        ortalamaTap(reqem_1,reqem_2);
    }
}


/*burda yaratdigimiz methoda asagida mainin icinde de istifade ede bilerk deye parametrli yaziriq.*/