package practice;

public class HomeWork035 {
    public static void main(String[] args){
        System.out.println("ex 2.37");
        int k = 14;
        if(1<k && k<99){
        int nomerPari = k-9;
        System.out.println(nomerPari);
        }

        System.out.println("ex 2.37(b");
        int k2 = 16;
        if (1 < k && k < 99) {
            int chislo = k2+9;
            System.out.println(chislo);
        }

        System.out.println("ex 2.37(c");


        System.out.println("ex 2.39");
        double hourse = 2;
        double minets = 20;
        double sekund = 35;
        double gradusHourse = hourse * 30;
        double gradusMinets = minets * (30./60);
        double gradusSekund = sekund * (30./60/60);
        double ugol = gradusHourse + gradusMinets + gradusSekund;
        System.out.println(ugol);

        System.out.println("ex 2.40");
        double q = 163.25;
        double minut = q/0.5;
        double chas = minut/60;
        System.out.println(chas);

        System.out.println("ex 5.82");
        int n = 5;
        int proizvedenie = 1;
        for(int i = 1; i<=n; i++){
            proizvedenie = proizvedenie * i;
            System.out.println(proizvedenie);
        }

        System.out.println("ex 5.85");
        int w = 12345;
        int tenThousand = w/10000;//1
        int ostatokTenThousand = w%10000;//2345
        int thousand = ostatokTenThousand/1000;//2
        int ostatokThousand = ostatokTenThousand%1000;//345
        int hundred = ostatokThousand /100;//3
        int ostatokHundred = ostatokThousand%100;//45
        int ten = ostatokHundred / 10;//4
        int one = ostatokHundred %10;//5
        System.out.println(one + "" + ten + "" + hundred + "" + thousand + "" + tenThousand);

        System.out.println("ex 5.86");
        int nn = 6;
        int summa = 0;
        int stepen = 0;
        for(int i = 1; i<=nn; i+=1){
            summa =  i;
            stepen = summa + (summa +2);
            System.out.println(stepen);

        }
        


        


    }
}
