 package Arraylar;


public class userinVerdiyiDataIleArrayYaratmaq {
    public static void main(String[] args) {
        int [][] arrays = new int[5][6];

        int reqem=0;

        for (int i = 0;i< arrays.length; i ++)
        {
            for( int j = 0; j< arrays[i].length;j++){

             arrays [i][j] = reqem;
            System.out.print(arrays [i][j]+" ");
            reqem +=2;
            }
            reqem+=8;
            System.out.println();
        }
        System.out.println("loop bitdi ");

    }
}
/*  burda da  serirleri 2 -2 artiran ,sutunlari ise 10 -10 artiran matrix yaradiriq.*/