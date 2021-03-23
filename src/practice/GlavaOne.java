package practice;

public class GlavaOne {
    public static void main(String[] args) {
        System.out.println("ex 1.4");

        int a = 34;
        int b = 54;
        System.out.print(a + " " +  b);
        System.out.println(a+b);
        System.out.print(" asd ");
        System.out.println(a);
        System.out.println( "ex1.12");

        int q = 5;
        int w = 10;
        int e = 7 ;
        String r = " sm ";
        System.out.println( q + " " + w ) ;
        System.out.println( e + r );

        System.out.println("ex 2.6");

        int sek = 15002;
        int chasi = (sek / 60) / 60;
        System.out.println( chasi );

        int min = sek / 60;
        int ostmin = min%60;
        System.out.println( ostmin );
        int polnsek = sek%60;
        System.out.println( polnsek );

        System.out.println( "ex 2.8 ");

        int k = 27;
        System.out.println( k%7);
        System.out.println( ( k%7 + 1 ) % 7);
        int d = 7 ;
        System.out.println( ( k%7 + (d-1)) %7 );
        int y = (k+d-1)%7;
        System.out.println("proverka " + y);
        System.out.println( " ex 2.9 ");
        

    }
}
