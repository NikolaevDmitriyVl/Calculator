package practice;

public class HomeWork040 {
    public static void main(String[] args){
        System.out.println("ex 4.17(a");
        double ploshhadKruga = 40;
        double ploshhadTreug = 50;
        double storonaTreugolnika = Math.sqrt(ploshhadTreug) * 4/Math.sqrt(3);
        double diametrVpis = Math.sqrt(3)/6*storonaTreugolnika;
        double diametrOpis = Math.sqrt(3)/3*storonaTreugolnika;
        double diametrkruga = 2*Math.sqrt(ploshhadKruga/3.14);
        if(diametrkruga<diametrVpis){
            System.out.println("umestitsya");
        }
        else{
            System.out.println("ne umestitsya");
        }
        System.out.println("ex 4.17(b");
        if(diametrkruga>diametrOpis){
            System.out.println("umestitsya");
            }
        else{
            System.out.println("ne umestitsya");

        }

        System.out.println("ex 4.20");
        int m = 24;
        int n = 56;
        int result = m/n;
        if(m%n==0 ){
            System.out.println(result);
        }
        else{
            System.out.println("m на n нацело не делится");
        }

        System.out.println("ex 4.21");

        System.out.println("ex 4.22(a");
        int q = 37;
        int w = q-7;
        if(q/2== 0){
            System.out.println("chetnoe");
        }
        else{
            System.out.println("ne chetnoye");
        }

        System.out.println("ex 4.22(b");
        if (w%10 == 0){
            System.out.println("poslednee chislo yavlyaetsya 7");
        }
        else{
            System.out.println("poslednee chislo ne yavlyaetsya 7");
        }

        System.out.println("ex 4.23(a");
        int e = 3;
        int t = 7;
        if(e>t){
            System.out.println("e bolshe");
        }
        if(t>e){
            System.out.println("t bolshe");
        }

        System.out.println("ex 4.23(b");
        if ( e == t){
            System.out.println("e = t");
        }
        else {
            System.out.println("e ne ravno t");
        }

        System.out.println("ex 4.24");
        double r = 23;

        double kvadrat = Math.pow(r,2);


    }
}
