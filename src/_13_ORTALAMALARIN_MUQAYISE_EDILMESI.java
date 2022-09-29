import java.util.Scanner;

public class _13_ORTALAMALARIN_MUQAYISE_EDILMESI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("birinci userin kollekum qiymetin yazin  : ");
        int kollekum_1 = input.nextInt();
        System.out.println("birinci userin final qiymetin yazin  : ");
        int final_1 = input.nextInt();

        double umumi_ortalama_1= kollekum_1*0.2+final_1*0.4;
        System.out.println("birinci userin umumi esas ortalamasi : "+ umumi_ortalama_1);


        System.out.println("ikinci userin kollekum qiymetin yazin  : ");
        int kollekum_2 = input.nextInt();
        System.out.println("ikinci userin final qiymetin yazin  : ");
        int final_2 = input.nextInt();

        double umumi_ortalama_2= kollekum_2*0.2+final_2*0.4;
        System.out.println("ikinci userin umumi esas ortalamasi : "+ umumi_ortalama_2);


        if (umumi_ortalama_1>umumi_ortalama_2) {
            System.out.println("birinci userin daha coxdu ortalamasi");

        }
        else {
            System.out.println("ikinci userin daha coxdu ortalamasi ");
        }
    }
}
