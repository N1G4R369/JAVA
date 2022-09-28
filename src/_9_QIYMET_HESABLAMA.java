import java.util.Scanner;

public class _9_QIYMET_HESABLAMA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nece eded komputer almaq isteyirsiniz ? :");
        int komputer = scanner.nextInt();
        int komputer_pulu = 3000 * komputer;

        System.out.println("nece eded server almaq isteyirsiniz ? :");
        int server = scanner.nextInt();
        int server_pulu = server*8000;

        System.out.println("nece eded network switch almaq isteyirsiniz ? :");
        int switches = scanner.nextInt();
        int switches_pulu = switches*500;

        int hesab= komputer_pulu+server_pulu+switches_pulu;
        System.out.println(" umumi odemeli oldugunuz mebleq : " + hesab + " azndir");
        
                /* burda da verdiyimiz esyalari musterinin secdiyi saya uygun umumi odenmilmeli meblegi hesablayib musteriye gorsedir*/


    }
}
