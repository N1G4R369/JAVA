package Arraylar;

public class ArraycedvelKimiHamsinCixarmaq {
    public static void main(String[] args) {


            int [][] arrayi = {{5,15,25},{35,45,55},{65,75,85}};
            int toplama =0;
            int umumitoplam=0;

            for ( int i = 0;i<arrayi.length;i++) {
                toplama = 0;

                for (int j=0; j < arrayi[i].length; j++) {

                    System.out.print(arrayi[i][j]+" ");
                    toplama= toplama+ arrayi[i][j];
                }

                System.out.println();
                System.out.println(toplama);
                umumitoplam+=toplama;
            }
            System.out.println("umumi toplam : "+umumitoplam);

            System.out.println("dongu bitdi");

        }
}

/*yazilmis matrisleri hamisin biryerde list kimi cixarir ve onlari hem ayriliqda  hemde ki umumilikde toplatib cavab yazdirir*/