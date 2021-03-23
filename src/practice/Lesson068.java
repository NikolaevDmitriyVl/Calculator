package practice;

public class Lesson068 {
    public static void main(String[] args){
        System.out.println("ex 7.21");
        int a[] = {123,3664,7567,123,5342};
        int summa = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i]>1000){
                summa = summa+a[i];
            }
        }
            System.out.println(summa);

        System.out.println("ex 7.22");
        int gazetiZurnali[] = {14,12,24,70};
        summa = 0;
        for(int i = 0;i<gazetiZurnali.length; i++ ){
            if(gazetiZurnali[i]>16){
                summa = summa + gazetiZurnali[i];
            }
        }
            System.out.println(summa);

        System.out.println("ex 7.23");
        int osadki[] = {1,2,3,4,5,6};
        summa = 0;
        for(int i = 0; i<osadki.length; i++){
            if(osadki[i]%2 == 0) {
                summa = summa + osadki[i];
                System.out.println(summa);
            }
        }

        System.out.println("ex 7.35(a");
        int n = 8;
        int chislo[] = {1,0,0,5,5,6,7,8};
        int kolichestvoPar = 0;
        for(int i = 0; i<n-1; i++){
            if(chislo[i] == chislo[i+1]){
                kolichestvoPar++;
            }
        }
        System.out.println(kolichestvoPar);

        System.out.println("ex 7.35(b");
        int nol = 0;
        for(int i = 0; i<n-1; i++){
            if(chislo[i] == 0 && chislo[i+1] == 0){
                nol++;
            }
        }
        System.out.println(nol);
        System.out.println("ex 7.35(c");
        int chetnie = 0;
        for(int i = 0; i<n-1; i++){
            if(chislo[i]%2==0 && chislo[i+1]%2==0){
                chetnie++;
            }
        }
        System.out.println(chetnie);

        System.out.println("ex 7.35(d");
        int pyat = 0;
        for(int i = 0; i<n-1; i++){
            if(chislo[i] == 5 && chislo[i+1] == 5){
                pyat++;
            }
        }
        System.out.println(pyat);

        System.out.println("ex 7.36");
        int nn = 5;
        double r[] = {2.1,3.4,7.8,9.3,2.5};
        int e = 0;
        for(int i = 1; i<nn; i++){
            if(r[i-1] < r[i] && r[i] > r[i+1]){
                e++;
            }

        }
        System.out.println(e);
    }
}
