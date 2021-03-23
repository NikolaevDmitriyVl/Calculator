package practice.HomeWork107;

public class HomeWork107 {
    public static void main(String[] args){
        System.out.println("ex 4.114");
        int g = 1992;
        int m = 1;
        int d = 1;
        //predidushhiy den  ne visokosniy, visokosniy
        int year = g;
        int month = m;
        int day = d;

        if (d == 1) {
            if (m == 1) {
                year = g-1;
                month = 12;
                day = 31;
            }
            else{
                month = m-1;
                year = g;
                if (month == 1) {
                    day = 31;
                }
                if(month == 2){
                    day = 28;
                }
                if (month == 3) {
                    day = 31;
                }
                if (month == 4) {
                    day = 30;
                } else if (month == 5) {
                    day = 31;
                } else if (month == 6) {
                    day = 30;
                } else if (month == 7) {
                    day = 31;
                } else if (month == 8) {
                    day = 31;
                } else if (month == 9) {
                    day = 30;
                } else if (month == 10) {
                    day = 31;
                } else if (month == 11) {
                    day = 30;
                }
            }
        }
        else  {
            year = g;
            month = m;
            day = d-1;
        }
        System.out.println(day + " day " + month + " month " + year + " year ");


        System.out.println("ex 4.114(a(b");
        g = 1992;
        m = 1;
        d = 6;
        boolean v;

        if (g % 100 == 0) {
            v = true;
        }
        else{
            v = false;
        }
        if (g % 100 != 0 && g % 4 == 0) {
            v = true;
        } else if (g % 100 != 0 && g % 4 != 0) {
            v = false;
        }
        System.out.println(v);

        if (d == 1) {
            if (m == 1) {
                year = g-1;
                month = 12;
                day = 31;

            }
            else{
                year = g;
                month = m-1;
                if (month == 1) {
                    day = 31;
                } else if (month == 2) {
                    if (v == true) {
                        day = 29;
                    }
                    else{
                        day = 28;
                    }
                } else if (month == 3) {
                    day = 31;
                } else if (month == 4) {
                    day = 30;
                } else if (month == 5) {
                    day = 31;
                } else if (month == 6) {
                    day = 30;
                } else if (month == 7) {
                    day = 31;
                } else if (month == 8) {
                    day = 31;
                } else if (month == 9) {
                    day = 30;
                } else if (month == 10) {
                    day = 31;
                } else if (month == 11) {
                    day = 30;
                }
            }


        }
        else{
            year = g;
            month = m;
            day = d-1;
        }
        System.out.println("day = " + day + " month = " + month + " year = " + year);
        System.out.println("ex 4.114(b");
        g = 1992;
        m = 6;
        d = 1;
        if (d == 31) {
            if (m == 12) {
                year = g+1;
                month = 1;
                day = 1;
            }
            else{
                year = g;
                month = m+1;
                day = 1;
            }
        }
        else if (d == 30 && m == 4 || d == 30 && m == 6 || d == 30 && m == 9 || d == 30 && m == 11 || d == 28 && m == 2) {
            year = g;
            month = m+1;
            day = 1;
        } else  {
            year = g;
            month = m;
            day = d+1;

        }
        System.out.println("day = " + day + " month = " + month + " year = " + year);
        System.out.println("ex 4.114(b(b");
        g = 1991;
        m = 2;
        d = 28;
        if (g % 100 == 0) {
            v = true;
        }
        else{
            v = false;
        }
        if (g % 100 != 0 && g % 4 == 0) {
            v = true;
        } else if (g % 100 != 0 && g % 4 != 0) {
            v = false;
        }
        if (d == 31) {
            if (m == 12) {
                year = g+1;
                month = 1;
                day = 1;
            }
            else{
                year = g;
                month = m+1;
                day = 1;
            }
        }
        else if (d == 30 && m == 4 || d == 30 && m == 6 || d == 30 && m == 9 || d == 30 && m == 11 || d == 28 && m == 2 && v == false || d == 29 && m == 2 && v == true) {
            year = g;
            month = m+1;
            day = 1;
        } else  {
            year = g;
            month = m;
            day = d+1;

        }
        System.out.println("day = " + day + " month = " + month + " year = " + year);



        System.out.println("ex 8.39");
        int s = 100;
        for(int i = 1; i<=s; i++){
            for(int j = 1; j<=s; j++){
                if (i * j == s) {
                    System.out.println(i + " umnozit na " + j + " ravno " + s);
                }
            }
        }
        System.out.println("ex 8.39");
        s = 100;
        int i0 = 0;
        int j0 = 0;
        int min = s;
        int max = 0;
        for(int i = 1; i<=s; i++){
            for(int j = 1; j<=s; j++){
                if (i * j == s && max!=i && min!=j) {
                    System.out.println(i + " * " + j + " = " + s);

                    if (i < min) {
                        min = i;
                    }
                    if (j > max) {
                        max = j;
                    }

                }
            }
        }
        System.out.println("ex 10.14");
        System.out.println("ex 11.94");
        System.out.println("ex 12.20");
        System.out.println("ex 13.15");

    }
}
