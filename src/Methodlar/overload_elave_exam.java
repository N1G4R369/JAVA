package Methodlar;

import java.sql.SQLOutput;
import java.util.Scanner;

public class overload_elave_exam {
public static void qiymet_yazdir(String username ,int point ) {
    System.out.println(username + " adli userin qiymeti " + point);
}


 public static void qiymet_yazdir (String username) {
     System.out.println(username + " adli userin qiymeti : 0" );

 }


    public static void qiymet_yazdir (int point) {
        System.out.println(  "adsiz  userin qiymeti : "+ point );

    }


    public static void qiymet_yazdir () {
        System.out.println(  "adsiz  userin qiymeti : 0"  );

    }


    public static void main(String[] args) {
        System.out.println("username yaz  : ");
    Scanner input =new Scanner(System.in);

    String usernames = input.nextLine();
        System.out.println("point qiymeti yaz :");

        int point = input.nextInt();

        qiymet_yazdir(usernames);
        qiymet_yazdir(point);
        qiymet_yazdir(usernames,point);
        qiymet_yazdir();


        /*  burda da username ve point lazimli yerde istifadesi ucun userden sorusub elave edir methodun icinde ,
         baxmayatraq hamsi eynidi*/

    }
}
