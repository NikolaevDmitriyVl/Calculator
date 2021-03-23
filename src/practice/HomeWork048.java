package practice;

public class HomeWork048 {
    public static void main(String[] args) {
        System.out.println("ex 5.68");
        int k = 5;
        int chislitel1 = 1;
        int znamenatel1 = 1;
        int chislitel2 = 2;
        int znamenatel2 = 1;
        int chislitel3 = 1;
        int znamenatel3 = 1;
        for (int i = 0; i < k - 2; i++) {
            chislitel3 = chislitel1 + chislitel2;
            znamenatel3 = znamenatel1 + znamenatel2;
            chislitel1 = chislitel2;
            znamenatel1 = znamenatel2;
            chislitel2 = chislitel3;
            znamenatel2 = znamenatel3;
        }
        System.out.println(chislitel3 + "/" + znamenatel3);

        System.out.println("ex 5.68(b");
        int q = 8;
        int chislit1 = 1;
        int znamenat1 = 1;
        int chislit2 = 2;
        int znamenat2 = 1;
        int chislit3 = 1;
        int znamenat3 = 1;
        System.out.println(chislit1 + "/" + znamenat1);
        System.out.println(chislit2 + "/" + znamenat2);
        for (int i = 0; i < q - 2; i++) {
            chislit3 = chislit1 + chislit2;
            znamenat3 = znamenat1 + znamenat2;
            chislit1 = chislit2;
            znamenat1 = znamenat2;
            chislit2 = chislit3;
            znamenat2 = znamenat3;
            System.out.println(chislit3 + "/" + znamenat3);
        }

        System.out.println("5.68(c");
        double a = 234;
        double w = 4;
        double chisl1 = 1;
        double znamen1 = 1;
        double chisl2 = 2;
        double znamen2 = 1;
        double chisl3 = 1;
        double znamen3 = 1;
        double summa1 = (chisl1 / znamen1) + (chisl2 / znamen2);
        double summa2 = 0;
        for (double i = 0; i < w - 2; i++) {
            chisl3 = chisl1 + chisl2;
            znamen3 = znamen1 + znamen2;
            chisl1 = chisl2;
            znamen1 = znamen2;
            chisl2 = chisl3;
            znamen2 = znamen3;
            summa2 = summa2 + (chisl3 / znamen3);
        }
        double summa3 = summa1 + summa2;
        if (summa3 > a) {

            System.out.println("summa pervih " + w + " chlenov etoy posledovatelnosti bolshe shisla A(" + a + ")");
        } else {
            System.out.println("summa pervih " + w + " chlenov etoy posledovatelnosti menshe shisla A(" + a + ")");
        }

        System.out.println("ex 5.69");
        int n = 8;
        double v[] = new double[n];
        v[1] = 0;
        v[2] = 0;
        v[3] = 1.5;
        for (int i = 4; i < n; i++){
            v[i] = ((i - 1) / ((Math.pow(i, 2) + 1)) - (v[i - 2] + v[i - 3]));

        }

    }
}
