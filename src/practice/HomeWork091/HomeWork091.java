package practice.HomeWork091;

import java.util.Random;

public class HomeWork091 {
    public static void main(String[] args){
        System.out.println("ex 4.91");
        int x = 0;
        int y = 0;
        if (x > (-1)) {
            y = 1;
        }
        if (x < 0) {
            y = 0;
        }
        System.out.println(y);
        System.out.println("ex 4.91(b");
        x = 0;
        y = 0;
        if (x < 0) {
            y = 1;
        }
        if (x == 0) {
            y = 0;
        }
        if (x > 0) {
            y = -1;
        }
        System.out.println(y);
        System.out.println("ex 4.91(c");
        double x0 = 0;
        double y0 = 0;
        if (x0 == 0) {
            y0 = 1;
        }
        if (x0 < 0) {
            y0 = 0.5;
        }
        if (x0 > 0) {
            y0 = 1;
        }
        System.out.println(y0);

        System.out.println("ex 5.89");
        int n = 5;
        int faktorial = 0;
        int faktorial2 = 1;
        int summa = 0;
        for(int i = 1; i<=n; i++){
            faktorial = faktorial2*i;
            faktorial2 = faktorial;
            summa = summa + faktorial;
            System.out.println(faktorial);
        }
        System.out.println(summa);
        System.out.println("ex 6.110");
        int chislo = 123456;
        int cifra = 0;
        int i0 = 0;
        double w0 = 0;
        while (chislo > 0) {
            cifra = chislo %10;
            chislo = chislo/10;
            System.out.print(cifra);
        }
        System.out.println();
        System.out.println("ex 6.110(b");
        chislo = 123456;
        int chisl = chislo;
        cifra = 0;
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            i0++;
        }
        w0 = Math.pow(10,(i0+1));
        System.out.println("proverka " + w0);

        int result = (chisl*10+2)+(int)w0*2;
        System.out.println(result);
        System.out.println("ex 6.110(c");
        chislo = 123456;
        chisl = chislo;
        cifra = 0;
        i0 = 0;
        while (chislo > 0) {
            cifra = chislo%10;
            chislo =chislo/10;
            i0++;
        }
        int a = 5;
        cifra = 0;
        w0 = Math.pow(10,i0-1);
        while (chisl > 0) {
            cifra = chisl/(int)w0;
            chisl = chisl - ((int)w0*cifra);
            w0 = w0 /10;
            if (cifra != 5) {
                System.out.print(cifra);
            }
        }
        System.out.println();
        System.out.println("ex 6.110(d");
        chislo = 123456;
        chisl = chislo;
        cifra = 0;
        i0 = 0;
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            i0++;
        }
        w0 = Math.pow(10,i0-1);
        int pervayaCifra = chisl/(int)w0;
        int poslednyayaCifra = chisl%10;
        System.out.println("pervaya cifra chisla = " + pervayaCifra + " poslednyaya cifra chisla = " + poslednyayaCifra);
        System.out.println("ex 6.110(e");
        chislo = 123456;
        System.out.print(chislo);
        System.out.print(chislo);
        System.out.println();


        System.out.println("ex 7.111");
        int motocikli[] = {100,120,130,140,150};
        int avto[] = {5130,140,150,160,170};
        int summaMotociklov = 0;
        int summaAvto = 0;
        for(int i = 0; i<motocikli.length; i++){
            summaMotociklov = summaMotociklov + motocikli[i];
        }
        for(int i = 0; i<avto.length; i++){
            summaAvto  = summaAvto + avto[i];
        }
        if(summaAvto > (summaMotociklov*3)){
            System.out.println("verno");
        }
        else{
            System.out.println("ne verno");
        }


        System.out.println("ex 8.22");
        int kolichestvoStudentov[][] = new int[5][6];
        Random rnd = new Random();
        int naimenshee = 0;
        for(int i= 0; i<5; i++){
            for(int j = 0; j<6; j++){
            kolichestvoStudentov[i][j]  = rnd.nextInt(20)+10;
            naimenshee = naimenshee + kolichestvoStudentov[i][j];
        }
        }
        summa = 0;
        int menshe = naimenshee;
        for(int i = 0; i<5; i++){
            for(int j = 0; j<6; j++){
                summa = summa + kolichestvoStudentov[i][j];
            }
            if (menshe > summa) {
                menshe = summa;
            }
            summa = 0;
        }
        System.out.println(naimenshee);
        System.out.println("ex 8.22(b");
        menshe = naimenshee;
        int kurs = 0;
        int gruppa = 0;
        for(int i = 0; i<5; i++){
            for(int j = 0; j<6; j++){
                if(menshe> kolichestvoStudentov[i][j]){
                    menshe = kolichestvoStudentov[i][j];
                    kurs = i;
                    gruppa = j;
                }
            }
        }
        System.out.println("na " + (kurs+1) + " kurse "  + (gruppa+1) + " gruppa imeet naimenshee kolichestvo uchashhihsya");
        System.out.println("ex 8.22(c");
        menshe = naimenshee;
        kurs = 0;
        gruppa = 0;
        for(int i = 0; i<5; i++){
            for(int j = 0; j<6; j++){
                if(menshe < kolichestvoStudentov[i][j]){
                    menshe = kolichestvoStudentov[i][j];
                    kurs = i;
                    gruppa = j;
                }
                System.out.println("na " + (kurs+1) + " kurse " + (gruppa+1) + " gruppa samaya malochislennaya = " + menshe);
                menshe = naimenshee;
                kurs = 0;
                gruppa = 0;
            }
        }


        System.out.println("ex 11.82");
        int massiv[] = {1,2,3,4,99,98,97,96,95,94,93,92,91,90};
        summa = 0;
        i0 = 0;
        for(int i = 0; i<massiv.length; i++){
            if (massiv[i] > 10) {
               summa = summa + massiv[i];
               i0 ++;
            }
        }
        int sredneeArifmeticheskoe = summa/i0;
        System.out.println(sredneeArifmeticheskoe);

        System.out.println("ex 12.12");
        int massiv0[][] = {{11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25},
                {26,27,28,29,30}};
        //System.out.println(sredneeArifmeticheskoe);


        System.out.println("ex 13.9");

        Prokat prokat[] = new Prokat[3];
        prokat[0] = new Prokat();
        prokat[0].surname = "Petrov";
        prokat[0].name = "Petr";
        prokat[0].patronymic = "Petrovich";
        prokat[0].adress = "Moskva";
        prokat[0].homeNumber = 1234567;
        prokat[0].predmet = 1;

        prokat[1] = new Prokat();
        prokat[1].surname = "Nikolaev";
        prokat[1].name = "Nikolay";
        prokat[1].patronymic = "Nikolaevich";
        prokat[1].adress = "SanktPeterburg";
        prokat[1].homeNumber = 3456789;
        prokat[1].predmet = 2;

        prokat[2] = new Prokat();
        prokat[2].surname = "Aleksandrov";
        prokat[2].name = "Aleksandr";
        prokat[2].patronymic = "Aleksandrovich";
        prokat[2].adress = "Krasnodar";
        prokat[2].homeNumber = 8910234;
        prokat[2].predmet = 3;

        for(int i = 0;i<prokat.length; i++){
            if (prokat[i].predmet == 1) {
                System.out.println(prokat[i].surname + " " + prokat[i].name + " " + prokat[i].adress + " televizor");
            }
            }



        Strana rossiya = new Strana();
        rossiya.chislennost = 146745098;
        rossiya.plotnostNaseleniya = 8.57;
        rossiya.ploshhad = 17125191;

        Strana belarus = new Strana();
        belarus.chislennost = 9408400;
        belarus.ploshhad = 207600;
        belarus.plotnostNaseleniya = 46.7;

        Oblast KrasnodarskiyKray = new Oblast();
        KrasnodarskiyKray.chislennost = 5675462;
        KrasnodarskiyKray.ploshhad = 76000;
        KrasnodarskiyKray.plotnostNaseleniya = 75.19;

        System.out.println("ex 4.92");
        int tochka = 4;
        if (tochka < 1) {
            System.out.println("pervaya oblast");
        }
        if (tochka > 1 && tochka < 5) {
            System.out.println("vtoraya oblast");
        }
        if (tochka > 5) {
            System.out.println("tretya oblast");
        }
        System.out.println("ex 5.90");
        int proizvedenie = 1;
        n = 5;
        summa = 1;
        for(int i = 1; i<=n; i++){
            proizvedenie = proizvedenie * i;
            summa =  summa + (1/proizvedenie);
        }
        System.out.println(proizvedenie);

        System.out.println("ex 6.111");
        faktorial = 10;
        int otvet = 1;
        for(int i = 1; i<faktorial; i++){
            otvet = otvet* i+1;
        }
            System.out.println("proverka" + otvet);

        System.out.println("ex 7.112");
    }
}
