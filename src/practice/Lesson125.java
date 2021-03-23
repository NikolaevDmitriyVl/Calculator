package practice;

public class Lesson125 {
    public static void main(String[] args) {
        System.out.println("ex 9.43");
        StringBuilder s1 = new StringBuilder("practice");
        StringBuilder s2 = new StringBuilder();
        for(int i = 0; i<s1.length(); i+=2){
            String x = "" + s1.charAt(i);
            s2.append(x);
            System.out.println(s2);
        }

        System.out.println("ex 9.55");
        String x = "sostavit' programmu";
        char one = 's';
        char two = 't';
        for(int i = 0; i<x.length(); i++){
            char one1 =  x.charAt(i);
            if(one == one1){
                System.out.println("index " + one + " = " + i);
            }
            if (two == one1) {
                System.out.println("index " + two + " = " + i);
            }
        }

        System.out.println("ex 9.64");
        String sentense = "dano predlozheniee";
        int count = 0;
        for(int i = 0; i< sentense.length()-1; i++){
            char one0 = sentense.charAt(i);
            char two0 = sentense.charAt(i+1);
            if (one0 == two0) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("ex 9.66");
        String sentenseTwo = "Nachal'nye i konechnye probely";
        count = 0;
        for(int i = 0; i<sentenseTwo.length(); i++){
            char probel = sentenseTwo.charAt(i);
            if(probel == ' '){
                count++;
            }
        }
        System.out.println(count+1);

        System.out.println("ex 9.67");
        String sentenseThree = "Opredelit'      kolichestvo slov";
        count = 0;
        int x1 = 0;
        int x2 = 0;
        for(int i = 0; i<sentenseThree.length(); i++){
            char probel = sentenseThree.charAt(i);

            if(probel == ' '){
                char probelTwo = sentenseThree.charAt(i-1);
                count++;
                if(probel == probelTwo){
                    count--;
                }
            }
        }
        System.out.println(count+1);



    }
}
