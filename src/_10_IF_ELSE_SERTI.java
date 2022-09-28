import java.util.Scanner;

public class _10_IF_ELSE_SERTI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("reqem yazin : ");
        int reqem = scanner.nextInt();

        if (reqem>100){
         reqem = reqem / 2;
        }

        else {
            reqem = reqem*2;
        }
        System.out.println(reqem);


        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");



        Scanner scanners = new Scanner (System.in);
        System.out.println("reqem8 yazin : ");
        int reqem_8= scanners.nextInt();

        System.out.println("reqem9 yazin : ");
        int reqem_9= scanners.nextInt();

        int cem = reqem_8+reqem_9;

        if(cem>10)
        {
            System.out.println("tebrikler qazandiniz ");

        }
        else {
            System.out.println("qazanmadiniz ");
        }

    }
}
