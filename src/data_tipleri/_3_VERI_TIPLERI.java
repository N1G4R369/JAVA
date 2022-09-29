package data_tipleri;

public class _3_VERI_TIPLERI {


    public static void main(String[] args) {
        System.out.println("Hello world!");

        byte kicik_eqem= 125;
        System.out.println(kicik_eqem);
        //bu en kicik data tipidir. bir bayt deyerindedi  ve -128 den  + 127 e qeder olan reqemleri ozunde sxlaya bilir.

        short adi_reqem=32000;
        System.out.println(adi_reqem);
        //byte dan daha boyuk reqemleri ozunde saxlayir ,integerden kicikdi ama

        int umumi_reqem= 541285745;
        System.out.println(umumi_reqem);
        // 2 milliarda qeder olan reqemleri ozunde saxlayir

        long boyuk_reqem = 1631456511;
        System.out.println(boyuk_reqem);
        //en boyuk data tipidi

        double kesr_eded =96.3;
        System.out.println(kesr_eded);
        ////kesr edeleri ozunde saxliyir

        char karakter = '$';
        System.out.println(karakter);
        // buda strfleri falan yadda saxliyir
    }
}