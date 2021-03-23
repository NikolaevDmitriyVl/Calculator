package practice.HomeWork118;

import static sun.swing.MenuItemLayoutHelper.max;

public class HomeWork118 {
    int NOD(int a, int b, int c) {
        int max = max(a, c, b);
        int nod = 0;
        for (int i = 1; i < max; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                nod = i;
            }
        }
        return nod;
    }

    public static void main(String args[]) {
        System.out.println("ex 4.131");
        int year = 1992;
        int month = 2;
        int todayYear = 2021;
        int todayMonth = 1;
        if (todayMonth == month || todayMonth > month) {


            System.out.println((todayYear - year));
        } else {
            System.out.println((todayYear - year - 1));
        }


        System.out.println("ex 8.48");
        int mas[] = {1, 2, 5, 10};
        int n = 16;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == n) {
                System.out.println(mas[i]);
            }
            for (int i2 = i + 1; i2 < mas.length; i2++) {
                if (mas[i] + mas[i2] == n) {
                    System.out.println(mas[i] + " " + mas[i2]);
                }
                for (int i3 = i2 + 1; i3 < mas.length; i3++) {
                    if ((mas[i] + mas[i2] + mas[i3]) == n) {
                        System.out.println(mas[i] + " " + mas[i2] + " " + mas[i3]);
                    }
                    for (int i4 = i3 + 1; i4 < mas.length; i4++) {
                        if ((mas[i] + mas[i2] + mas[i3] + mas[i4]) == n) {
                            System.out.println(mas[i] + " " + mas[i2] + " " + mas[i3] + " " + mas[i4]);
                        }

                    }
                }
            }
        }

        System.out.println("ex 10.26");
        int a = 100;
        int b = 200;
        int c = 300;
        HomeWork118 answer = new HomeWork118();
        System.out.println("NOD chisel " + a + ", " + b + ", " + c + " = " + answer.NOD(a, b, c));


        System.out.println("ex 11.104");
        int i0 = 1;
        int i1 = 0;
        int maxPovtorEhlementov = 0;
        int max = 0;
        int massiv[] = {1, 2, 3, 4, 5, 5, 5, 5, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i = 0; i < massiv.length - 1; i++) {
            if (massiv[i] != massiv[i + 1]) {
                i0++;
                i1++;
                maxPovtorEhlementov++;
            }
            if (massiv[i] == massiv[i + 1]) {
                i1++;
                maxPovtorEhlementov = i1;
                if (maxPovtorEhlementov > max) {
                    max = maxPovtorEhlementov;
                }
            } else {
                i1 = 0;
            }


        }
        if (max > 0) {


            System.out.println("maximal'noe kolichestvo povtoryayushchihsya ehlementov = " + (max + 1));
        } else {
            System.out.println("povtoryayushchih ehlementov v massive net");
        }
        System.out.println("kolichestvo nepovtoryayushchihsya ehlementov = " + i0);


        System.out.println("ex 8.48");
        int w[] = {1, 2, 5, 10};
        int x = 22;
        int chislo = 22;
        i0 = 0;

        for (int i = 0; i < w.length; i++) {
            chislo = x;
            while (chislo >= w[i]) {
                chislo = chislo - w[i];
                i0++;
            }
        }
        int e[] = new int[i0];
        i0 = 0;
        for (int i = 0; i < w.length; i++) {
            chislo = x;
            while (chislo >= w[i]) {
                chislo = chislo - w[i];
                e[i0] = w[i];
                i0++;
            }
        }

        for (int i = 0; i < e.length; i++) {
            System.out.println((i + 1) + " " + e[i]);

        }


       /* for (i1 = 0; i1 < e.length; i1++) {
            if (e[i1] == n) {
                System.out.println(e[i1]);
            }
            for (int i2 = i1 + 1; i2 < e.length; i2++) {
                if (e[i1] + e[i2] == n) {
                    System.out.println(e[i1] + ", " + e[i2]);
                }
                for (int i3 = i2 + 1; i3 < e.length; i3++) {
                    if ((e[i1] + e[i2] + e[i3]) == n) {
                        System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3]);
                    }
                    for (int i4 = i3 + 1; i4 < e.length; i4++) {
                        if ((e[i1] + e[i2] + e[i3] + e[i4]) == n) {
                            System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4]);
                        }
                        for (int i5 = i4 + 1; i5 < e.length; i5++) {
                            if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5]) == n) {
                                System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5]);
                            }
                            for (int i6 = i5 + 1; i6 < e.length; i6++) {
                                if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6]) == n) {
                                    System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6]);
                                }
                                for (int i7 = i6 + 1; i7 < e.length; i7++) {
                                    if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7]) == n) {
                                        System.out.println(e[i1] + " " + e[i2] + " " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7]);
                                    }
                                    for (int i8 = i7 + 1; i7 < e.length; i7++) {
                                        if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8]) == n) {
                                            System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8]);
                                        }
                                        for (int i9 = i8 + 1; i9 < e.length; i9++) {
                                            if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9]) == n) {
                                                System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9]);
                                            }
                                            for (int i10 = i9 + 1; i10 < e.length; i10++) {
                                                if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10]) == n) {
                                                    System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10]);
                                                }
                                                for (int i11 = i10 + 1; i11 < e.length; i11++) {
                                                    if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10] + e[i11]) == n) {
                                                        System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11]);
                                                    }
                                                    for (int i12 = i11 + 1; i12 < e.length; i12++) {
                                                        if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12]) == n) {
                                                            System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12]);
                                                        }
                                                        for (int i13 = i12 + 1; i13 < e.length; i13++) {
                                                            if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12] + e[i13]) == n) {
                                                                System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12] + ", " + e[i13]);
                                                            }
                                                            for (int i14 = i13 + 1; i14 < e.length; i14++) {
                                                                if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12] + e[i13] + e[i14]) == n) {
                                                                    System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12] + ", " + e[i13] + ", " + e[i14]);
                                                                }
                                                                for (int i15 = i14 + 1; i15 < e.length; i15++) {
                                                                    if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12] + e[i13] + e[i14] + e[i15]) == n) {
                                                                        System.out.println(e[i1] + " " + e[i2] + " " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12] + ", " + e[i13] + ", " + e[i14] + ", " + e[i15]);
                                                                    }
                                                                    for (int i16 = i15 + 1; i16 < e.length; i16++) {
                                                                        if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12] + e[i13] + e[i14] + e[i15] + e[i16]) == n) {
                                                                            System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12] + ", " + e[i13] + ", " + e[i14] + ", " + e[i15] + ", " + e[i16]);
                                                                        }
                                                                        for (int i17 = i16 + 1; i17 < e.length; i17++) {
                                                                            if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12] + e[i13] + e[i14] + e[i15] + e[i16] + e[i17]) == n) {
                                                                                System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12] + ", " + e[i13] + ", " + e[i14] + ", " + e[i15] + ", " + e[i16] + ", " + e[i17] + ", " + e[i18] + ", " + e[i19] + ", " + e[i20] + ", " + e[i21] + ", " + e[i22] + ", " + e[i23]);
                                                                            }
                                                                            for (int i18 = i17 + 1; i18 < e.length; i18++) {
                                                                                if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12] + e[i13] + e[i14] + e[i15] + e[i16] + e[i17] + e[i18]) == n) {
                                                                                    System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12] + ", " + e[i13] + ", " + e[i14] + ", " + e[i15] + ", " + e[i16] + ", " + e[i17] + ", " + e[i18]);
                                                                                }
                                                                                for (int i19 = i18 + 1; i19 < e.length; i19++) {
                                                                                    if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12] + e[i13] + e[i14] + e[i15] + e[i16] + e[i17] + e[i18] + e[i19]) == n) {
                                                                                        System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12] + ", " + e[i13] + ", " + e[i14] + ", " + e[i15] + ", " + e[i16] + ", " + e[i17] + ", " + e[i18] + ", " + e[i19]);
                                                                                    }
                                                                                    for (int i20 = i19 + 1; i20 < e.length; i20++) {
                                                                                        if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12] + e[i13] + e[i14] + e[i15] + e[i16] + e[i17] + e[i18] + e[i19] + e[i20]) == n) {
                                                                                            System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12] + ", " + e[i13] + ", " + e[i14] + ", " + e[i15] + ", " + e[i16] + ", " + e[i17] + ", " + e[i18] + ", " + e[i19] + ", " + e[i20]);
                                                                                        }
                                                                                        for (int i21 = i20 + 1; i21 < e.length; i21++) {
                                                                                            if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12] + e[i13] + e[i14] + e[i15] + e[i16] + e[i17] + e[i18] + e[i19] + e[i20] + e[i21]) == n) {
                                                                                                System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12] + ", " + e[i13] + ", " + e[i14] + ", " + e[i15] + ", " + e[i16] + ", " + e[i17] + ", " + e[i18] + ", " + e[i19] + ", " + e[i20] + ", " + e[i21]);
                                                                                            }
                                                                                            for (int i22 = i21 + 1; i22 < e.length; i22++) {
                                                                                                if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12] + e[i13] + e[i14] + e[i15] + e[i16] + e[i17] + e[i18] + e[i19] + e[i20] + e[i21] + e[i22]) == n) {
                                                                                                    System.out.println(e[i1] + " " + e[i2] + " " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12] + ", " + e[i13] + ", " + e[i14] + ", " + e[i15] + ", " + e[i16] + ", " + e[i17] + ", " + e[i18] + ", " + e[i19] + ", " + e[i20] + ", " + e[i21] + ", " + e[i22]);
                                                                                                }
                                                                                                for (int i23 = i22 + 1; i23 < e.length; i23++) {
                                                                                                    if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12] + e[i13] + e[i14] + e[i15] + e[i16] + e[i17] + e[i18] + e[i19] + e[i20] + e[i21] + e[i22] + e[i23]) == n) {
                                                                                                        System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12] + ", " + e[i13] + ", " + e[i14] + ", " + e[i15] + ", " + e[i16] + ", " + e[i17] + ", " + e[i18] + ", " + e[i19] + ", " + e[i20] + ", " + e[i21] + ", " + e[i22] + ", " + e[i23]);
                                                                                                    }
                                                                                                    for (int i24 = i7 + 1; i7 < e.length; i7++) {
                                                                                                        if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8]) == n) {
                                                                                                            System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8]);
                                                                                                        }
                                                                                                        for (int i25 = i8 + 1; i9 < e.length; i9++) {
                                                                                                            if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9]) == n) {
                                                                                                                System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9]);
                                                                                                            }
                                                                                                            for (int i26 = i9 + 1; i10 < e.length; i10++) {
                                                                                                                if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10]) == n) {
                                                                                                                    System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10]);
                                                                                                                }
                                                                                                                for (int i27 = i10 + 1; i11 < e.length; i11++) {
                                                                                                                    if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10] + e[i11]) == n) {
                                                                                                                        System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11]);
                                                                                                                    }
                                                                                                                    for (int i28 = i11 + 1; i12 < e.length; i12++) {
                                                                                                                        if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12]) == n) {
                                                                                                                            System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12]);
                                                                                                                        }
                                                                                                                        for (int i29 = i12 + 1; i13 < e.length; i13++) {
                                                                                                                            if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12] + e[i13]) == n) {
                                                                                                                                System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12] + ", " + e[i13]);
                                                                                                                            }
                                                                                                                            for (int i30 = i13 + 1; i14 < e.length; i14++) {
                                                                                                                                if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12] + e[i13] + e[i14]) == n) {
                                                                                                                                    System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12] + ", " + e[i13] + ", " + e[i14]);
                                                                                                                                }
                                                                                                                                for (int i31 = i14 + 1; i15 < e.length; i15++) {
                                                                                                                                    if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12] + e[i13] + e[i14] + e[i15]) == n) {
                                                                                                                                        System.out.println(e[i1] + " " + e[i2] + " " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12] + ", " + e[i13] + ", " + e[i14] + ", " + e[i15]);
                                                                                                                                    }
                                                                                                                                    for (int i32 = i15 + 1; i16 < e.length; i16++) {
                                                                                                                                        if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12] + e[i13] + e[i14] + e[i15] + e[i16]) == n) {
                                                                                                                                            System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12] + ", " + e[i13] + ", " + e[i14] + ", " + e[i15] + ", " + e[i16]);
                                                                                                                                        }
                                                                                                                                        for (int i33 = i16 + 1; i17 < e.length; i17++) {
                                                                                                                                            if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12] + e[i13] + e[i14] + e[i15] + e[i16] + e[i17]) == n) {
                                                                                                                                                System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12] + ", " + e[i13] + ", " + e[i14] + ", " + e[i15] + ", " + e[i16] + ", " + e[i17] + ", " + e[i18] + ", " + e[i19] + ", " + e[i20] + ", " + e[i21] + ", " + e[i22] + ", " + e[i23]);
                                                                                                                                            }
                                                                                                                                            for (int i34 = i17 + 1; i18 < e.length; i18++) {
                                                                                                                                                if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12] + e[i13] + e[i14] + e[i15] + e[i16] + e[i17] + e[i18]) == n) {
                                                                                                                                                    System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12] + ", " + e[i13] + ", " + e[i14] + ", " + e[i15] + ", " + e[i16] + ", " + e[i17] + ", " + e[i18]);
                                                                                                                                                }
                                                                                                                                                for (int i35 = i18 + 1; i19 < e.length; i19++) {
                                                                                                                                                    if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12] + e[i13] + e[i14] + e[i15] + e[i16] + e[i17] + e[i18] + e[i19]) == n) {
                                                                                                                                                        System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12] + ", " + e[i13] + ", " + e[i14] + ", " + e[i15] + ", " + e[i16] + ", " + e[i17] + ", " + e[i18] + ", " + e[i19]);
                                                                                                                                                    }
                                                                                                                                                    for (int i36 = i19 + 1; i20 < e.length; i20++) {
                                                                                                                                                        if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12] + e[i13] + e[i14] + e[i15] + e[i16] + e[i17] + e[i18] + e[i19] + e[i20]) == n) {
                                                                                                                                                            System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12] + ", " + e[i13] + ", " + e[i14] + ", " + e[i15] + ", " + e[i16] + ", " + e[i17] + ", " + e[i18] + ", " + e[i19] + ", " + e[i20]);
                                                                                                                                                        }
                                                                                                                                                        for (int i37 = i20 + 1; i21 < e.length; i21++) {
                                                                                                                                                            if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12] + e[i13] + e[i14] + e[i15] + e[i16] + e[i17] + e[i18] + e[i19] + e[i20] + e[i21]) == n) {
                                                                                                                                                                System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12] + ", " + e[i13] + ", " + e[i14] + ", " + e[i15] + ", " + e[i16] + ", " + e[i17] + ", " + e[i18] + ", " + e[i19] + ", " + e[i20] + ", " + e[i21]);
                                                                                                                                                            }
                                                                                                                                                            for (int i38 = i21 + 1; i22 < e.length; i22++) {
                                                                                                                                                                if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12] + e[i13] + e[i14] + e[i15] + e[i16] + e[i17] + e[i18] + e[i19] + e[i20] + e[i21] + e[i22]) == n) {
                                                                                                                                                                    System.out.println(e[i1] + " " + e[i2] + " " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12] + ", " + e[i13] + ", " + e[i14] + ", " + e[i15] + ", " + e[i16] + ", " + e[i17] + ", " + e[i18] + ", " + e[i19] + ", " + e[i20] + ", " + e[i21] + ", " + e[i22]);
                                                                                                                                                                }
                                                                                                                                                                for (int i39 = i22 + 1; i23 < e.length; i23++) {
                                                                                                                                                                    if ((e[i1] + e[i2] + e[i3] + e[i4] + e[i5] + e[i6] + e[i7] + e[i8] + e[i9] + e[i10] + e[i11] + e[i12] + e[i13] + e[i14] + e[i15] + e[i16] + e[i17] + e[i18] + e[i19] + e[i20] + e[i21] + e[i22] + e[i23]) == n) {
                                                                                                                                                                        System.out.println(e[i1] + ", " + e[i2] + ", " + e[i3] + ", " + e[i4] + ", " + e[i5] + ", " + e[i6] + ", " + e[i7] + ", " + e[i8] + ", " + e[i9] + ", " + e[i10] + ", " + e[i11] + ", " + e[i12] + ", " + e[i13] + ", " + e[i14] + ", " + e[i15] + ", " + e[i16] + ", " + e[i17] + ", " + e[i18] + ", " + e[i19] + ", " + e[i20] + ", " + e[i21] + ", " + e[i22] + ", " + e[i23]);
                                                                                                                                                                    }

                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }

                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }


                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }

                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }

                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }

                                                                                    }
                                                                                }
                                                                            }

                                                                        }

                                                                        }
                                                                    }
                                                                }
                                                            }

                                                        }
                                                    }
                                                }
                                            }


                                        }
                                    }
                                }
                            }

                        }
                    }
                }
            }
*/

            System.out.println("ex 12.26");
            // edinicy - chernye polya, nuli belye polya
            //n = chetnoe, n = nechetnoe
            n = 8;
            if (n % 2 == 1) {


                x = 1;
            } else {
                x = 0;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(x + "\t");
                    if (x == 0) {
                        x = 1;
                    } else {
                        x = 0;
                    }

                }
                if (x == 0) {
                    x = 1;
                } else {
                    x = 0;
                }
                System.out.println();
            }


            System.out.println("ex 12.26(b");
            int m = 7;
            if (n % 2 == 1) {


                x = 1;
            } else {
                x = 0;
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(x + "\t");
                    if (x == 0) {
                        x = 1;
                    } else {
                        x = 0;
                    }

                }
                System.out.println();
            }


            System.out.println("ex 13.22");
            Osadki o[] = new Osadki[3];
            o[0] = new Osadki();
            o[0].day = 1;
            o[0].temperature = -2;

            o[1] = new Osadki();
            o[1].day = 2;
            o[1].temperature = 2;

            o[2] = new Osadki();
            o[2].day = 3;
            o[2].temperature = 3;

            for (int i = 0; i < o.length; i++) {
                if (o[i].temperature < 0) {
                    System.out.println(o[i].day + " chisla vypal sneg");
                } else {
                    System.out.println(o[i].day + " chisla shel dozhd'");
                }
            }

            System.out.println("ex 4.132");
            a = 5;//chasov
            b = 10;// minut pribyl
            c = 10;// hours
            int d = 5;// minutes otpravilsya
            n = 6;
            m = 20;//prishel chelovek

            if (n < c && n > a) {
                System.out.println("poezd stoit na platforme");
            } else if (n == c || c == a) {
                if (n == c) {
                    if (m < d) {
                        System.out.println("poezd stoit na platrorme");
                    } else {
                        System.out.println("poezda ne stoit");
                    }

                } else if (n == a) {
                    if (m > a) {
                        System.out.println("poezd stoit na platforme");
                    } else {
                        System.out.println("poezda net");
                    }
                }
            } else {
                System.out.println("poezda net");
            }


        }
    }

