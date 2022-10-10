package _5reqeminYazanaQederEdedleriToplayan;

import java.util.Scanner;

public class eyniProsesiDoWhileIleEtmek {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int toplama = 0;
       // int reqem ;

        int say=0;
        do {
            System.out.println("5 yaz :");
            //reqem=input.nextInt();
            say=input.nextInt();


            //if (reqem==5){
            if (say==5){

                break;
            }
           // say++;
           // toplama+=reqem;
            toplama+=say;
        }
        while(say<10);
        System.out.println("cavab :"+ toplama);
        System.out.println("bitdi");

    }
}
/* burda elave olaraq commente yazdigim yerleri commetden cixarsaq da isleyer amma diger  hisseleri commente salmaq lazim di */
/*sert 5 olana qeder girilen butun reqemleri toplayir . eger 5 olarsa da dayanir loop */
