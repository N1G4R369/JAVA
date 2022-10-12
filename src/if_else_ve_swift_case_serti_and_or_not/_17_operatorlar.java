package if_else_ve_swift_case_serti_and_or_not;

public class _17_operatorlar {
    public static void main(String[] args) {

        int reqem= 10;
        reqem += 5;  //reqem deyisgenin  5ile toplayib yeniden reqem qutusunun icine atir
        System.out.println(reqem);
        reqem -= 5; //reqem deyisgenin  5ile cixib  yeniden reqem qutusunun icine atir
        System.out.println(reqem);
        reqem *= 5;//reqem deyisgenin  5ile vurub  yeniden reqem qutusunun icine atir
        System.out.println(reqem);
        reqem /= 5;//reqem deyisgenin  5ile bolub  yeniden reqem qutusunun icine atir
        System.out.println(reqem);


        reqem++;   //reqem deyisgenini uzerine 1 gelir
        System.out.println(reqem);
        reqem--; //reqem deyisgeninden 1 cixir
        System.out.println(reqem);

/////////////////////////////////////

//burda yoxlayir ki ,reqem 10 dan boyuk olsun ve eyni zamanda da 2 e tam bolunsun qaliqsiz ,
        //her iki sert duzduse , dogru deyilse yalnis yazdirir

        int reqem1 = 8;
        if (reqem1 >=10 && reqem1%2==0)
        {
            System.out.println("dogru ");
        }
        else
        {
            System.out.println("yalnis ");
        }

        int reqem2 = 20;
        if (reqem2 >=10 && reqem2 %2==0)
        {
            System.out.println("dogru ");
        }
        else
        {
            System.out.println("yalnis ");
        }


        /////////////////////////////////////

//burda yoxlayir ki ,reqem 10 dan boyuk olsun yada ki da 2 e tam bolunsun qaliqsiz ,
        //hertlerden hecolmasa biri dogrudusa , dogru deyilse yalnis yazdirir


        int reqem3 = 7;
        if (reqem3 >10 || reqem3 %2==0)
        {
            System.out.println("dogru ");
        }
        else
        {
            System.out.println("yalnis ");
        }

        int reqem4 = 50;
        if (reqem4 >10 || reqem4 %2==0)
        {
            System.out.println("dogru ");
        }
        else
        {
            System.out.println("yalnis ");
        }



    }

}
