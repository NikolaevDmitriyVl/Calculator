package practice;

public class Lesson064 {
    public static void main(String[] args) {
        System.out.println("ex 6.46(a");
        int chislo = 7230456;
        int chisl = chislo;
        int cifra = 0;
        int i = 0;
        int summa = 0;
        int proizvedenie = 1;
        int w[] = new int[10];
        while (chislo > 0) {
            cifra = chislo % 10;
            chislo = chislo / 10;
            summa = summa + cifra;
            proizvedenie = proizvedenie * cifra;
            w[i] = cifra;
            i++;

        }
        if (summa > 10) {
            System.out.println("summa bolshe 10");
        } else {
            System.out.println("summa menshe 10");
        }

        System.out.println("ex 6.46(b");
        if (proizvedenie < 50) {
            System.out.println("proizvedenie menshe 50");
        } else {
            System.out.println("proizvedenie bolshe 50");
        }

        System.out.println("ex 6.46(c");
        if (i % 2 == 0) {
            System.out.println("kolichestvo cifr chetnoe chislo");
        } else {
            System.out.println(" kolichestvo cifr ne chetnoe chislo");
        }

        System.out.println("ex 6.46(d");
        if (i == 4) {
            System.out.println("chislo shetirehznachnoe");
        } else {
            System.out.println("chislo ne chetirehznachnoe");
        }

        System.out.println("ex 6.46(e");
        System.out.println("w[" + i + "]" + cifra + w[0]);
        if (w[i-1] <= 6) {
            System.out.println("pervaya cifra ne previshaet 6");
        } else {
            System.out.println("pervaya cifra previshaet 6");
        }

        System.out.println("ex 6.46(function10_1");
        if(cifra == w[0]){
            System.out.println("pervaya i poslednyaya cifri ravni");
        }
        else{
            System.out.println("pervaya i poslednyaya cifri ne ravni");
        }

        System.out.println("ex 6.46(e");
        if(cifra>w[0]){
            System.out.println("pervaya cifra bolshe posledney");
        }
        else{
            System.out.println("poslednyaya cifra bolshe pervoy");
        }

        System.out.println("ex 6.47(a");
        chislo = 123456;
        cifra = 0;
        i = 0;
        summa = 0;
        int a = 212345;
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            summa = summa + cifra;
            i++;
        }
        if (summa < a) {
            System.out.println("summa menshe a");
        }
        else{
            System.out.println("summa bolse a");
        }

    }
}

