package loop_numune;

import java.util.Scanner;


public class netceniForIleYazmaq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int toplamacem = 0;
        int toplamatek = 0;

        int userinreqemi;


        for (int say = 1; say <= 10; say++) {
            System.out.println(say + " . reqem yazin");

            userinreqemi = input.nextInt();

            if (userinreqemi % 2 == 0) {
                System.out.println(userinreqemi + "cut ededi");
                toplamacem += userinreqemi;
            } else {
                System.out.println(userinreqemi + "tek ededdi");
                toplamatek += userinreqemi;
            }

        }

        System.out.println("umumi cem  " + toplamacem);
        System.out.println("umumi tek " + toplamatek);
    }
}

/*  burda user 10 dene reqem yazir yazdigi reqemlerin cut ve ya tek oldugu yazili ve sonda 10
 dene reqemin hamsin yadigda bitende cut ve tek reqemlerin ayriiqda cemi gorunur  */