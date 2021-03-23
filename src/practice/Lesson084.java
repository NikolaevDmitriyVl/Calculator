package practice;
public class Lesson084 {
    public static void main(String[] args){
        System.out.println("ex 11.119");
        int massiv[] = {1,2,2,3,4,5,6,6,5,4,6,2,1};
        int maxCifra = massiv[0];
        int a1 = massiv[0];
        int numbreOfMax = 0;
        for(int i = 1; i<massiv.length; i++){
            if(maxCifra < massiv[i]){
                maxCifra = massiv[i];
                numbreOfMax = 1;
            }else if( maxCifra == massiv[i]){
                numbreOfMax++;
            }

        }
        System.out.println("count " + numbreOfMax);

        int i0 = 0;
        for(int i = 0; i<massiv.length; i++){
            if(maxCifra == massiv[i]){
                i0++;
            }
        }
        System.out.println(i0);

        System.out.println("ex 11.124");
        int mass[] = {1,2,3,4,5,6,5,4,3};
        int min = mass[0];
        int kolvo[] = new int[mass.length];
        int kMass = 0;;;;;;;
        for(int i = 0; i<mass.length; i++){
        if(min>mass[i]){
            min = mass[i];
            kMass = 0;
            kolvo[kMass] = i;
        }
        else if(min == mass[i]){
            kMass++;
            kolvo[kMass] = i;
        }
        }
    }
}
