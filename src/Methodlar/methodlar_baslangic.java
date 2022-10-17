package Methodlar;

public class methodlar_baslangic {

    public static void ozunuTanitma(){
        System.out.println("ad : Nigar" );
        System.out.println("soyad : Kirilova" );
        System.out.println("yas :22 " );
        System.out.println("address : baki" );
        System.out.println("-----------------");
    }

    /* methodlari bele yaradiriq  usteki kimi (public static ile baslayan ) , esasen mainin ust hissesinde yaranir  ve deyerlerini veririk*/
    public static void main(String[] args) {

        ozunuTanitma();
        /* burda ise methodumuzu cagirirq adin yazaraq */

        ozunuTanitma();
        /*ve nece defe istesek cagira bilerik kod daxilinde bunu ve bunu uste deyisende her yerde cagiranda update olunmus versoyada cixir*/

        ozunuTanitma();

    }
}
