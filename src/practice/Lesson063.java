package practice;

public class Lesson063 {
    public static void main(String[] args){
        System.out.println("ex 6.43");
        double a[] = {100.1,200.2,300.3,300.3,300.3,1000.0};
        int i = 1;
        int kolichOdinakChisel = 0;
        int kolichNeOdinakChisel = 0;
        while(a.length > i && a[i]<=1000.0){

            if (a[i-1] == a[i]) {
                kolichOdinakChisel++;
            }
            else{
                kolichNeOdinakChisel++;

            }
            i++;
        }
        System.out.println("kolichestvo odinakovih chisel = " + (kolichOdinakChisel + 1));
        System.out.println("kolichestvo ne odinakovih chisel =" + kolichNeOdinakChisel);

        System.out.println("ex ???");
        double b[] = {12,24,24,56,56,56,1000};
        i = 0;
        int w = 0;
        boolean cond = false;//мы уже проверяем повторяющиеся числа
        while(b.length>i && a[i]<=1000 ){
            if(a[i-1] == a[i]){
                if(cond == false){
                    cond = true;
                    w++;
                }
            }else{
                cond = false;
            }
        }
    }
}
