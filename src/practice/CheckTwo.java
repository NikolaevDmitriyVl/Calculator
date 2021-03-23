package practice;

public class CheckTwo {
    public static void main(String[] args) {
        String a = "abc /DfG22";
        //nuzhno dostat' vse bukvy
        char[] quantity = a.toCharArray();
        for(int i = 0; i<quantity.length; i++){
            System.out.print(quantity[i]);
        }
        System.out.println();
        char r = (char)97;
        System.out.println(r);
        for(int i = 65; i<=90; i++){
            r = (char)i;
            System.out.print(r);
        }
        System.out.println();
        for(int i = 97; i<=122; i++){
            System.out.print((char)i);
        }

        System.out.println(quantity[0]);

        //int i = a.indexOf(znak);


    }
}
