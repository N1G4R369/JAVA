package yazian10ReqemiToplayibTekCuteAyirma;

import java.util.Scanner;

public class neticeniHisselereAyirma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int reqem ;
        int sayan = 0;

        int toplamaTek=0;
        int toplamaCut=0;

        while(sayan <10) {
            System.out.print((sayan+1) + ". reqemi yazin ");
            reqem = input.nextInt();

            if (reqem%2!=0) {
                toplamaTek += reqem;
                System.out.println(reqem + "tek ededddi");

            }
            else {
                toplamaCut += reqem;
                System.out.println(reqem  + "cut ededdi");

            }
            sayan++;
        }
        System.out.println("cut ededlerin cemi  " + toplamaCut);
        System.out.println("tek ededlerin cemi  " + toplamaTek);


    }

}


/*  burda user 10 dene reqem yazir yazdigi reqemlerin cut ve ya tek oldugu yazili ve sonda 10
 dene reqemin hamsin yadigda bitende cut ve tek reqemlerin ayriiqda cemi gorunur  */