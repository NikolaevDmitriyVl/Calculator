package practice.Lesson097;

public class Lesson097 {
    public static int maximum(int chislo, int chislo2){
        if (chislo > chislo2) {
            return chislo;
        }else if (chislo2 > chislo) {
            return chislo2;
        }
        return 0;
    }


    public static void main(String[] args){
        System.out.println("ex 10.5");
        int x = sign(56);
     System.out.println(x);
     int chisl = maximum(20, 25);
     int a = 20;
     int b = 25;
     int z = maximum(a,2*b * maximum(2*a-b,b));
         // max(a, 2 * b * max(2*a - b, b))
        System.out.println(z);

    }

    public static int sign(int number){
        if(number < 0){
            return -1;
        }else if(number > 0){
            return 1;
        }else if(number == 0){
            return 0;
        }
        return 0;


    }

}
