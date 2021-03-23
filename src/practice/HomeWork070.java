package practice;

public class HomeWork070 {
    public static void main(String[] args) {
        System.out.println("ex 4.35");
        int stolDlStorona = 4;
        int stolKorStorona = 3;
        int pryamougolnikDlStorona = 2;
        int pryamougolnikKorStorona = 1;
        int dlinnoyStoronoy = (stolDlStorona / pryamougolnikDlStorona) * (stolKorStorona / pryamougolnikKorStorona);
        int korotkoyStoronoy = (stolDlStorona / pryamougolnikKorStorona) * (stolKorStorona / pryamougolnikDlStorona);
        if (dlinnoyStoronoy > korotkoyStoronoy) {
            System.out.println("dlinnoy storonoy pomestitsya bolse");
        }
        if (korotkoyStoronoy > dlinnoyStoronoy) {
            System.out.println("korotkoy storonoy pomestitsya bolshe");
        }
        System.out.println("ex 5.35");
        int n = 5;
        double znak = 1;
        double summ = 0;
        for (int i = 1; i <= n; i++) {
            summ = summ + (1 / (i * znak));
            znak = znak * (-1);
            System.out.println(summ);
        }

        System.out.println("ex 6.57");
        double a[] = {1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.1, 9.6, 11.3, 12.4, 13.5, 14.6, 15.7};
        double nn = 9.5;
        double chisloMenshe = 0;
        double chisloBolshe = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < nn) {
                chisloMenshe = a[i];
                chisloBolshe = a[i + 1];
            }

        }

        if ((chisloBolshe - nn) > (nn - chisloMenshe)) {
            System.out.println(chisloMenshe);
        } else {
            System.out.println(chisloBolshe);
        }

        System.out.println("ex 7.56");
        int rasstoyanie[] = {2300, 450, 123, 1090, 567};
        int samiyUdalenniy = rasstoyanie[0];
        for (int i = 0; i < rasstoyanie.length; i++) {
            if (samiyUdalenniy < rasstoyanie[i]) {
                samiyUdalenniy = rasstoyanie[i];
            }
        }
        System.out.println(samiyUdalenniy);

        System.out.println("ex 7.57");
        int skorost[] = {3413, 6534, 866, 2345, 8567, 6879};
        int samiyBistriy = skorost[0];
        for (int i = 0; i < skorost.length; i++) {
            if (samiyBistriy < skorost[i]) {
                samiyBistriy = skorost[i];
            }
        }
        System.out.println(samiyBistriy);

        System.out.println("ex 4.36");
        double zeleniy = 3;
        double krasniy = 2;
        double t = 2.8;
        double zel = 0;
        double kr = 0;
        while (kr < t && zel< t) {
zel = kr  + zeleniy ;
kr = zel + krasniy;
}
if(zel>t && zel-3< t){
    System.out.println("zeleniy");
}
            if (kr>t &&  kr-2< t) {
                System.out.println("krasniy");
            }

            System.out.println("ex 5.36");
            double x = 2;
            summ = 0;
            for(int i = 3; i<= 11; i++){
                summ = summ + Math.pow(x,i)/i;
            }
            System.out.println(summ);

            System.out.println("ex 6.58");
            int u[] = {1,2,-3,4,5,6,7,-8,9,10,11,12,13,14,15};
            for(int i = 0; i<u.length; i++){
                if (u[i] < 0) {                    System.out.println(i);
                    break;
                }
            }

            System.out.println("ex 7.58");
            double ploshhad[] = {1230,1240,356,892};
            double pi = 3.14;
            double r = 0;
            double radius = Math.sqrt(ploshhad[0]/pi);
            for(int i = 0; i<ploshhad.length; i++){
                r = Math.sqrt(ploshhad[i]/pi);
                if(radius>r){
                    radius = r;
                }
            }
            System.out.println(radius);

            System.out.println("ex 7.59");
            double plKvadrata[] = {5,6,10,19,20};
            double a0 = Math.sqrt(plKvadrata[0]);
            double d = 0;
            double dlinaDiagonali = Math.sqrt(2) * a0;

            for(int i = 0; i<plKvadrata.length; i++){
                a0 = Math.sqrt(plKvadrata[i]);
                d = Math.sqrt(2) * a0;
                if (d > dlinaDiagonali) {
                    dlinaDiagonali = d;
                }
            }
            System.out.println(dlinaDiagonali);

            System.out.println("ex 4.37");
            int chislo = 2;
        if (chislo > -5 && chislo < 3) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        System.out.println("ex 5.37");
        double x0 = 2.0;
        summ = 1.0;
        double znak0 = -1.0;
        for(double i = 1.0; i<=10.0;i++) {
            summ = summ + ((((i + 1.0) / (i + 2.0)) * Math.pow(x0, i)) * znak0);
            znak0 = znak0 * -1.0;

        System.out.println(summ);
        }

        System.out.println("ex 6.59");//???
        int k[] = {234,343,654,85,97,78,100};
        int y = 0;
        for(int i = 0; i<k.length; i++){
            if(k[i] == 77){
                y++;
                System.out.println(i);
                break;
            }
        }
        if (y == 0) {

            System.out.println("chisla 77 v posledovatelnosti net");
        }

        System.out.println("ex 7.60");
        int kolichestvo[] = {12,43,6004,321,6004,65,867};
        int gdeBolshe = kolichestvo[0];
        int otvet = 0;
        for(int i = 0; i<kolichestvo.length; i++){
            if(gdeBolshe<=kolichestvo[i]){
                gdeBolshe = kolichestvo[i];
                otvet = i;
            }
        }
        System.out.println(otvet+ 1);

        System.out.println("ex 7.61");
        int result[] = {2,2,3,4,5,6,1,7};
        int luchshiy  = result[0];
        otvet = 0;
        for(int i = 0;i<result.length; i++){
            if(luchshiy>result[i]){
                luchshiy = result[i];
                otvet = i;

            }
        }
        System.out.println(otvet+1);
        }
        }



