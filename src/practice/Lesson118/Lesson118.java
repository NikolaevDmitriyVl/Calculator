package practice.Lesson118;

public class Lesson118 {
    public static void main(String args[]) {
        System.out.println("ex 8.");
        int mas[] = {100, 200, 300, 400, 500};
        for (int i1 = 0; i1 < mas.length; i1++) {
            System.out.println(mas[i1]);
            for (int i2 = i1 + 1; i2 < mas.length; i2++) {
                System.out.println(mas[i1] + " " + mas[i2] + " ");
                for (int i3 = i2 + 1; i3 < mas.length; i3++) {
                    System.out.println(mas[i1] + " " + mas[i2] + " " + mas[i3]);
                    for (int i4 = i3 + 1; i4 < mas.length; i4++) {
                        System.out.println(mas[i1] + " " + mas[i2] + " " + mas[i3] + " " + mas[i4]);
                        for (int i5 = i4 + 1; i5 < mas.length; i5++) {
                            System.out.println(mas[i1] + " " + mas[2] + " "+ mas[i3] + " " + mas[i4] + " " + mas[i5] );
                        }

                    }
                }
            }

        }


        int x = 0;
        int password = 1357;
        int mas2[]  = {0,1,2,3,4,5,6,7,8,9};
        for(int i1 = 0; i1<mas2.length; i1++){

            for(int i2 = i1+1; i2< mas2.length; i2++){

                for(int i3 = i2+1; i3<mas2.length; i3++){

                    for(int i4 = i3+1; i4<mas2.length; i4++){
                        System.out.println(i1 + " " + i2 + " " + i3 + " " + i4);
                    }
                }
            }
        }



    }
}
