package Methodlar;

import java.util.Scanner;

public class BoyukReqemiTapanMethod {

    public static void enBoyuk (int reqem1,int reqem2) {
        if (reqem1>reqem2)
        {
            System.out.println("boyuk reqem : "+ reqem1);
        }

        else {
            System.out.println("boyuk reqem : " + reqem2);
        }



    }
    public static void main(String[] args) {

Scanner input =new Scanner(System.in);
        System.out.println("birinci reqemi yaz : ");
int reqem_1= input.nextInt();

        System.out.println("ikinci reqemi yazin : ");
int reqem_2 = input.nextInt();

enBoyuk(reqem_1,reqem_2);
    }
}

/*burda da yoxlayir ki userin girdiyir parametrli methodadahansi boyukdu , ve methodu asagida ayrica cagiraraq  boyuk olani cixarir.*/
