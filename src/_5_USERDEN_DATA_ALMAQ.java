import java.util.Scanner;
/*userden melumati ekran kenari istifade etmek ucun olan kod */


public class _5_USERDEN_DATA_ALMAQ {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("reqem yazin :");
        int reqem = input.nextInt();
        /*cburda da userden data aliriq , sistem baslayanda ozu el ile reqemi yazir asagida*/

        int netice;
        netice = reqem *20 ;
        System.out.println(netice);

        /*burda ise userden aldigimiz datani netice olaraq 5 e vurub , ekranda cavabi goruruk*/
}
}