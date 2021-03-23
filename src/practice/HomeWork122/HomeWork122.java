package practice.HomeWork122;

public class HomeWork122 {
    void snake(int dlin){
        int dlina = dlin;
        int dM[][] = new int[dlina][dlina];
        int k = dlina * dlina;
        int stl = 0;
        int str = 0;
        int count = 1;
        int n = 1;
        while (count <= k) {
            if (n == 1) {
                while (stl < dlina && dM[str][stl] == 0) {
                    dM[str][stl] = count;
                    stl++;
                    count++;
                }
                n = 2;
                str++;
                stl--;
            }
            if (n == 2) {
                while (str < dlina && dM[str][stl] == 0) {
                    dM[str][stl] = count;
                    str++;
                    count++;
                }
                n = 3;
                stl--;
                str--;
            }
            if (n == 3) {
                while (stl >= 0 && dM[str][stl] == 0) {
                    dM[str][stl] = count;
                    stl--;
                    count++;
                }
                n = 4;
                str--;
                stl++;
            }
            if (n == 4) {
                while (str >= 0 && dM[str][stl] == 0) {
                    dM[str][stl] = count;
                    str--;
                    count++;
                }
                n = 1;
                stl++;
                str++;
            }
        }

        for (int i = 0; i < dlina; i++) {
            for (int j = 0; j < dlina; j++) {
                System.out.print(dM[i][j] + "\t");
            }
            System.out.println();
        }
    }
    int number(int a) {
        int n = a;
        int answer = 0;
        if (n < 11) {
            answer = n - 1;
        } else {
            int x = (((n - 1) - 10) / 2) + 10;
            if (n % 2 != 0) {
                answer = x / 10;
            } else {
                answer = x % 10;
            }
        }
        return answer;
    }

    int bukva(String one, String two, String three, String n) {
        String buk = n;
        char x[] = (one + two + three).toCharArray();
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            String d = "" + x[i];
            if (buk.equals(d)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("ex 4.138");
        int n = 31;
        HomeWork122 answer = new HomeWork122();
        System.out.println(answer.number(n));
        int chis[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 0, 1, 1, 1, 2, 1, 3, 1, 4, 1, 5, 1, 6, 1, 7, 1, 8, 1, 9, 2, 0};
        for (int i = 0; i < 32; i++) {
            System.out.println((i + 1) + " = " + chis[i]);
        }
        System.out.println("chis[n] = " + chis[n - 1]);

        System.out.println("ex 8.48");
        n = 95;
        int k10 = 10;
        int k5 = 5;
        int k2 = 2;
        int k1 = 1;
        int count = 0;
        //1,2,5,10
        //int main() {
        //int n,k10,k5,k2,k1,k;
        //cout << "n = ", cin >> n, cout << "n";
        int k = 0;
        for (k10 = 0; k10 <= n / 10; k10++)
            for (k5 = 0; k5 <= (n - 10 * k10) / 5; k5++)
                for (k2 = 0; k2 <= (n - 10 * k10 - 5 * k5) / 2; k2++)
                    k1 = n - 10 * k10 - 5 * k5 - 2 * k2;
        //cout << k10 << " " << k5 << " " << k2 << " " << k1 << "n";
        k = k + 1;


        System.out.println("ex 9.19");//22,24,26,30
        String russian = "russian";
        System.out.println(russian.substring(1, 2) + russian.substring(3, 4));

        System.out.println("ex 9.20");
        String bear = "bear";
        char x[] = bear.toCharArray();
        System.out.println(x[2] + "" + x[bear.length() - 1]);

        System.out.println("ex 9.21");
        String enerdgy = "enerdgy";
        char x2[] = enerdgy.toCharArray();
        for (int i = 1; i < 4; i++) {
            System.out.print(x2[i]);
        }
        System.out.println();

        System.out.println("ex 9.23");//24,26,30
        String intel = "intel";
        int m = 2;
        n = 4;
        char x3[] = intel.toCharArray();
        for (int i = m - 1; i < n; i++) {
            System.out.print(x3[i]);
        }
        System.out.println();

        System.out.println("ex 9.25");//26,30
        String informatika = "информатика";
        System.out.println(informatika.substring(2, 7));
        System.out.println(informatika.substring(7, informatika.length() - 1));

        System.out.println("ex 9.27");//30
        String programm = "программа";
        System.out.println(programm.substring(1, 3) + programm.substring(7, 8));
        System.out.println(programm.substring(4, 7) + programm.substring(0, 1) + programm.substring(programm.length() - 1));

        System.out.println("ex 10.29");
        String predlozhenieOne = "sostavit' programmu";
        String predlozhenieTwo = "dlya nagozhdeniya";
        String predlozhenieThree = "zadannoy bukvy";
        String bukva = "a";
        System.out.println(answer.bukva(predlozhenieOne, predlozhenieTwo, predlozhenieThree, bukva));


        System.out.println("ex 11.106");
        int mas[] = {1, 2, 3, 4, 5, 3, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int i0 = 0;
        int i1 = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 != 0) {
                i0++;
            }
            if (i1 < i0) {
                i1 = i0;
            }
            if (mas[i] % 2 == 0) {
                i0 = 0;
            }
        }
        System.out.println(i1);

        System.out.println("ex 12.28");
        int dlin = 5;
        answer.snake(dlin);

        System.out.println("ex 13.23");

        System.out.println("ex 4.139");
        k = 222;
        int a = 0;
        int answ = 0;
        if (k < 101) {
            if (k % 2 == 0) {
                a = ((k / 2) - 1) + 50;
            } else {
                a = (k / 2) + 50;
            }
            if (k % 2 == 0) {
                answ = a % 10;
            } else {
                answ = a / 10;
            }
        } else {
            if ((k - 100) % 3 == 0) {
                a = (((k - 100) / 3) - 1) + 100;
            } else {
                a = ((k - 100) / 3) + 100;
            }
            if ((k - 100) % 3 == 1) {
                answ = a / 100;
            } else if ((k - 100) % 3 == 2) {
                answ = (a % 100) / 10;
            } else {
                answ = a % 10;
            }
        }
        System.out.println(answ);

        System.out.println("ex 4.140");
        k = 219;
        int cifra = 0;
        answ = 0;
        if (k < 10) {
            cifra = k;
            answ = k;
        } else if (k > 9 && k <= 188) {
            cifra = ((k - 10) / 2) + 10;
            if (k % 2 == 0) {
                answ = cifra / 10;
            } else {
                answ = cifra % 10;
            }
        } else if (k > 189 && k <= 222) {
            cifra = ((k - 190) / 3) + 100;
            if ((k - 190) % 3 == 0) {
                answ = cifra / 100;
            } else if ((k - 190) % 3 == 1) {
                answ = (cifra % 100) / 10;
            } else {
                answ = cifra % 10;
            }
        }
        System.out.println(answ);

        System.out.println("ex 4.141");
        int first = 1;
        int last = 9;
        int f = 0;
        int l = 0;
        if (first % 2 == 0) {
            f = first + 1;
        } else {
            f = first;
        }
        if (last % 2 == 0) {
            l = last - 1;
        } else {
            l = last;
        }
        int answe = ((l - f) / 2) + 1;
        if (answe % 2 == 0) {
            System.out.println("summa nomerov kvartir yavlyaetsya chetnim chislom");
        }
        if (answe % 2 == 1) {
            System.out.println("summa nomerov kvartir yavlyaetsya ne chetnim chislom");
        }

        System.out.println("ex 9.28");//30
        String tros = "трос";
        //sort, rost, tors
        System.out.println(tros.substring(3, 4) + tros.substring(2, 3) + tros.substring(1, 2) + tros.substring(0, 1));
        System.out.println(tros.substring(1, 2) + tros.substring(2, 3) + tros.substring(3, 4) + tros.substring(0, 1));
        System.out.println(tros.substring(0, 1) + tros.substring(2, 3) + tros.substring(1, 2) + tros.substring(3, 4));

        System.out.println("ex 9.29");//30
        String kloun = "клоун";
        //uklon, kulon, kolun
        System.out.println(kloun.substring(3, 4) + kloun.substring(0, 1) + kloun.substring(1, 2) + kloun.substring(2, 3) + kloun.substring(4, 5));
        System.out.println(kloun.substring(0, 1) + kloun.substring(3, 4) + kloun.substring(1, 2) + kloun.substring(2, 3) + kloun.substring(4, 5));
        System.out.println(kloun.substring(0, 1) + kloun.substring(2, 3) + kloun.substring(1, 2) + kloun.substring(3, 4) + kloun.substring(4, 5));

        System.out.println("ex 9,31");
        String virus = "вирус";
        char vir[] = virus.toCharArray();
        vir[0] = 'ф';
        vir[1] = 'o';
        vir[2] = 'k';
        String vi = "";
        for (int i = 0; i < vir.length; i++) {
            vi = vi + vir[i];
        }
        System.out.println(vi);

        System.out.println("ex 9.32");
        String kursor = "курсор";
        char kurso[] = kursor.toCharArray();
        kurso[0] = 'т';
        kurso[1] = 'a';
        kurso[2] = 'н';
        kurso[3] = 'ц';
        for (int i = 0; i < kurso.length; i++) {
            System.out.print(kurso[i]);
        }
        System.out.println();


    }
}