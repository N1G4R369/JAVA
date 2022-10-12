package if_else_ve_swift_case_serti_and_or_not;

import java.util.Scanner;

public class _12_DERS_QIYMETI_HESABLAMA {

    public static void main(String[] args) {

            Scanner inputs = new Scanner(System.in);
            System.out.print("kollekum ortalama qiymetinizi yazin :" );
            int kollekkum_qiymet = inputs.nextInt();

            System.out.print("final imtahani  ortalama qiymetinizi yazin :" );
            int final_qiymeti = inputs.nextInt();

            double esas_ortalama  = (final_qiymeti *0.6) + (kollekkum_qiymet*0.4);
            System.out.println("umumi esas ortalama qiymetiniz  :" + esas_ortalama);

            if (esas_ortalama >=50) {
                        System.out.println("imtahani kecdiniz , tebrikler  !");
                        if (esas_ortalama >= 90) {
                            System.out.println("qiymetiniz - A ");
                        } else if (esas_ortalama >= 80) {
                            System.out.println("qiymetiniz - B");
                        } else if (esas_ortalama >= 70) {
                            System.out.println("qiymetiniz - C");
                        } else if (esas_ortalama >= 60) {
                            System.out.println("qiymetiniz - D");
                        }
            }


            else {
                        System.out.println("tessuf ki imtahandan  kesildiniz ");
                        if (esas_ortalama>=48)
                        {
                            System.out.println("qiymetiniz - E");
                        }
                        else {
                            System.out.println("qiymetiniz -F");
                        }
            }


        }
    }


