package switch_cases;

import java.util.Scanner;

public class _15_switch_cases {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("necenci kursda oxuyursunuz ? :");
        byte kurs_nomresi= input.nextByte();

        switch (kurs_nomresi) {
            case 1 :
                System.out.println("new");
                break;
            case  2 :
                System.out.println("normal");
                break;
            case  3 :
                System.out.println("genious");
                break;
            case 4 :
                System.out.println("advance man");
                break;
            default:
                System.out.println("someone else ");
        }



    }

}






