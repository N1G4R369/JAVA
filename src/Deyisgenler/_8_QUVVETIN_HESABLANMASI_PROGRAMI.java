package Deyisgenler;

import java.util.Scanner;

public class _8_QUVVETIN_HESABLANMASI_PROGRAMI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("sistemin kutlesini yazin : ");
        int m = scanner.nextInt();

        System.out.println("sistemin deyerini yazin :");
        int a = scanner.nextInt();

        System.out.println("sistemin quvvetini hesabi :" + m*a);

        //ve ya neticeni yeni deyisgene mensisitib gormek de olar

        int f = m*a;
        System.out.println("sistemin quvvesinin hesabi : " + f);
    }

}
