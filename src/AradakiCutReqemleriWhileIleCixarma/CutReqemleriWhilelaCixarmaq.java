package AradakiCutReqemleriWhileIleCixarma;

import java.util.Scanner;

public class CutReqemleriWhilelaCixarmaq {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("birinci reqemi yazin :");
        int birinci = input.nextInt();


        System.out.println("ikinci reqemi yazin :");
        int ikinci = input.nextInt();

        int i = birinci;
            while (i <ikinci){
                i++;
                if (i%2==0) {
                    System.out.println("cut reqemler :"+i);

                }
            }
    }

}
