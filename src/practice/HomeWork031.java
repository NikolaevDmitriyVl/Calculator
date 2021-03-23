package practice;

public class HomeWork031 {
    public static void main(String[] args){
        System.out.println("ex 5.68");
        int k = 3;
        int chislitel1 = 1;
        int chislitel2 = 2;
        int chislitel3 = chislitel1 + chislitel2;
        int znamenatel1 = 1;
        int znamenatel2 = 1;
        int znamenatel3 = znamenatel1 + znamenatel2;
        for(int i = 1; i<= k; i++){
            chislitel1 = chislitel2;
            chislitel2 = chislitel3;
            chislitel3 = chislitel1+chislitel2;
            znamenatel1 = znamenatel2;
            znamenatel2 = znamenatel3;
            znamenatel3 = znamenatel1 + znamenatel2;
        }
            System.out.println(chislitel3 + "/" + znamenatel3);


        System.out.println("ex 5.68(b");
        int n = 3;
        int chislit1 = 1;
        int chislit2 = 2;
        int chislit3 = chislit1 + chislit2;
        int znamenat1 = 1;
        int znamenat2 = 1;
        int znamenat3 = znamenat1 + znamenat2;
        for(int i = 1; i<= 3; i++){
            chislit1 = chislit2;
            chislit2 = chislit3;
            chislit3 = chislit1+chislit2;
            znamenat1 = znamenat2;
            znamenat2 = znamenat3;
            znamenat3 = znamenat1 + znamenat2;
        System.out.println(chislit3 + "/" + znamenat3);
        }

        System.out.println("ex 5.68(c");
        int n1 = 3;
        int chisl1 = 1;
        int chisl2 = 2;
        int chisl3 = chisl1 + chisl2;
        int znamen1 = 1;
        int znamen2 = 1;
        int znamen3 = znamen1 + znamen2;
        int summa = 0;
        for(int i = 1; i<= 3; i++){
            chisl1 = chisl2;
            chisl2 = chisl3;
            chisl3 = chisl1+chisl2;
            znamen1 = znamen2;
            znamen2 = znamen3;
            znamen3 = znamen1 + znamen2;
            summa = summa+znamen3;
        }
        System.out.println(chisl3 + "/" + znamen3);


        System.out.println("ex 5.70");
        int ameba = 1;
        int triChasa = ameba * 2;
        int summa1 = 0;
        for(int i = 3; i<= 24; i+=3) {
            summa1 = summa1 + i;
        }
            System.out.println(summa);




    }
}