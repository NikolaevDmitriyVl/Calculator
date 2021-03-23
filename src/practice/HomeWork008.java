package practice;

public class HomeWork008 {
    public static void main(String[] args){
        System.out.println("ex 2.39");
        int chas = 2;
        int min = 1;
        int sek = 1;
        double gradInChas = 360.0 / 12.0;
        double gradInMin = gradInChas / 60;
        double gradInSec = gradInMin / 60;
        double gradus = (chas*gradInChas)+(min*gradInMin)+(sek*gradInSec);
        System.out.println(gradus);

        System.out.println("ex 2.40");
        // 191 градус
        int gradus001 = 120;
        int sekVsego = 191*gradus001;
        int minVsego = sekVsego/60;
        int sek001 = sekVsego%60;
        int chas001 = minVsego/60;
        int min001 = minVsego%60;
        System.out.println(chas001);
        System.out.println(min001);
        System.out.println(sek001);

        System.out.println("ex 2.41");
        // 19:25
        int gradusMin = 6;
        int chasi = 7;
        int minuti = 25;
        int gradus002 = gradusMin*minuti;
        System.out.println(gradus002);
        System.out.println(chasi);
        System.out.println(minuti);

        System.out.println("ex 1.17(a");
        double x1 = 1;
        double x2 = 2;
        double x3 = 3;
        double result = Math.sqrt(Math.pow(x1,2)+Math.pow(x2,2));
        System.out.println("ex 1.17(б");
        result = x1*x2+x1*x3+x2*x3;
        System.out.println("ex 1.17(в");
        double v0 = 4;
        double a = 5;
        double t = 6;
        result = v0*t+a*Math.pow(t,2)/2;
        System.out.println("ex 1.17(г");
        double m = 7;
        double v = 8;
        double g = 9;
        double h = 10;
        result = m*Math.pow(v,2)/2+m*g*h;
        System.out.println("ex 1.17(д");
        double R = 11;
        result = 1/R*1+1/R*2;
        System.out.println("ex 1.17(е");
        double cos = 12;
        double alpha = 13;
        result = m*g*Math.cos(alpha);
        System.out.println("ex 1.17(ж");
        double pi = 3.14;
        result = 2*pi*R;
        System.out.println("ex 1.17(з");
        double b = 14;
        double c =15;
        result = Math.pow(b,2)-4*a*c;
        System.out.println("ex 1.17(и");
        double gamma = 16;
        double m1 = 17;
        double m2 = 18;
        double r2 = 19;
        result = gamma*m1*m2/r2;
        System.out.println("ex 1.17(к");
        double I = 20;
        result = Math.pow(I,2)*R;
        System.out.println("ex 1.17(л");
        double sin = 21;
        result = a*b*Math.sin(c);
        System.out.println("ex 1.17(м");
        result = Math.sqrt(Math.pow(a,2)+Math.pow(b,2-2*a*b*Math.cos(c)));
        System.out.println("ex 1.17(н");
        double d = 22;
        result = (a*d+b*c)/a*d;
        System.out.println("ex 1.17(о");
        double x = 23;
        result = Math.sqrt(1-Math.pow(sin,2)*x);
        System.out.println("ex 1.17(п");
        result = 1/Math.sqrt(a*Math.pow(x,2)+b*x+c);
        System.out.println("ex 1.17(р");
        result = Math.sqrt(x+1)+Math.sqrt(x-1)/2*Math.sqrt(x);
        System.out.println("ex 1.17(с");
        result = Math.abs(x)+Math.abs(x+1);
        System.out.println("ex 1.17(т");
        result = Math.abs(1-Math.abs(x));

        System.out.println("ex 1.23");
        double y = 24;
        y = Math.pow(a,2)+10/Math.sqrt(Math.pow(a,2)+1);

        System.out.println("ex 1.24(a");
        x = Math.sqrt(2*a+Math.sin(Math.abs(3*a)))/3.56;
        System.out.println("ex 1.24(b");
        y = Math.sin((3.2+Math.sqrt(1+x)))/Math.abs(5*x);
        System.out.println("ex 1.26");
        double D = 22;
        D = R*2;
        System.out.println("ex 1.27");
        double Y = 6350;
        double H = 1.75;
        double S2 = Math.pow((6350+1.75),2)-Math.pow(6350,2);
        double S = Math.sqrt(S2);
        System.out.println(S);

        System.out.println("ex 1.28");
        double a001 = 4;
        double ob = Math.pow(a001,3);
        double ploshchad = a001*a001;
        System.out.println(ob);
        System.out.println(ploshchad);

        System.out.println("ex 1.29");
        double dlinaOkrugnosti = 2*pi*R;
        double ploshchadKruga = pi*R*2;
        System.out.println(dlinaOkrugnosti);
        System.out.println(ploshchadKruga);

        System.out.println("ex 1.41(a");
        double e = 1;
        double f = 2;
        a = Math.sqrt(Math.abs(e-(3/f)))+g;
        System.out.println("ex 1.41(b");
        b = Math.sin(e)+Math.pow(cos,2)*h;
        System.out.println("ex 1.41(c");
        c = 33*g/(e*f-3);

        System.out.println("ex 1.42(a");
        a = (e+(f/2))/3;
        System.out.println("ex 1.42(b");
        b = Math.abs(Math.pow(h,2)-h);
        System.out.println("ex 1.42(c");
        c = Math.sqrt(Math.pow((g-h),2)-3*Math.sin(e));

        System.out.println("ex 1.43");
        double modul2 = Math.abs(2);
        double modul5 = Math.abs(5);
        double sa = modul2+modul5/2;
        System.out.println(sa);
        double sg = Math.sqrt(modul2*modul5);
        System.out.println(sg);

        System.out.println("ex 1.44");
        double storona1 = 3;
        double storona2 = 4;
        double gipotenuza = Math.sqrt(Math.pow(storona1,2)+Math.pow(storona2,2));
        double perimetr = 2*storona1+2*storona2;
        System.out.println(gipotenuza);
        System.out.println(perimetr);
        System.out.println("ex 1.45");
        double chislo1 = 3;
        double chislo2 = 5;
        double summa = chislo1+chislo2;
        double raznost = chislo1-chislo2;
        double proizvedenie = chislo1*chislo2;
        double chastnoe = chislo1/chislo2;
        System.out.println(summa);
        System.out.println(raznost);
        System.out.println(proizvedenie);
        System.out.println(chastnoe);

        System.out.println("ex 1.46");
        double a002 = 6;
        double b002 = 3;
        double c002 = 4;
        double volume = a002*b002*c002;
        double ploshchadBokovoiPoverhnosti = b002*c002;
        System.out.println(volume);
        System.out.println(ploshchadBokovoiPoverhnosti);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

    }
}
