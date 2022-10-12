package if_else_ve_swift_case_serti_and_or_not;

import java.util.Scanner;

public class _14_USERNAME_VE_PAROL_YOXLAMA {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("username yazin : ");
        String username = input.nextLine();

        System.out.println("password yazin : ");
        String password = input.nextLine();

        String user1="ADMIN";

        String password1="123456";

        if (username.equals(user1))
        {
            System.out.println("username duzdu");
            if (password.equals(password1))
            {
                System.out.println("parol duzdu");
                System.out.println("sisteme daxil oldunuz");
            }

        else {
                System.out.println("parol sehvdi");
            }

        }

        else {
            System.out.println("user ve parol sehvdir ");
            System.out.println("sistemden cixis edilir");
        }


        System.out.println( " ");
        System.out.println( "--------- 2 ci alternativ -------------");
        System.out.println( " ");

        ///// ALTERNATIVI ( EYNI NETICE ILE ISLEYIR)


        Scanner scanner = new Scanner(System.in);
        System.out.println("username yazin : ");
        String username2= scanner.nextLine();

        System.out.println("passwordunuzu yazin : ");
        String password2 = scanner.nextLine();

        if (username2.equals("ADMIN") && password2.equals("123456"))
        {
            System.out.println("sisteme girdiniz");
        }
         else
        {
            System.out.println("giris ugursuzdur ");
        }

    }
}
