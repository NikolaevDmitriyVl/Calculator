package practice;

public class Lesson021 {
    public static void main(String[] args) {
        System.out.println("ex 4.110");
        int mast = 7;
        int dostoinstvoKart = 5;
        String mastStr = "";
        String dostStr = "";
        switch (mast) {
            case 1:
                mastStr += "piki";
                break;
            case 2:
                mastStr += "trefi";
                break;
            case 3:
                mastStr += "bubni";
                break;
            case 4:
        }
        mastStr += "chervi";

        switch (dostoinstvoKart) {
            case 1:
                dostStr += "edinici";
                break;
            case 2:
                dostStr += "dvoyki";
                break;
            case 3:
                dostStr += "troyki";
                break;
            case 4:
                dostStr += "chetverki";
                break;
            case 5:
                dostStr += "pyaterki";
                break;
            case 6:
                dostStr += "shesterki";
                break;
            case 7:
                dostStr += "semerki";
                break;
            case 8:
                dostStr += "vosmerki";
                break;
            case 9:
                dostStr += "devyatki";
                break;
            case 10:
                dostStr += "desyatki";
                break;
            case 11:
                dostStr += "volti";
                break;
            case 12:
                dostStr += "dami";
                break;
            case 13:
                dostStr += "koroli";
                break;
            case 14:
                dostStr += "tuzi";


        }


        String answer = mastStr + " " + dostStr;
        System.out.println(answer);

        for(int i = 0; i < 10; i++){
            System.out.println("  я не буду..  i = " + i);
            //////
        }
        System.out.println("ex 5.1");
        for(int i = 0; i < 10; i++){
            System.out.print(" 20");
        }

        System.out.println();

        System.out.println("ex 5.2");
        int q = 8;
        int w = 5;
        for(int i = 0; i < w; i++){
            System.out.print(q + " ");
        }

        System.out.println();

        System.out.println("ex 5.3(a");
        for(int i = 25; i < 36; i++){
            System.out.println(i);
        }

        System.out.println("ex 5.4(b");
        int b = 15;
        for(int i = 10; i <= b; i++){
            System.out.println(i);
        }

        System.out.println("ex 5.4(c");
        




    }
}
