package operator_numunesi;

import java.util.Scanner;
//3 dene reqem yazir user oda yoxlayir eger bu ededlerden hec olmasa biri 2 e bolunurse onda  tebrikler sozu gelir
// amma hecbir 2 e bolunmurse onda uduzdunuz yazilir .
public class _18_operator_numune {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1 ci reqemi yazin :");
        int reqem1 = input.nextInt();

        System.out.println("2 ci reqemi yazin :");
        int reqem2 = input.nextInt();

        System.out.println("3 ci reqemi yazin :");
        int reqem3 = input.nextInt();

        if (reqem1%2==0 || reqem2%2==0 || reqem3%2==0)
        {
            System.out.println("tebrikler ");
        }
        else
        {
            System.out.println("no no nooo uduzdunuz ");
        }
    }
}
