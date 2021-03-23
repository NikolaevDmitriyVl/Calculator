package practice;

public class HomeWork054 {
    public static void main(String[] args){
        System.out.println("ex 4.1");
        double x = 3;
        double y = 0;
        if(x>0){
            y = Math.sin(x);
            System.out.println(y);
        }
        else{
           y = 1-2*Math.sin(x);
            System.out.println(y);
        }

        System.out.println("ex 5.1");
        int q = 20;
        for(int i = 0; i<10; i++){
            System.out.print(q + " ");
        }

        System.out.println("ex 6.20");
        double a = 1;
        double x0 = 2;
        double e = 3;
        double i = 0;
        double y0 = 0;
        while(Math.abs(Math.pow(i,2)-Math.pow((i-1),2))>e){
            i++;
            i = (1/2)*(i-1+(x/((i-1)-1)));
            System.out.println(i);
        }

        System.out.println("ex 4.2");
        double x1 = 3;
        double y1 = 0;
        if(x1>0){
            y1 = Math.sin(Math.pow(x,2));
        }
        else{
            y1 = 1 + (Math.pow(Math.sin(2),2)*x1);
        }
        System.out.println(y);

        System.out.println("ex 5.2");
        int w = 123;
        int r = 10;
        for(int t = 0; t<r; t++){
            System.out.print(w + " ");
        }

        System.out.println("ex 6.21");
        int n = 22;
        int n1 = 1;
        int n2 = 1;
        int n3 = n1 + n2;
        int result = n1 + n2;
        while(result<n){
          n1 = n2;
          n2 = n3;
          n3 = n1+n2;
          result = n3;
          i++;
          System.out.println(result);
        }

        System.out.println("ex 4.3");
        int x2 = 3;
        if(x<4){
            System.out.println("oblast 1");
        }
        else{
            System.out.println("oblast 2");
        }

        System.out.println("ex 5.3(a");
        for(int p = 20; p<=35; p++){
            System.out.println(p);
        }

        System.out.println("ex 5.3(b");
        int b = 12;
        for(int p = 10; p<=b; p++){
            System.out.println(Math.pow(p,2));
        }

        System.out.println("ex 5.3(c");
        int a1 = 40;
        for(int p = a1; p<=50; p++){
            System.out.println(Math.pow(p,3));
        }

        System.out.println("ex 5.3(d");
        int a2 = 5;
        int b2 = 10;
        for(int p = a2; p<=b2; p++){
            System.out.println(p);
        }

        System.out.println("ex 6.22");
        int a3 = 123456;
        int t = 0;
        while(a3>9){
            a3 = a3/10;
            t++;

        }
        System.out.println(t+1);

    }
}
