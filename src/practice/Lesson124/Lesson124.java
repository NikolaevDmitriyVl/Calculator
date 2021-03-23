package practice.Lesson124;

public class Lesson124 {
    public static void main(String[] args) {
        String a = "d4656546";
        String b = "d9456546546";
        String c = a + b + a;
        b = "d888";
        System.out.println();
        StringBuilder a0 = new StringBuilder();
        a0.append("ghdfkgu");
        a0.insert(3,"!");
        System.out.println(a0);

        System.out.println("ex 9.31");
        StringBuilder virus = new StringBuilder("вирус");
        virus.replace(0,3, "фок");
        System.out.println(virus.toString());
        String virus2 = "вирус";
        virus = new StringBuilder();
        virus.append("fok");
        virus2 = virus2.substring(3);
        virus.append(virus2);
        System.out.println(virus);

        System.out.println("ex 9.32");
        StringBuilder kursor = new StringBuilder("kursor");
        kursor.replace(0,4,"tanc");
        System.out.println(kursor);

        System.out.println("ex 9.37");
        StringBuilder book = new StringBuilder("book");
        StringBuilder s = new StringBuilder(book.substring(2));
        StringBuilder s2 = new StringBuilder(book.substring(0,2));
        System.out.println(s2);
        book.replace(0,2,s.toString());
        book.replace(2,book.length(),s2.toString());

        System.out.println(book);

        System.out.println("ex 9.38");
        String r = "abcdefgemnop";




    }
}
