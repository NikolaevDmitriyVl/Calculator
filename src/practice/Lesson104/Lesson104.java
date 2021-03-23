package practice.Lesson104;

public class Lesson104 {
    public int[] funkciya(int chislo){
        int chislo0 = chislo;
        int cifra = 0;
        int i0 = 0;
        while (chislo0 > 0) {
            cifra = chislo0%10;
            chislo0 = chislo0/10;
            i0++;
        }
        double w = Math.pow(10,(i0-1));
        int w0 = (int)w;
        cifra = 0;
        int massiv[] = new int[i0];
        i0 = 0;
        while(i0<massiv.length){
            cifra = chislo/w0;
            chislo = chislo-(cifra *w0);
            w0 = w0/10;
            massiv[i0] = cifra;
            i0++;
        }
        return massiv;

    }
    public static void main(String[] args){
         Lesson104 answer = new Lesson104();
         int chislo = 123456;
         int x[] = answer.funkciya(chislo);

         for(int i = 0; i<x.length;i++){
         System.out.println(x[i]);
         }

         System.out.println("ex 6.46(a");
         chislo = 987654;
         int mass[] = answer.funkciya(chislo);
         int summa = 0;
         for(int i= 0; i<mass.length; i++){
             summa = summa + mass[i];
         }
        if (summa > 10) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        System.out.println("ex 6.46(b");
        int u = 123456;
        int proizvedenie = 1;
        int mas1[] = answer.funkciya(u);
        for(int i = 0; i<mas1.length; i++){
            proizvedenie = proizvedenie * mas1[i];
        }

        if (proizvedenie < 50) {
            System.out.println("proizvedenie menshe 50");
        }
        else{
            System.out.println("proizvedenie bolshe ili ravno 50");
        }

        System.out.println("ex 6.46(c");
        


    }
}
