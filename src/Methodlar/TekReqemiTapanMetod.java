package Methodlar;

import java.util.Scanner;

public class TekReqemiTapanMetod {

    public static boolean TekRemiYoxlayan (int reqem ) {
    boolean netice = true;
    for ( int i =2 ; i<reqem ; i++){
        if (reqem%i == 0){
            netice = false;
        }
    }
    return netice;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("bir reqem yazin : ");
        boolean deyer = TekRemiYoxlayan(input.nextInt());//TekRemiYoxlayan(8);
        if (deyer == true){
            System.out.println("reqem tek ededdi ");

        }
        else {
            System.out.println("reqem cutdu ");
        }
    }
}
/* burda da userin yazdigi datanin tek ve ya cut oldugun boolean tipi ile ayrica metodda   yoxlayir  */