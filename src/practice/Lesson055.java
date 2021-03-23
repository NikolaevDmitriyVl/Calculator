package practice;

public class Lesson055 {
    public static void main(String[] args){
        System.out.println("ex 6.22(a");
        int chislo = 124;
        int result = 0;
        int i = 0;
        int n = 0;
        while(chislo > 0){
            result= chislo%10;
            chislo  = chislo/10;
            i++;
            if(result == 3){
                n++;
        }
        }
        System.out.println(n);

        System.out.println("ex 6.22");
        int w = 12345;
        int kolichestvo = 0;
        int result1 = 0;
        int poslednyayaCifra = w%10;
        while(w >0){
            result1 = w%10;
            w = w/10;
            i++;
            System.out.println(result1);
            if(result1 == poslednyayaCifra){
                kolichestvo++;
            }
        }
        System.out.println(kolichestvo);
    }
}
