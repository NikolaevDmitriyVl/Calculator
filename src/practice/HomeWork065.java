package practice;

public class HomeWork065 {
    public static void main(String[] args){
        System.out.println("ex 4.23");
        int n = 23;
        int pervaya = n/10;
        int vtoraya = n%10;
        if (pervaya > vtoraya) {
            System.out.println("pervaya cifra bolshe chem vtoraya");
        }
        else{
            System.out.println("vtoraya cifra bolshe chem pervaya");
        }
        System.out.println("ex 4.23(b");
        if (pervaya == vtoraya) {
            System.out.println("cifri ravni");
        }
        else{
            System.out.println("cifri ne odinakovie");
        }

        System.out.println("ex 5.23");
        for(double i = 2.1; i<2.9; i+=0.1){
            System.out.println(i);
        }

        System.out.println("ex 4.24");
        double q = 48;
        int cifr1 = (int)q/10;
        int cifr2 = (int)q%10;
        if(Math.pow(q,2) == 4*(Math.pow(cifr1,3)+Math.pow(cifr2,3))){
            System.out.println("da");
        }
        else{
            System.out.println("net");
        }

        System.out.println("ex 5.24");
        for(double i = 3.1; i< 4.0; i+=0.1){
            System.out.println(i);
        }
    }
}
