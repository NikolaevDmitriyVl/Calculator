package practice;

public class HomeWork021 {
    public static void main(String[] args) {
        System.out.println("ex 5.3(c");
        int q = 45;
        for (int i = q; i <= 50;
             i++) {
            System.out.println(i);
        }

        System.out.println("ex 5.3(d");
        int w = 30;
        int e = 38;
        for (int i = w; i <= e; i++) {
            System.out.println(i);
        }

        System.out.println("4.111(a");
        int r = 87;
        int denNedeli = r % 7;
        String answer = "";
        switch (denNedeli) {
            case 0:
                answer += "voskresenie";
                break;
            case 1:
                answer += "ponedelnik";
                break;
            case 2:
                answer += "vtornik";
                break;
            case 3:
                answer += "sreda";
                break;
            case 4:
                answer += "chetverg";
                break;
            case 5:
                answer += "pyatnica";
                break;
            case 6:
                answer += "subbota";
        }
        System.out.println(answer);

        System.out.println("4.111(b");

        System.out.println("ex 5.4");



    }
}
