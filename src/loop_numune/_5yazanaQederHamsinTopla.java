package loop_numune;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _5yazanaQederHamsinTopla {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int toplama = 0;
        int reqem ;
        while (true) {

            System.out.println("ekrana 5 yaz :");
            reqem = input.nextInt();
            toplama += reqem;
            if (reqem == 5) {
                break;

            }
        }
        System.out.println("ededlerin cemi " + toplama);

    }

    }

    /*burda ekrana 5 reqemi yazsan dayanacaq amma yazmasan onda her defe yazdigin reqemler opkanacaq ve netice olaraq sonda gorsedilecek*/

