package practice.Lesson108;

public class Lesson108 {
    public static void main(String[] args){
        int ves = 63;
        if (ves <= 60) {
            System.out.println("legkiy ves");
        } else if (ves <= 64) {
            System.out.println("perviy polusredniy ves");
        } else if (ves <= 69) {
            System.out.println("polusredniy ves");
        }

        System.out.println("ex 4.135");
        int t = 4;
        int ostato = t % 6;
        if (t % 6 >=0 && ostato < 3) {
            System.out.println("zel");
        }
        else if (t % 6 > 3 && t % 6 < 4) {
            System.out.println("zeltiy");
        } else if (t % 6 > 4 && t % 6 < 6) {
            System.out.println("krasniy");
        }


    }
}
