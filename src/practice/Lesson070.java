package practice;

public class Lesson070 {
    public static void main(String[] args){
        System.out.println("ex 7.54");
        int n = 6;
        int a[] = {8,2,7,1,95,16};
        int maxChislo = 0;
        int minChislo = a[0];
        for(int i = 0; i<n; i++){
            if(a[maxChislo]<a[i]){
                maxChislo = i;
            }
            if(minChislo > a[i]){
                minChislo = i;
            }
        }
        if(minChislo == a[0]){
            minChislo = 0;
        }
        System.out.println(maxChislo);
        System.out.println(minChislo);

        System.out.println("ex 7.55");
        int t[] = {12,23,43,546,76,9,689,8,546};
        int luchshiyRezultat = 0;
        System.out.println(t[0]);
        for(int i = 0; i<t.length; i++){
            if(t[luchshiyRezultat] > t[i]){
                luchshiyRezultat = i;
                System.out.println(t[luchshiyRezultat]);
            }
        }

        System.out.println("ex 7.73(a");
        n = 6;
        int b[] = {91,34,67,88,22,90};
        int maxChislo1 = 0;
        int maxChislo2 = 0;
        if(b[maxChislo1] > b[1]){
            maxChislo2 = 1;
        }
        for(int i = 1; i<n; i++){

            if(b[i] >= b[maxChislo1]){
                maxChislo2 = maxChislo1;
                maxChislo1 = i;
            }else if(b[i] > b[maxChislo2]){
                maxChislo2 = i;
            }

        }
        System.out.println("maxsimalnoe chislo = " + b[maxChislo1]);
        System.out.println("maxsimalnoe chislo = " + b[maxChislo2]);
    }
}
