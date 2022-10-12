package Arraylar;

public class arraylar_baslangic {
    public static void main(String[] args) {

        System.out.println("hello");
        int[] reqemler = new int[5];

        reqemler[0]=12;
        reqemler[1]=5;
        reqemler[2]=68;
        reqemler[3]=80;
        reqemler[4]=71;

        System.out.println(reqemler[0]);


        /*ve ya bu usulla da etmek olar daha rahat */


        int[] reqemler2 = {12,13,57,854,451};

        System.out.println(reqemler2[3]);


        /*ve ya text metni kimi adam adlarini da yazmaq olar */

        String [] adlar = {"nigar", "ali","tesla","davinci ","einstein"};
        System.out.println(adlar[4]);
    }
}
