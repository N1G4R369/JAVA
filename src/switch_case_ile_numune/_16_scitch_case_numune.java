package switch_case_ile_numune;

import java.util.Scanner;

public class _16_scitch_case_numune {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;
        System.out.print("oxumaq istediyiniz sheher adin secin  :");

        String sheher=input.nextLine();

        switch (sheher) {

            case  "new york"
                 :
                System.out.println("buradaki uni 8000 usd-dir ");
            break;

            case "los angels"
                :
                System.out.println("buradaki uni 9000 usd-dir ");
                break;

            case "washington"
                    :
                System.out.println("buradaki uni 7000 usd-dir ");
                break;

            case "miami"
                    :
                System.out.println("buradaki uni 6500 usd-dir ");
                break;

            case "chikago"
                    :
                System.out.println("buradaki uni 5600 usd-dir ");
                break;

            default:
                System.out.println("duzgun sheher adi yazin ! ");

        }

    }
}
