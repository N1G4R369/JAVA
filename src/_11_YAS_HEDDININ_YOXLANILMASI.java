import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.Date;
import java.util.Scanner;

public class _11_YAS_HEDDININ_YOXLANILMASI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("tevvelludunuzu yazin : ");
        int tevvellud = input.nextInt();

        // burda userin yazdigi tevvelude gore onun yasini cixarir (sysdate - tevvelud funksiyasi ile)
       // buradan
        Date inputs=new Date();
        int year=inputs.getYear();
        int currentYear=year+1900;
        System.out.println("hazirda olduugumuz il budur  : "+currentYear);
         int yas = currentYear - tevvellud;
        System.out.println("sizin yasiniz  : " + yas );
        //bura qeder olan hisse internetde taodigim kodda etdiyim deyisikle yazilib.
        // kursdaki dersde manual yazirdi oldugumuz ili(2022 kimi) men ise sysdate kimi deyisdim
        // bir il kecse de eyni netice isle avtomatik islesin deye

        if (yas >=18) {
            System.out.println("yas heddiniz uygundur sendeler ucun ");

        }

        else {
            System.out.println("yas hediiniz senedler verilmesi ucun uygun deyildir");
        }
    }
}
