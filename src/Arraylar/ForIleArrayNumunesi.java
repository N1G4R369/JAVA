package Arraylar;

public class ForIleArrayNumunesi {
    public static void main(String[] args) {

        System.out.println("-----------------1cu numune-----------");

        int [] reqemler = {12,6,4,47,124,540};
        String [] adlar = {"nigar", "Ali", "tesla", "einstein"};
        for (int i = 0;i<reqemler.length;i++)
        {
            System.out.println(reqemler[i]);

        }

        System.out.println("-----------------2cu numune-----------");

        for (int j = 0; j<adlar.length;j++)
        {
            System.out.println(adlar[j]);
        }

        System.out.println("-----------------3cu numune-----------");
        for (int reqem : reqemler){
            System.out.println(reqem);
        }

    }

}
