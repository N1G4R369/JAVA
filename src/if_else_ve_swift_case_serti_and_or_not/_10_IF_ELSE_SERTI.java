package if_else_ve_swift_case_serti_and_or_not;

import java.util.Scanner;

public class _10_IF_ELSE_SERTI {
    public static void main(String[] args) {

        System.out.println("-----------------------birinci  numune ------------------------");

        ///birinci numune


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

        System.out.println("-----------------------ikinci numune ------------------------");

        ///ikinci numune
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


        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");



        System.out.println("-----------------------ucuncu numune ------------------------");
        /// ucuncu nummune


        Scanner my_input= new Scanner(System.in);
        System.out.println("reqem yazin : ");
        int reqem10 = my_input.nextInt();

        if (reqem10 >100){
            reqem10=reqem10/2;
        }

        else if(reqem10==100){
            //burda bos qoyuruq yani reqem 100 e beraberdise hecne eleme sadece reqemin ozun cixar ekrana , o funksiya da en  asagida printde var
        }
        else {
            reqem10=reqem10*2;
        }
        System.out.println(reqem10);



    }
}
