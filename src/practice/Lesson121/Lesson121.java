package practice.Lesson121;

public class Lesson121 {
    public static void main(String[] args) {
        System.out.println("ex 9.13");
        String word = "world";
        char word2[] = word.toCharArray();
        //int x = word.indexOf();
        //System.out.println(x);
        String output = word.substring(2,3);
        System.out.println(output);
        System.out.println("vyvod two = " + word2[2]);
        System.out.println(word.toCharArray()[2]);

        System.out.println("ex 9.16");
        String word3 = "value";
        if(word3.toCharArray()[1] == word3.toCharArray()[3]){
            System.out.println(word3.toCharArray()[1] + " and " + word3.toCharArray()[3] + " odinakovye");
        }
        else{
            System.out.println(word3.toCharArray()[1] + " and " +  word3.toCharArray()[3]+ " ne odinakovye");
        }

        if(word3.substring(2,3) == word3.substring(4,5)){
            System.out.println("ehlementy " + word3.substring(1,2) + " and " + word3.substring(3,4) + " odinakovye");
        }
        else{
            System.out.println("ehlementy " + word3.substring(1,2) + " and " + word3.substring(3,4) + " ne odinakovye");
        }

        System.out.println("ex 9.22");
        String word4 = "moscow";
        System.out.println(word4.substring(0,word4.length()/2));

        System.out.println("ex 9.24");
        String word5 = "yabloko";
        System.out.println(word5.substring(2,6));
        System.out.println(word5.substring(4));

        System.out.println("ex 9.26");
        String word6 = "vertikal";
        System.out.println(word6.substring(3,5) + (word6.substring(2,3)));
        System.out.println(word6.substring(0,2) + word6.substring(3,4) + word6.substring(5,7));
        //tir, vetka

        int k = 6;

    }
}
