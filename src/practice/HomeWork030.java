package practice;

public class HomeWork030 {
    public static void main(String[] args){
        System.out.println("ex 5.63");
        //10 rayonov
        int gektar[] = {4,5,4,6,7,2,8,5,4,3};
        int centneri[] = {4,5,7,3,8,5,3,4,6,4};
        int summa1 = 0;
        int summa2 = 0;
        int srednyayaGe = 1;
        int srednyayaUr = 1;
        for(int i = 0; i<10; i++){
            summa1 = summa1 + gektar[i];
            srednyayaGe = summa1/10;
            summa2 = summa2 + centneri[i];
            srednyayaUr = summa2/10;
        }
        System.out.println(srednyayaGe);
        System.out.println(srednyayaUr);


        System.out.println("ex 5.64");
        //12 rayonov
        int ziteli[] = {4,5,4,6,7,2,8,5,4,3,4,5,};
        int ploshchad[] = {4,5,7,3,8,5,3,4,6,4,5,6};
        int summaZ = 0;
        int summaP = 0;
        int plotnost = 1;
        for(int i = 0; i<12; i++){
            summaZ = summaZ + ziteli[i];
            summaP = summaP + ploshchad[i];
            plotnost = summaZ/summaP;
        }
        System.out.println(plotnost);

        System.out.println("ex 5.65");
        //12 rayonov
        int kolvoZiteley[] = {4,5,4,6,7,2,8,5,4,3,4,5,};
        int chislennost = 500;
        int summaK = 0;
        int obshchayaPloshscad = 1;
        for(int i = 0; i<12; i++){
            summaK = summaK + kolvoZiteley[i];
        }
        obshchayaPloshscad = chislennost/summaK;
        System.out.println(obshchayaPloshscad);








    }
}
