 package practice;

public class Lesson072 {
    public static void main(String[] args){
        System.out.println("ex 11.9");
        int a = 5;
        int p = 2;
        int arifmeticheskayaProgressiya[] = new int [10];
        for(int i = 0; i<arifmeticheskayaProgressiya.length; i++){

            arifmeticheskayaProgressiya[i] = a+p;
            a = arifmeticheskayaProgressiya[i];
            System.out.println(arifmeticheskayaProgressiya[i]);
        }

        System.out.println("ex 11.9(b");
        a = 2;
        int z = 2;
        int geometricheskayaProgressiya[] = new int [20];
        for(int i = 0; i<geometricheskayaProgressiya.length; i++){
            geometricheskayaProgressiya[i] = a * z;
            a = geometricheskayaProgressiya[i];
            System.out.println(geometricheskayaProgressiya[i]);
        }

        System.out.println("ex 11.9(c");
        a = 0;
        int b = 1;
        int fibonachi[] = new int[12];

        for(int i = 0; i<fibonachi.length; i++){
            fibonachi[i] = a + b;
            b = a;
            a = fibonachi[i];
            System.out.println(fibonachi[i]);
        }

        System.out.println("ex 11.10");
        int chislo = 12345;
        int cifra = 0;
        int i = 0;
        int cifri[] = new int [6];
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;

            cifri[i] = cifra;
            System.out.println(cifri[i]);
            i++;
        }

        System.out.println("ex 11.11");
        int chisl[] = {1,2,3,4,5,6};
        for(i = 0; i<chisl.length; i++){
            System.out.println(chisl[i]);
        }
    }
}
