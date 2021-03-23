package practice;

public class HomeWork083 {
    public static void main(String[] args) {
        System.out.println("ex 4.67");
        int k = 13;
        if (k % 7 == 0 || k % 7 == 6) {
            System.out.println("den yavlyaetsya vihodnim");
        } else {
            System.out.println("den yavlyaetsya budnim");
        }

        System.out.println("ex 5.67");
        k = 5;
        int perviyChlen = 1;
        int vtoroyChlen = 1;
        int tri = 1;
        for (int i = 0; i < k - 2; i++) {
            perviyChlen = vtoroyChlen;
            vtoroyChlen = tri;
            tri = perviyChlen + vtoroyChlen;
        }
        if (k < 2) {
            System.out.println(1);
        } else {
            System.out.println(tri);
        }
        System.out.println("ex 5.67(b");
        perviyChlen = 1;
        vtoroyChlen = 1;
        tri = 1;
        System.out.println(1);
        System.out.println(1);
        int summa = 2;
        for (int i = 0; i < k - 2; i++) {
            perviyChlen = vtoroyChlen;
            vtoroyChlen = tri;
            tri = perviyChlen + vtoroyChlen;
            summa = summa + tri;
            System.out.println(tri);
        }
        System.out.println("ex 5.67(c");
        if (summa % 2 == 0) {
            System.out.println("summa yavlyaetsya chetnim chislom");
        } else {
            System.out.println("summa yavlyaetsya ne chetnim chislom");
        }

        System.out.println("ex 6.92");//???
        int pyaterki[] = {5, 5, 5, 5, 5, 5, 1, 2, 3, 4, 3, 4, 2, 1};
        int i0 = 0;
        int i1 = 0;
        while (pyaterki[i0] == 5) {
            i1 = i0;
            i0++;
        }
        System.out.println(i1 + 1);

        System.out.println("ex 7.93");
        int nabor1[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int nabor2[] = {22, 23, 24, 25, 26, 27, 28, 29};
        summa = 0;
        int summa2 = 0;
        for (int i = 0; i < nabor1.length; i++) {
            summa = summa + nabor1[i];
            summa2 = summa2 + nabor2[i];
        }
        if (summa < summa2) {
            System.out.println("summa pervogo nabora menshe vtorogo");
        }
        if (summa2 < summa) {
            System.out.println("summa vtorogo nabora menshe pervogo");
        }

        System.out.println("ex 8.1");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(5 + " ");
            }
            System.out.println("");

        }
        System.out.println("ex 8.1(b");
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("ex 8.1(c");
        int n = 40;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                n++;
                System.out.print(n + " ");
            }
            System.out.println();
        }

        System.out.println("ex 8.2");
        n = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(5 + " ");
            }
            System.out.println();
            n++;
        }
        System.out.println("ex 8.2(b");
        n = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = n; j > 0; j--) {
                System.out.print(1 + " ");
            }
            System.out.println();
            n--;
        }

        System.out.println("ex 8.3");
        n = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
            n++;
        }
        System.out.println("ex 8.3(b");
        n = 5;
        int r = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
            n++;
            r--;
        }


        System.out.println("ex 8.3(c");
        n = 10;
        r = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
            n += 10;
            r++;
        }

        System.out.println("ex 8.3(d");
        n = 5;
        r = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(n + "\t");
            }
            System.out.println();
            n+=5;
            r--;
        }
    }
}


