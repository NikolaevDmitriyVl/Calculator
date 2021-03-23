package practice;

public class Lesson011 {
    public static void main(String[] args){
System.out.println("ex 2.19");
int n =  3256;
int tisyachi = n/1000;//3
int ostatok = n%1000;//253
int sotni = ostatok/100;//2
        int ostatok2 = ostatok%100;//53
        int desyatki = ostatok2/10;//5
        int edinici = ostatok2%10;//6
        int summa = tisyachi+sotni+desyatki+edinici;
        int proizvedenie = tisyachi*sotni*desyatki*edinici;
        System.out.println(summa);
        System.out.println(proizvedenie);

        System.out.println("ex 2.24");
        int nn = 372;
        int sotni1 = nn/100;//3
        int ostatok3 = nn%100;//72
        int desyatki1 = ostatok3/10;//7
        int edinici1 = ostatok3%10;//2
        int operaciya1 = nn-edinici1;
        int operaciya2 = operaciya1/10;
        int operaciya3 = edinici1*100+operaciya2;
        System.out.println(operaciya3);

        System.out.println("ex 2.25");
        int nnn = 123;
        int sotni3 = nnn/100;//1
        int ostatok4 = nnn%100;//23
        int desyatki3 = ostatok4/10;//2
        int edinici3 = ostatok4%10;//3
        int op1 = nnn-edinici3;//120
        int op2 = op1/10;//12
        int op3 = edinici3*100+op2;
        System.out.println(op3);


        //2.34
        /*
        52
        a1 = 2
        a2 = 5
        b = 9

        find
        z1 = 1
        z2 = 6

        52 + 9 = 61



         */



    }
}
