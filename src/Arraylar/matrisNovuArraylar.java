package Arraylar;

import java.util.Arrays;

public class matrisNovuArraylar {

    public static void main(String[] args) {

        int [] [] array=new int [4][4];

        array [0] [0]=5;
        array [0] [1]=15;
        array [0] [2]=25;
        array [1] [0]=35;
        array [1] [1]=45;
        array [1] [2]=55;
        array [2] [0]=65;
        array [2] [1]=75;
        array [2] [2]=85;

        System.out.println(array [1] [0]);


        int [] [] array2 = { {5,15,25} , {35,45,55}, { 65, 75 ,85}};

        System.out.println(array2[1][2]);



    }
}

/* array 1 array 2 nin alternatividi (eynidi qisa formas , cedvel kimidi ,[1][0] burda meselen 1 setiri bildiri , 0 ise sutunu
* diger numunede ise  1 setiri (her vergullu hisse setir kimidi) , 2 ise sutunu bildirir   */
