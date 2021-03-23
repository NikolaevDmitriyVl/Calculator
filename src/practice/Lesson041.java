package practice;

public class Lesson041 {
    public static void main(String[] args){
        System.out.println("ex 4.18");
        int perviyLeviyNizniyX = 2;
        int perviyLeviyNizniyY = 6;
        int perviyPraviyVerhniyX = 7;
        int perviyPraviyVerhniyY = 9;

        int vtoroyLeviyNizniyX = 1;
        int vtoroyLeviyNizniyY = 1;
        int vtoroyPraviyVerhniyX = 8;
        int vtoroyPraviyVerhniyY = 5;

        int niz = 1;
        int levo = 1;
        int verh = 1;
        int pravo = 1;
//1 niz
        if (perviyLeviyNizniyY<vtoroyLeviyNizniyY){
            niz = perviyLeviyNizniyY;
            System.out.println("niz y "+ niz);
        }
        else{
            niz = perviyLeviyNizniyY;
            System.out.println("niz y "+ niz);
        }
//2 levo
        if (perviyLeviyNizniyX<vtoroyLeviyNizniyX){
            levo = perviyLeviyNizniyX;
            System.out.println("niz x " + levo);
        }
        else{
            levo = vtoroyLeviyNizniyX;
            System.out.println("niz x "+ levo);
        }
//3 verh
        if (perviyPraviyVerhniyY>vtoroyPraviyVerhniyY){
            verh = perviyPraviyVerhniyY;
            System.out.println("verh y "+ verh);
        }
        else{
            verh = vtoroyPraviyVerhniyY;
            System.out.println("verh y "+ verh);
        }
//4 pravo
        if(perviyPraviyVerhniyX>vtoroyPraviyVerhniyX){
            pravo = perviyPraviyVerhniyX;
            System.out.println("verh x "+ pravo);
        }
        else{
            pravo = vtoroyPraviyVerhniyX;
            System.out.println("verh x "+ pravo);
        }

        System.out.println("ex 4.24");
        int a = 12;
        double kvadrat = Math.pow(a,2);
        int ten = a/10;
        int one = a%10;
        double summaKubov = (Math.pow(ten,3) + Math.pow(one,3)) * 4;
        if (kvadrat == summaKubov){
            System.out.println("ravni");
        }
        else{
            System.out.println( "ne ravni");
        }
    }
}
