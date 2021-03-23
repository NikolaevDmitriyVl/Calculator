package practice;

public class HomeWork057 {
    public static void main(String[] args){
        System.out.println("ex 4.7");
        double q = 15.5;
        double w = 12.3;
        if(q>w){
            System.out.println("q > w");
        }
        if(w>q){
            System.out.println("w > q");
        }

        System.out.println("ex 5.7");
        double tovar = 20.4;
        double summa = 0;
        for(int i = 1; i>=20; i++){
            summa = summa + tovar;
            System.out.println(i + " stoyat " + summa + " rubley");
        }
        System.out.println("ex 6.32");
        int chislo = 113156;
        int cifra = 0;
        int i = 0;
        int minCifra = 1;
        int i0 = 0;
        while(chislo>0){
            cifra = chislo%10;
            chislo = chislo/10;
            if(cifra<minCifra){
                i0 = 1;
                minCifra = cifra;
            }if(cifra==minCifra){
                i0++;
            }
            i++;
        }
        System.out.println(i0);

        System.out.println("ex 4.8");
        double km = 3;
        double fut = 4000;
        double kmVFut = (fut*0.305)/1000;
        if(km>kmVFut){
            System.out.println("km (" + km + ") bolshe fut (" + kmVFut + ")");
        }
        if(kmVFut>km){
            System.out.println("kmVFut (" + kmVFut + ") bolshe km (" + km + ")");
        }

        System.out.println("ex 5.8");
        double funt = 0.453;
        for(i = 1; i<=10; i++){
            System.out.println(i + " kg = " + funt + "funt");
        }

        System.out.println("ex 6.33");//???
        chislo = 30;
        int maxChislo = 100;
        i = 100;
        i0 = 0;
        while(maxChislo>0){
            maxChislo--;
            if(maxChislo/chislo == 3 || maxChislo/chislo == 2 || maxChislo/chislo == 1){
                i0++;
            }
            i--;
        }
        System.out.println(i);

        System.out.println("ex 4.9");
        double kmVch = 3;
        double mVs = 1;
        double kilometrovVChasVMetrahVSekundu = mVs * 3.6;
        if(kmVch>kilometrovVChasVMetrahVSekundu){
            System.out.println("km/ch bolshe chem m/s");
        }
        if(kilometrovVChasVMetrahVSekundu>kmVch){
            System.out.println("m/s bolshe chem km/ch");
        }

        System.out.println("ex 5.9");
        for(i = 1; i<=22; i++){
            System.out.println(i + " duym = " + (i*25.4) + " santimetrov");
        }

        System.out.println("ex 6.34");
        i = 19;
        i0 =0;
        while(i0<15){

            if(i%19 == 0){
System.out.println(i);
                i0++;
            }
            i++;
        }

        System.out.println("ex 4.10");
        double r = 5;
        double storona = 4;
        double pi = 3.14;
        double ploshhadKvadrata = storona*4;
        double ploshhadKruga = pi*Math.pow(r,2);
        if(ploshhadKvadrata>ploshhadKruga){
            System.out.println("ploshhad kvadrata " + "(" + ploshhadKvadrata + ")"+ " bolshe ploshhadi kruga " + "(" + ploshhadKruga + ")");
        }
        if(ploshhadKruga>ploshhadKvadrata){
            System.out.println("ploshhad kruga " + "(" + ploshhadKruga + ")" + " bolshe ploshhadi kvadrata " + "(" + ploshhadKvadrata + ")");
        }
    }
}
