package practice;

public class HomeWork069 {
    public static void main(String[] args){
        System.out.println("ex 4.33(a");
        int chislo = 123;
        if (chislo % 2 == 0) {
            System.out.println("chislo chetnoe");
        }
        else{
            System.out.println("chislo ne chetnoe");
        }

        System.out.println("ex 4.33(b");
        chislo = 123;
        if (chislo % 2 == 1) {
            System.out.println("chislo ne chetnoe");
        }
        else{
            System.out.println("chislo chetnoe");
        }

        System.out.println("ex 5.33");
        double summ = 0;
        for(double i  = 2; i<11 ; i++){
            summ = summ + i/(i+1);
            System.out.println(summ);
        }

        System.out.println("ex 6.55");
        chislo = 12345;
        int chisl = chislo;
        int cifra = 0;
        int cifr = 0;
        int cifr2 = 0;
        int i = 0;
        int i0 = 0;
        int i1 = 0;
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            i++;
        }
        double w = Math.pow(10,i-1);

        while (chisl > 0) {
            cifr = chisl/(int)w;
            chisl = chisl-(cifr*(int)w);
            w = w/10;
            if (cifr > cifr2) {
                i0++;
            }
            i1 ++;
        }
        if (i0 == i1) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        System.out.println("ex 7.50");
        int n = 7;
        int b[] = {1,2,105,3,205,34,7};
        int chisloBolshe100 = 0;
        for(i = 0; i<n; i++){
            if (b[i] > 100) {
                chisloBolshe100 = i;
            }
        }
        System.out.println(chisloBolshe100);

        System.out.println("ex 7.51");
        int k = 5;
        int q[] = {1,2,-4,6,-7};
        int nomerPoslednegoOtrChis = 0;
        for(i = 0; i<k; i++){
            if (q[i] < 0) {
                nomerPoslednegoOtrChis = i;
            }
        }
            System.out.println(nomerPoslednegoOtrChis);

        System.out.println("ex 4.34");
        int a = 124;
        int c = 4;
        if (c % a == 0) {
            System.out.println("a yavlyaetsya delitem c");
        }
        else{
            System.out.println("a ne yavlyaetsya delitem c");
        }
        if(a%c == 0){
            System.out.println("c yavlyaetsya delitelem a");
        }
        else{
            System.out.println("c ne yavlyaetsya delitelem a");
        }

        System.out.println("ex 5.34");
        summ = 0;
        for(i = 1;i<9; i++){
            summ = summ + 1/(Math.pow(3,i));
        }
            System.out.println(summ+1);

        System.out.println("ex 6.56");
        chislo = 12345;
        chisl = chislo;
        cifra = 0;
        cifr = 0;
        cifr2 = 9;
        i = 0;
        i0 = 0;
        i1 = 0;
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            i++;
        }
        w = Math.pow(10,i-1);
        while (chisl > 0) {
            cifr = chisl/(int)w;
            chisl = chisl - (cifr*(int)w);
            w = w/10;
            if (cifr <= cifr2) {
                i0++;
            }
            i1++;
        }
        if (i0 == i1) {
            System.out.println("cifri ne ubivayut");
        }
        else{
            System.out.println("posledovatelnost ubivaet");
        }

        System.out.println("ex 7.52");
        n = 5;
        double maxChislo = 0;
        double e[] = {2.3,5.4,7.8,9.23,25.89};
        for(i = 0; i<n; i++){
            if (e[i] > maxChislo) {
                maxChislo = e[i];
            }
        }
        System.out.println(maxChislo);
        System.out.println("ex 7.52(b");
        double minChislo = e[0];
        for(i = n-1; i>0; i--){
            if(minChislo> e[i]){
                minChislo = e[i];
            }
        }
        System.out.println("minimalnoe chislo " + minChislo);
        System.out.println("ex 7.52(c");
        minChislo = e[0];
        maxChislo = e[0];
        for(i = n-1; i>0; i--){
            if(minChislo > e[i]){
                minChislo = e[i];
            }
            if(maxChislo < e[i]){
                maxChislo = e[i];
            }
        }
        System.out.println("minimalnoe chislo " + minChislo);
        System.out.println("maxsimalnoe chislo " + maxChislo);

        System.out.println("ex 7.53");
        n = 8;
        int maxChisl = 0;
        int t[] = {1,2,3,4,5,6,7,8};
        int minChisl = t[0];
        for(i = 0; i<n; i++){
            if (t[i] >= maxChisl) {
                maxChisl = i;
            }
            if(minChisl>t[i]){
                minChisl = i;
            }
            if(minChisl == t[0]){
                minChisl = 0;
            }
        }
        System.out.println("max " + maxChisl);
        System.out.println("min " + minChisl);
        
        }
        }