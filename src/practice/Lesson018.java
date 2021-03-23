package practice;

public class Lesson018 {
    public static void main(String[] args){
        System.out.println("ex 4.61");
        int q = 1587;
        int thousand = q/1000;//1
        int ostatok = q%1000;//587
        int handred = ostatok/100;//5
        int ostatok1 = ostatok%100;//87
        int ten = ostatok/10;
        int one = ostatok%10;
        if (thousand == one || handred == ten){
            System.out.println("chislo yavlyaetsya palindromom");
        }
        else {
            System.out.println("chislo ne yavlyaetsya palindromom");
        }

        System.out.println("ex 4.62");
        int w = 4377;
        int thousand1 = w/1000;
        int ostatok2 = w%1000;
        int handred1 = ostatok2/100;
        int ostatok3 = ostatok2%100;
        int ten1 = ostatok3/10;
        int one1 = ostatok%10;
        if ((thousand == handred1 && handred1 == ten1) || (handred1 == ten1 && ten1 == one1) || (ten1 == one1 && one1 == handred1) || (one1 == thousand1 && thousand1 == handred1)) {
        System.out.println("chislo soderzit 3 odinakovie");
        }
        else {
            System.out.println("chislo ne soderzit 3 odinakovih cifri");
        }

        System.out.println("ex 4.63");
        int e = 5399;
        int thousand2 = e/1000;
        int ostatok4 = e%1000;
        int handred2 = ostatok4/100;
        int ostatok5 = ostatok%100;
        int ten2 = ostatok5/10;
        int one2 = ostatok5%10;
        if (thousand2 == handred2 && handred2 == ten2 && ten2 == one2){
            System.out.println("");
        }

    }
}
