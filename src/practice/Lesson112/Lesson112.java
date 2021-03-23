package practice.Lesson112;

public class Lesson112 {
    int summa(int[] a){
        int summa = 0;
        for(int i = 0; i<a.length; i++){
            summa = summa + a[i];
        }
        return summa;
    }
    public static void main(String[] args) {
        System.out.println("ex 12.23(c");
        int dvumMassiv[][] = new int[7][7];
        int x = 0;
        int y = 0;
        dvumMassiv[3][3] = 1;
        for (int i = 0; i < dvumMassiv.length / 2; i++) {
            for (int j = i; j < dvumMassiv[0].length - i; j++) {
                dvumMassiv[i][j] = 1;
                dvumMassiv[dvumMassiv.length - i - 1][j] = 1;

            }

            System.out.println();
        }

        System.out.println("proverka "  + dvumMassiv[0].length);
        for (int i = 0; i < dvumMassiv.length; i++) {
            for (int j = 0; j < dvumMassiv.length; j++) {
                System.out.print(dvumMassiv[i][j] + " ");
            }
            System.out.println();
        }

      /*  System.out.println("ex 13.19");
        Ucheniki ucheniki[] = new Ucheniki[3];
        ucheniki[0] = new Ucheniki();
        ucheniki[0].name = "Ivan";
        ucheniki[0].surName = "Ivanov";
        ucheniki[0].patronymic = "Ivanovich";
        ucheniki[0].dataNumber = 1;
        ucheniki[0].dataMonth = 1;
        ucheniki[0].dataYear = 2001;

        ucheniki[1] = new Ucheniki();
        ucheniki[1].name = "Petr";
        ucheniki[1].surName = "Petrov";
        ucheniki[1].patronymic = "Petrovich";
        ucheniki[1].dataNumber = 2;
        ucheniki[1].dataMonth = 2;
        ucheniki[1].dataYear = 2002;

        ucheniki[2] = new Ucheniki();
        ucheniki[2].name = "Vasiliy";
        ucheniki[2].surName = "Vasilev";
        ucheniki[2].patronymic = "Vasilevich";
        ucheniki[2].dataNumber = 3;
        ucheniki[2].dataMonth = 3;
        ucheniki[2].dataYear = 2003;

        for(int i = 0; i<ucheniki.length; i++){
            if (ucheniki[i].dataMonth == 2 && ucheniki[i].dataNumber == 2) {
                System.out.println(ucheniki[i].surName + " " + ucheniki[i].name);
            }
        }
*/
        System.out.println("ex 12.35(a");
        int massiv[][] = {{1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};
        int a = 0;
        Lesson112 lesson = new Lesson112();
        int s = lesson.summa(massiv[3])  ;

    }
}
