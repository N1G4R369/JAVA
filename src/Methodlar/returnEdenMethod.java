package Methodlar;

public class returnEdenMethod {



    public static double ortalamaTap (int reqem1,int reqem2) {
    int toplama = reqem1+reqem2;
    int ortalam = toplama/2 ;
    return ortalam;
    }


    public static void main(String[] args) {
    ortalamaTap(10,5);


    /*
    burda return ile datani kenara cixarir eslinde amma gorunmur  data cunki daxilden isleyir pricess .
    bunu gormek ucun ise asagida onu ayrica bir deyisgene qoyub sout ile ekrana cixaririq
     */

    double netice = ortalamaTap(5,10);
        System.out.println(netice
        );
    }
}
