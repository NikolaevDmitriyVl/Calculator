package practice.HomeWork113;

public class HomeWork113 {
    double formula(double a){
        double x = (Math.sqrt(Math.pow(a, 2) / 2)) * 2;
        return x;
    }
    double summa(double a, double b){
        double x = a+b;
        return x;
    }
    public static void main(String[] args) {
        System.out.println("ex 4.124");
        double a0 = 3;
        double b0 = 3;
        double c0 = Math.sqrt(Math.pow(3,2)+Math.pow(3,2));
        double one = 0;
        double two = 0;
        double three = 0;
        if (a0 >= b0 && a0 >= c0) {
            one = a0;
            if (b0 >= c0) {
                two = b0;
                three = c0;
            } else {
                three = b0;
                two = c0;
            }
        }

        else if (b0 >= a0 && b0 >= c0) {
            one = b0;
            if (a0 >= c0) {
                two = a0;
                three = c0;
            } else {
                three = a0;
                two = c0;
            }
        }

        else if (c0 >= a0 && c0 >= b0) {
            one = c0;
            if (a0 >= b0) {
                two = a0;
                three = b0;
            } else {
                three = a0;
                two = b0;
            }
        }
        System.out.println("one = " + one + " two = " + two + " three = " + three);

        HomeWork113 homeWork = new HomeWork113();
        System.out.println(homeWork.formula(one));
        if(homeWork.summa(two,three)<homeWork.formula(one)){
            System.out.println("treugolnik tupoy");
        }
        else if(homeWork.summa(two,three)>homeWork.formula(one)){
            System.out.println("treugolnik ostriy");
        }
        else if(homeWork.summa(two,three) == homeWork.formula(one)) {
            System.out.println("treugolnik pryamougolniy");
        }
        
        System.out.println("ex 8.47");//???
        int giri[] = {100,200,300,500,1000,1200,1400,1500,2000,3000};
        int v = 2200;
        int x = 0;
        int y[]= new int[10];
        int i0 = 0;
        for(int i = 0; i<giri.length; i++){
            i0 = 0;
            x = giri[i];
            for(int j = 0; j<giri.length; j++){
                if(giri[i] != giri[j]){
                    x = x + giri[j];
                    i0++;
                    y[0] = giri[i];
                    y[i0] = giri[j];
                }
                if (v == x) {
                    for(int o = 0; y[o]!=0; o++) {
                        System.out.print(y[o] + " + ");
                    }
                    System.out.println(" = " + v);

                }
            }
        }
        //kak vyvesti na ehkran tol'ko zapolnennye yacheyki massiva???

        System.out.println("ex 10.22");
        System.out.println("ex 11.101");
        System.out.println("ex 12.25(e");
        System.out.println("ex 13.20");
    }
}
