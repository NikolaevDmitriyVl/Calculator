package practice;

public class HomeWork081 {
    public static void main(String[] args){
        System.out.println("ex 4.65");
        int  god = 400;
        if (god % 100 == 0) {
            if (god % 400 == 0) {
                System.out.println("god yavlyaetsya visokosnim");
            }
            else{
                System.out.println("god ne yavlyaetsya visokosnim");
            }
        }
        else{
            if (god % 4 == 0) {
                System.out.println("god yavlyaetsya visokosnim");
            }
            else{
                System.out.println("god ne yavlyaetsya visokosnim");
            }
        }

        System.out.println("ex 5.65");
        int kolvoZiteley[] = {1,2,3,4};
        int plotnostNaseleniya[] = {9,8,7,6};
        int summa1 = 0;
        int summa2 = 0;
        for(int i = 0; i<kolvoZiteley.length; i++){
            summa1 = summa1 + kolvoZiteley[i];
            summa2 = summa2 + plotnostNaseleniya[i];
        }
        int ploshhad = summa2 /summa1;
        System.out.println(ploshhad);

        System.out.println("ex 6.88");//???
        int i = 10;
        while (i <= 30) {
            System.out.println(i);
            i++;
        }
        System.out.println("ex 6.88(b");//???
        int a = 10;
        do {
            System.out.println(a);
            a++;
        }
        while(a<30);

        System.out.println("ex 7.89");
        int n = 4;
        int b = 3;
        int q[] = {1,2,3,4};
        int summa = 0;
        for(i = 0; i<q.length; i++){
            summa = summa + q[i];
        }
        if (summa % b == 0) {
            System.out.println("summa chisel kratna b");
        }
        else{
            System.out.println("summa chisel ne kratna b");
        }

        System.out.println("ex ");
    }
}
