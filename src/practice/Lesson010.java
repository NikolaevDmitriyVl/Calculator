package practice;

public class Lesson010 {
    public static void main(String[] args){
        System.out.println("ex 2.13");
        int n = 352;
        int sotni = n/100;
        int ostatok = n%100;
        int desyatki = ostatok/10;
        int edinici = ostatok%10;
        int chislo = edinici*100+desyatki*10+sotni;
        System.out.println(chislo);

        System.out.println("ex 2.15");
        int n1 = 153;
        int sotni1 = n1/100;
        int ostatok1 = n1%100;
        int desyatki1 = ostatok1/10;
        System.out.println(desyatki1);
        int edinici1 = ostatok1%10;
        int chislo1 = edinici1*100+sotni1*10+desyatki1;
        System.out.println(chislo1);

        System.out.println("ex 2.17");
        int n2 = 268;
        int sotni2 = n2/100;
        int ostatok2 = n2%100;
        int desyatki2 = ostatok2/10;
        int edinici2 = ostatok2%10;
        int chislo2 = sotni2*100+edinici2*10+desyatki;
        System.out.println(chislo2);

        System.out.println("ex 2.18");
        int n3 = 123;
        int sotni3 = n3/100;
        //1
        int ostatok3 = n3%100;
        //23
        int desyatki3 = ostatok3/10;
        //2
        int edinici3 = ostatok3%10;
        //3
        int chisloOdin = sotni3*100+desyatki3*10+edinici3;
        System.out.println(chisloOdin);
        int chisloDwa = sotni3*100+edinici3*10+desyatki3;
        System.out.println(chisloDwa);
        int chisloTri = desyatki3*100+sotni3*10+edinici3;
        int chisloChetire = desyatki3*100+edinici3*10+sotni3;
        int chisloPyat = edinici3*100+sotni3*10+desyatki3;
        int chisloShcest = edinici3*100+desyatki3*10+sotni3;
        System.out.println(chisloTri);
        System.out.println(chisloChetire);
        System.out.println(chisloPyat);
        System.out.println(chisloShcest);


    }
}
