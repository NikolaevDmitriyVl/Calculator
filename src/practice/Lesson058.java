package practice;

public class Lesson058 {
    public static void main(String[] args){
        System.out.println("ex 6.33");
        int chislo = 0;
                int i = 100;
        while(i>0){
            if(i%13==0){
                System.out.println(i);
            }
            i--;
        }
        System.out.println("ex 6.33(b");
        for(i = 100; i>0; i--){
            if(i%13==0){
                System.out.println(i);
            }
        }

        System.out.println("ex 6.35");
        i = 500;
        int i0 = 0;
        while(i>0){
            if(i%13==0 || i%17==0){
                System.out.println(i);
                i0++;
            }

            i++;
            if(i0==20){
                break;
            }
        }

        i= 500;
        i0 = 0;
        while ( i0<20){
            if(i%13==0 || i%17==0){
                System.out.println("zadacha 2 "+i);
                i0++;
            }
            i++;
        }
        System.out.println("ex 6.36");
        i = 100;
        i0= 0;
        while(i0<10){
            if(i%9==0 && (i-7)%10==0){
                System.out.println(i);
                i0++;
            }
            i++;
        }

        System.out.println("ex 6.37");
        int komanda1[] = {2,2,2,5,10,0};
        int komanda2[] = {2,5,10,0};
        i= 0;
        i0 = 0;
        int vremya1 = 0;
        int vremya2 = 0;
        while(komanda1[i]>0 ){

            vremya1 = vremya1 + komanda1[i];
            i++;
            System.out.println("kolichestvo " + i + " obshhee vremya " + vremya1);
        }
        while(komanda2[i0]>0 ){
        vremya2 = vremya2 + komanda2[i0];
        i0++;
            System.out.println("kolichestvo2 " + i0 + " obshhee vremya2 " + vremya2);
        }
    }
}
