package practice;

public class HomeWork011 {
    public static void main(String[] args){
        System.out.println("ex 2.26");
        int n = 456;
        int handred = n/100;//4
        int ostatok = n%100;//56
        int ten = ostatok/10;//5
        int one = ostatok%10;//6
        int operation1 = n-handred*100;//56
        int operation2 = operation1*10;//560
        int operation3 = operation2+handred;//564
        System.out.println(operation3);

        System.out.println("ex 2.27");
        int n1 = 789;
        int handred1 = n1/100;
        int ostatok1 = n1%100;//89
        int ten1 = ostatok1/10;//8
        int one1 = ostatok1%10;//9
        int operation01 = n1-handred1*100;
        int operation02 = operation01*10;
        int operation03 = operation02+handred1;
        System.out.println(operation03);

        System.out.println("ex 2.28");
        int n2 = 567;
        int handred2 = n2/100;//5
        int ostatok2 = n2%100;//67
        int ten2 = ostatok2/10;//6
        int one2 = ostatok2%10;//7
        int operation001 = handred2*10+one2;//57
        int operation002 = ten2*100+operation001;//657
        System.out.println(operation002);

        System.out.println("ex 2.29");
        int n3 = 519;
        int handred3 = n3/100;//5
        int ostatok3 = n3%100;//19
        int ten3 = ostatok3/10;//1
        int one3 = ostatok3%10;//9
        int operation0001 = handred3*10+one3;//59
        int operation0002 = ten3*100+operation0001;
        System.out.println(operation0002);

        System.out.println("ex 2.30");
        int n4 = 465;
        int handred4 = n4/100;//4
        int ostatok4 = n4%100;//65
        int ten4 = ostatok4/10;
        int one4 = ostatok4%10;
        int operation11 = handred4*10+one4;//45
        int operation12 = handred4*100+one4*10+ten4;
        System.out.println(operation12);

        System.out.println("ex 2.31");
        int n5 = 132;
        int handred5 = n5/100;//1
        int ostatok5 = n5%100;//32
        int ten5 = ostatok5/10;//3
        int one5 = ostatok5%10;//2
        int operation111 = handred5*10+one5;
        int operation112 = handred5*100+one5*10+ten5;
        System.out.println(operation112);

        System.out.println("ex 2.32");
        int n6 = 456;
        int handred6 = n6/100;//4
        int ostatok6 = n6%100;//56
        int ten6 = ostatok6/10;//5
        int one6 = ostatok6%10;//6
        int operation1111 = handred6*10+ten6;//45
        int operation1112 = ten6*10+handred6;//56
        int operation1113 = one6*100+ten6*10+handred6;
        System.out.println(operation1113);

        System.out.println("ex 2/33");
        int n7 = 327;
        int handred7 = n7/100;//3
        int ostatok7 = n7%100;//27
        int ten7 = ostatok7/10;//2
        int one7 = ostatok7%10;//7
        int operation101 = handred7*10+ten7;
        int operation102 = ten7*10+handred7;
        int operation103 = one7*100+ten7;





    }
}
