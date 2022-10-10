package break_continue;

import java.util.Scanner;

public class breakwhileNumune {
    public static void main(String[] args) {
        int i= 1 ;
        while(i<=10)
        {
            if(i==6){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("1 . dongu bitdi");
        /*serti yoxlayir ki 10 dan  boyuk olsun ve eger sert 6 olsa onda onu pass kecsin diger reqeme (7 e) kecsin*/


        int j= 1 ;
        while(j<=10)
        {
            if(j==6){

                break;
            }
            System.out.println(j);
            j++;
        }
        System.out.println("2 . dongu bitdi");

        /*serti yoxlayir ki 10 dan  boyuk olsun ve eger sert 6 olsa onda dayanir dongu daha yeniden evvele qayitmir*/


        System.out.println("--------------------------\n----------------------");
        Scanner input =new Scanner(System.in);

        int n ;
        while(true)
        {
            System.out.println("6 reqemin yaz ekrana ");
            n=input.nextInt();

            if(n==6){
                break;
            }

        }
        System.out.println("2 . dongu bitdi");
    }
}


/*serti yoxlayir ki userin yazdigi sert   6 olsun onda dayanir dongu daha yeniden evvele qayitmir*/


