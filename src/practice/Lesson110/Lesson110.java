package practice.Lesson110;

public class Lesson110 {
    public static void main(String args[]){
        System.out.println("ex 8.39(b");
        int s = 20;
        int count = 0;
        for(int i = 1; i<=s; i++){
            for(int j = 1; j<=s; j++){
                if (i * j == s && i<=j) {
                    System.out.println(i + " * " + j + " = " + s);
                }

                count++;
            }
        }
        System.out.println(count);

        System.out.println("ex 8.40(b");
        s = 50;
        int x = 0;
        count++;
        for(int i = 1; i<=s; i++){
            for(int j = 1; j<=s; j++){

                for(int y = 1; y<=s; y++){
                    if((i*j)*y == s ){
                        System.out.println(i + " * " + j + " * " + y + " = " + s);
                    }
                   // else{
                     //   break;
                  //}
                    //System.out.println();
                    count++;
                }
            }
        }
        System.out.println(count);


        System.out.println("ex 8.32");
        int i0 = 0;
        x = 1;
        int y = 0;
        int massiv[] = new int[100];

            for(int i = 1; x<=100; i++){
                for(int j = 1; j<=i; j++){
                    if (i % j == 0) {
                        y++;
                    }

                }
                if (y == 2) {
                    massiv[x-1] = i;
                    x++;
                }
                y = 0;

            }
            for(int i = 0; i<massiv.length; i++){
                System.out.println((i+1) + "" + massiv[i]);
            }
        }
    }

