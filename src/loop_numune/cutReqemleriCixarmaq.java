package loop_numune;

import java.util.Scanner;

public class cutReqemleriCixarmaq {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("birinci reqemi yazin ");
        int birinci = input.nextInt();

        System.out.println("ikinci ededi yazin ");
        int ikinci = input.nextInt();


        System.out.println("--------------- \naradaki cut ededler :" );
        for (int i=birinci ; i<=ikinci; i++)
        {
            if(i%2==0 ) {
                System.out.println( i);
            }

        }
    }
}


/*yazgigimiz 2 reqemin arasinda yerlesen cut edeleri tapib ekrana cixarir*/
