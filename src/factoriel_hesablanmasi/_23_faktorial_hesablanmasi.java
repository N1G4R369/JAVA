package factoriel_hesablanmasi;
/* FAKTORIALIN TAPILMASI PROGRANIDI
* YANI MESELEN 5 YAZSAQ  OLCAAQ  -- > 1*2*3*4*5 =120 CAVABIN VERECEK */
import java.util.Scanner;

public class _23_faktorial_hesablanmasi {

    public _23_faktorial_hesablanmasi() {
    }

    public static void main(String[] args) {

        System.out.println("faktorial reqem yazin : ");
        Scanner inputss = new Scanner(System.in);
        int faktorialin_reqem_sayi = inputss.nextInt();
        int cavabi = 1;

        for (int i = 1 ;i <=faktorialin_reqem_sayi;i++)
        {
            cavabi= cavabi*i;
        }
        System.out.println("netice "+ cavabi);
    }

}





