package practice;

public class HomeWork062 {
    public static void main(String[] args){
        System.out.println("ex 4.17");
        double ploshhadKruga = 100;
        double ploshhadTreugolnika = 80;
        double storonaTreugolnika = Math.sqrt(ploshhadTreugolnika)*(4/Math.sqrt(3));
        double radiusVpisannoyOkruznosti = storonaTreugolnika/(2*Math.sqrt(3));
        double radiusKruga = (2*Math.sqrt((5/3.14)))/2;
        double radiusOpisannoyOkruznosti = storonaTreugolnika/Math.sqrt(3);
        if(radiusVpisannoyOkruznosti>radiusKruga){
            System.out.println("krug pomestitsya v treugolnik");
        }
        else{
            System.out.println("krug ne pomestitsya v treugolnik");
        }
        System.out.println("ex 4.17(b");
        if(radiusOpisannoyOkruznosti<radiusKruga){
            System.out.println("treugolnik pomestitsya v krug");
        }
        else{
            System.out.println("treugolnik ne pomestitsya v krug");
        }

        System.out.println("ex 5.17");
        double t = 0;
        double y = 0;
        for(int x = 0; x<18; x++){
            t = x+2;
            y = Math.pow((2*t),2)+(5.5*t)-2;
            System.out.println(y);
        }

        System .out.println("ex 6.43");
        int q[] = {100,300,300,300,1000};
        int i = 1;
        int i0 = 0;
        int i1 = 0;
        while (q[i] > 0) {

            if(q[i]== q[i+1]){
                i0++;
            }
            else{
                i1++;
            }
            i++;
        }
        System.out.println(i0 + " odinakovih " + i1 + " ne odinakovih");
    }
}
