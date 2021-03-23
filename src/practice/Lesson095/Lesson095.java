package practice.Lesson095;

public class Lesson095 {
    public static void main(String[] args){
        System.out.println("ex 4.116");
        int a1 = 1;//chislo edinic
        int a2 = 2;// chislo desyatkov
        int b = 3;
        int x1 = a1-b;
        int x2 = 0;
        if (x1 >= 0) {
            x1 = a1-b;
            x2 = a2;
        }
        else{
            x1 = (10+a1)-b;
            x2 = a2-1;
        }
        System.out.println(x2 + "" + x1);

        System.out.println("ex 4.117");
        a1 = 5;
        a2 = 6;
        int b1 = 3;
        int b2 = 4;//desyatki
        x1 = a1-b1;
        x2 = 0;
        if (x1 >= 0) {
            x1 = x1;
            x2 = a2-b2;
        }
        else{
            x1 = (a1+10)-b1;
            x2 = (a2-1)-b2;
        }
        System.out.println(x2+""+x1);

        System.out.println("ex 4.118");
        int a = 2;//vertikal
        b = 3;//gorizontal
        int c = 4;
        int d = 5;
        if(a==c){
            System.out.println("ugrozaet");
        }
        if(b==d){
            System.out.println("ugrozaet");
        }
        if(a!=c || b!=d){
            System.out.println("ne ugrozaet");
        }

        System.out.println("ex 4.119");
        

    }
}
