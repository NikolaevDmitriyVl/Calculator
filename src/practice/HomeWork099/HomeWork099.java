package practice.HomeWork099;

public class HomeWork099 {
    public static void main(String[] args){
        System.out.println("ex 4.120(b");
        int lX = 2;
        int lY = 2;

        int fX = 4;
        int fY = 4;

        int kletkaX = 6;
        int kletkaY = 6;

        if(lX == kletkaX || lY == kletkaY){
            if(fX == kletkaX || fY == kletkaY || (fX-kletkaX) == (fY-kletkaY) || (fX-kletkaX) == ((fY-kletkaY)*(-1))){
                System.out.println("ferz budet ubit");
            }
            else{
                System.out.println("ferz ne budet ubit");
            }
        }
        else{
            System.out.println("figura ne smozet popast v uslovlennuyu kletku");
        }

        System.out.println("ex 4.120(c");
        lX = 3;
        lY = 4;

        int kX = 6;
        int kY = 5;

        kletkaX = 3;
        kletkaY = 7;

        if (lX == kletkaX || lY == kletkaY) {
            if( kX+2 == lX && kY+1 == lY
            || kX+2 == lX && kY-1 == lY
            || kX-2 == lX && kY+1 == lY
            || kX-2 == lX && kY-1 == lY
            || kY+2 == lY && kX+1 == lX
            || kY+2 == lY && kX-1 == lX
            || kY-2 == lY && kX+1 == lX
            || kY-2 == lY && kX-1 == lX){
    System.out.println("ladya budet ubita");
            }
            else{
                System.out.println("ladya ne budet ubita");
            }
        }
        else{
            System.out.println("ladya ne smozet popast v uslovlennuyu kletku");
        }

        System.out.println("ex 4.120(d");
        lX = 4;
        lY = 2;
        int slonX = 5;
        int slonY = 8;
        kletkaX = 7;
        kletkaY = 1;
        if(lX== kletkaX || lY == kletkaY){
            if((slonX-kletkaX) == (slonY-kletkaY) || (slonX-kletkaX) == ((slonY-kletkaY)*(-1))){
                System.out.println("figura budet ubita");
            }
            else{
                System.out.println("figura ne budet ubita");
            }
        }
            else{
          System.out.println("figura ne smozet popast v uslovlennuyu tochku");
            }

            System.out.println("ex 4.102(e");
            //ferz i ferz
        fX = 5;
        fY = 4;
        int f2X = 8;
        int f2Y = 7;
        kletkaX = 3;
        kletkaY = 8;
        if(fX == kletkaX || fY == kletkaY || (fX - kletkaX) == (fY - kletkaY) || (fX - kletkaX) == ((fY - kletkaY)*(-1))){
            
        }
        System.out.println("ex 4.101");
        double tri11 = 1.1;
        double tri12 = 1.2;
        double tri13 = 1.3;
        double tri21 = 1.4;
        double tri22 = 1.5;
        double tri23 = 1.6;
        double naimenshee1 = 0;
        double naibolshee1 = 0;
        double srednee1 = 0;

        if (tri11 < tri12 && tri11 < tri13) {
            naimenshee1 = tri11;
            if (tri12 > tri13) {
                naibolshee1 = tri12;
                srednee1 = tri13;
            }
            else{
                naibolshee1 = tri13;
                srednee1 = tri12;
        }
        if (tri12 < tri11 && tri12 < tri13) {
            naimenshee1 = tri12;
            if (tri11 > tri13) {
                naibolshee1 = tri11;
                srednee1 = tri13;
            }
            else{
                naibolshee1 = tri13;
                srednee1 = tri11;
            }
        }
        if (tri13 < tri11 && tri13 < tri12) {
            naimenshee1 = tri13;
            if (tri12 > tri11) {
                naibolshee1 = tri12;
                srednee1 = tri11;
            }
            else{
                naibolshee1 = tri11;
                srednee1 = tri12;
            }
        }

        double srednee2 = 0;
        if(tri21 > tri22 && tri21 <tri23 || tri21< tri22 && tri21 >tri23){
            srednee2 = tri21;
        }
            if (tri22 > tri23 && tri22 < tri21 || tri22 < tri23 && tri22 > tri21) {
                srednee2 = tri22;
            }
            if (tri23 > tri21 && tri23 < tri22 || tri23 < tri21 && tri23 > tri22) {
                srednee2 = tri23;
            }
            double sredneeArifmeticheskoe0 = (srednee1 + srednee2)/2;
            System.out.println(sredneeArifmeticheskoe0);

        

        }
        System.out.println("ex 7.119");
        int n = 5;
        int massiv[] = {1,2,3,4,5};
        int maximalnoeChislo = 0;
        int minimalnoeChislo = 100*1000;
        for(int i = 0; i<massiv.length; i++){
            if(maximalnoeChislo<massiv[i]){
                maximalnoeChislo = massiv[i];
            }
            if(minimalnoeChislo>massiv[i]){
                minimalnoeChislo = massiv[i];
            }
        }
        if ((maximalnoeChislo - minimalnoeChislo) <= 25) {
            System.out.println("raznica ne previshaet chislo 25");
        }
        else{
            System.out.println("raznica previshaet chislo 25");
        }

        System.out.println("ex 8.30");
        System.out.println("ex 10.7");
        System.out.println("ex 11.87");
        System.out.println("ex 12.16");
        System.out.println("ex 13.12");



    }
}
