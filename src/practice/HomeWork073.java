package practice;

import java.util.Random;
import java.util.Scanner;

public class HomeWork073 {
    public static void main(String[] args){
        System.out.println("ex 4.44");
        int a = 5;
        int b = 3;
        int c = 2;
        int d = 1;
        if (a % b == c || a % b == d) {
            System.out.println("verno");
        }
        else{
            System.out.println("ne verno");
        }

        System.out.println("ex 5.44");
        int q[] = new int[7];
        Random rnd = new Random();
        int obshhayaMassa = 0;
        for(int i = 0; i< q.length; i++){
            q[i] = rnd.nextInt(30);
            obshhayaMassa = obshhayaMassa + q[i];
        }
        System.out.println(obshhayaMassa);

        System.out.println("ex 6.66");
        int w[] = {1,2,3,4,4,6,-1};
        a = 0;
        b = 0;
        int i0 = 0;
        boolean proverka = false;
        for(int i = 0; i<w.length-1; i++){
            if(w[i] == w[i+1]){
                proverka = true;
              a = i;
              b = i+1;
              break;
            }
        }
        if (proverka == true) {
            System.out.println("est para sosednih odinakovih chisel " + a + " i " + b);
        }
        else{
            System.out.println("v posledovatelnosti net pari sosednih odinakovih chisel");
        }

        System.out.println("ex 7.68");
        int n = 8;
        int e1[] = {1,2,3,4,5,6,7,8};
        int e2[] = {1,2,3,4,5,6,7,8};
        int summa = 0;
        a = 0;
        b = 0;
        for(int i = 0; i<e1.length; i++){
            if ((e1[i] + e2[i])/2 > summa) {
                summa = ((e1[i] + e2[i])/2);
              a = i;
              b = i;
            }
        }
        System.out.println("nomer maximalnogo srednego arifmeticheskogo = " + (a+1));

        System.out.println("ex 11.20");
        int r[] = {1,2,3,4,5,6,7,8,9,10};
        int znak = 1;
        summa = 0;
        for(int i = 0; i<r.length; i++){
            summa = summa + (r[i]*znak);
            znak = znak * -1;
            System.out.println(summa);
        }

        System.out.println("ex 11.21");
        int january[] = new int[31];
        Random rnd0 = new Random();
        summa = 0;
        for(int i = 0; i<january.length; i++){
            january[i] = rnd0.nextInt(70);
            summa = summa + january[i];
        }
        System.out.println(summa);

        System.out.println("ex 4.45");
        double a0 = 1.2;
        double b0 = 3.4;
        double c0 = 2.1;
        if(a0== b0 || a0 == c0 || b0 == c0){
            System.out.println("est odinakovie chisla");
        }
        else{
            System.out.println("net odinakovih chisel");
        }

        System.out.println("ex 5.45");
        int soprotivlenie[] = new int[12];
        Random rnd00 = new Random();
        summa = 0;
        for(int i = 0; i<soprotivlenie.length; i++){
            soprotivlenie[i] = rnd00.nextInt(30);
            summa = summa + soprotivlenie[i];
        }
        System.out.println(summa);

        System.out.println("ex 6.67");
        int e[] = new int[20];
        Random rnd1 = new Random();
        a = 0;
        b = 0;
        boolean p = true;
        for(int i = 0; i<e.length; i++){
            e[i] = rnd1.nextInt(5);

        }
        for(int i = 0; i<e.length-1; i++){
            if(e[i]== e[i+1]){
              a = i;
              b = i+1;
              System.out.println("v posledovatelnosti imeyutsya odinakovie sosednie chisla ih poryadkovie nomera " + a + " i " + b);
              p = false;
              break;
            }
        }
            if(p == true){
                System.out.println("v posledovatelnosti otsutstvuyut odinakovie sosednie chisla");
            }

            System.out.println("ex 7.69");
            double massa[] = {1,2,3,4,5};
            double obem[] = {5,4,3,2,1};
            double plotnost[] = new double[massa.length];
            for(int i = 0; i<massa.length; i++){
                plotnost[i] = massa[i]/obem[i];
            }
            double naibolshayaPlotnost = plotnost[0];
            for(int i = 0; i<plotnost.length; i++){
                if(naibolshayaPlotnost<plotnost[i]){
                    naibolshayaPlotnost = plotnost[i];
                }
            }
            System.out.println(naibolshayaPlotnost);

        System.out.println("ex 11.22");
        int predmeti[] = new int[12];
        Random rnd2 = new Random();
        summa = 0;
        for(int i = 0; i<predmeti.length; i++){
            predmeti[i] = rnd2.nextInt(100);
            summa = summa + predmeti[i];
        }
            System.out.println(summa);

        System.out.println("ex 11.23");
        int soprotivlen[] = new int[20];
        Random rnd3 = new Random();
        summa = 0;
        for(int i = 0; i<soprotivlen.length; i++){
            soprotivlen[i] = rnd3.nextInt(30);
            summa = summa + soprotivlen[i];
        }
        System.out.println(summa);

        System.out.println("ex 4.46");
        a  = 5;
        b = 5;
        c = 5;
        if (a == b && a == c && b == c) {

            System.out.println("treugolnik yavlyaetsya ravnostoronnim");
        }
        else{
            System.out.println("treugolnik ne yavlyaetsya ravnostoronnim");
        }

        System.out.println("ex 5.46");
        int element[] = {12,24,56,23,22,17};
        int proizvedenie = 1;
        summa = 0;
        double soprotiv = 0;
        for(int i = 0; i< element.length; i++){
            proizvedenie = proizvedenie* element[i];
            summa = summa + element[i];
            soprotiv = proizvedenie / summa;
        }
        System.out.println(soprotiv);

        System.out.println("ex 6.68");
        int t[] = {1,2,2,4,5,6,9999};
        a = 0;
        b = 0;
        i0 = 0;
        for(int i = 0; i<t.length-1; i++){
            if(t[i]%2 == 0 && t[i+1]%2 == 0){
              a = i;
              b = i+1;
              i0 ++;
              System.out.println("est sosednie chetnie chisla ih poryadkovie nomera " + a + " i " + b);
              break;
            }
        }
        if (i0 == 0) {
            System.out.println("sosednie chetnie chisla otsutstvuyut");
        }

        System.out.println("ex 7.70");
        int chislennost[] = {12,13,14,15,16};
        int ploshhadi[] = {19,18,17,16,15};
        int plotnost0[] = new int [chislennost.length];
        for(int i = 0; i<chislennost.length; i++){
            plotnost0[i] = chislennost[i]/ploshhadi[i];
        }
        int naimenshayaPlotnost = plotnost0[0];
        for(int i = 0;i<plotnost0.length; i++){

            if(naimenshayaPlotnost>plotnost[i]){

                naimenshayaPlotnost = plotnost0[i];
            }
        }
        System.out.println(naimenshayaPlotnost);

        System.out.println("ex 11.24");
        int soprotivlenie0[] = new int[20];
        Random rnd4 = new Random();
        summa = 0;
        for(int i = 0; i<soprotivlenie.length; i++){
            soprotivlenie0[i] = rnd4.nextInt(12);
            summa = summa + soprotivlenie0[i];
        }
        System.out.println(summa);

        System.out.println("ex 11.25");
        int osadki[] = new int[30];
        Random rnd5 = new Random();
        int summa1 = 0;
        int summa2 = 0;
        int summa3 = 0;
        for(int i = 0; i<osadki.length; i++){
            osadki[i] = rnd.nextInt(10);
            if(i<10){
            summa1 = summa1 + osadki[i];
            }
            if (i > 9 && i < 20) {

                summa2 = summa2 + osadki[i];
            }
            if (i > 19) {
                summa3 = summa3 + osadki[i];
            }
        }
        System.out.println("osadki za 1 dekadu = " + summa1);
        System.out.println("osadke za 2 dekadu = " + summa2);
        System.out.println("osadki za 3 dekadu = " + summa3);

        }
    }

