package Methodlar;

public class MetoduFerqliNovlerinCixarmaq {
    public static void ortalamaCixarmaq (int reqem1,int reqem2) {

        int toplama = reqem1+reqem2;
        double ortalama = toplama / 2 ;
        System.out.println(ortalama);
    }
    public static void ortalamaCixarmaq (int reqem1,int reqem2, int reqem3) {
        int toplama = reqem1+reqem2+reqem3;
        double ortalama = toplama / 3 ;
        System.out.println(ortalama);
    }

    public static void main(String[] args) {
       ortalamaCixarmaq(20,30,40);
       ortalamaCixarmaq(50,60);

       /* burda her iki metodun adi eynidi , amma funksiyalari ferqlidi cunki birinci ortalama cixarma metodunda 2 ededin ortalamasin cixarir ,
        2 ci de ise 3 ededin ortalamasini cixarir  ve bele emeliyata pverloadin emeliyati deyirler*/


    }
}
