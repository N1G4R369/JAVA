import java.util.Date;
import java.util.Scanner;

public class _12_DERS_QIYMETI_HESABLAMA {

    public static void main(String[] args) {


            ////------
                Scanner input = new Scanner(System.in);
            System.out.println("kollekum ortalama qiymetinizi yazin :" );
            int kollekkum_qiymet = input.nextInt();

            System.out.println("final imtahani  ortalama qiymetinizi yazin :" );
            int final_qiymeti = input.nextInt();

            double esas_ortalama  = (final_qiymeti *0.6) + (kollekkum_qiymet*0.4);
            System.out.println("umumi esas ortalama qiymetiniz  :" + esas_ortalama);

            if (esas_ortalama >=50)
            {
                System.out.println("imtahani kecdiniz , tebrikler  !");
            }

            else {
                System.out.println("tessuf ki imtahandan  kesildiniz ");
            }


        }
    }


