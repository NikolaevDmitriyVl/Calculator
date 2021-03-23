package practice.Lesson099;

public class Lesson099 {
    public static void main(String[] args){
        System.out.println("ex 4.120");
        int nomerGorizontali = 0;
        int nomerVertikali = 0;

        int ladya1X = 3;
        int ladya1Y = 3;

        int ladya2X = 5;
        int ladya2Y = 5;

        int tochkaX = 5;
        int tochkaY = 4;

        if(ladya1X == tochkaX || ladya1Y == tochkaY){
            if(tochkaX == ladya2X || tochkaY == ladya2Y){
                System.out.println("ladya budet ubita");
            }
            else{
                System.out.println("ladya ne budet ubita");
            }
        }
        else{
            System.out.println("ladya ne mozet popast v etu tochku");
        }

        System.out.println("ex 120(b");
        int ladyaX = 2;
        int ladyaY = 2;
        int ferzX = 3;
        int ferzY = 3;
        tochkaX = 6;
        tochkaY = 6;
        if(ladyaX == tochkaX || ladyaY == tochkaY){
            if(ferzX == tochkaX || ferzY == tochkaY || tochkaX - ferzX == tochkaY - ferzY){
                System.out.println("ladya budet ubita");
            }
            else{
                System.out.println("ladya ne budet ubita");
            }
        }
        else{
            System.out.println("ladya ne mozet popast v etu tochku");
        }



    }
}
