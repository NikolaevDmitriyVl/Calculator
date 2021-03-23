package practice.Lesson120;

public class Lesson120 {
    public static void main(String[] args) {
        String stroka = "some temxt";
        //stroka = new String();
        char[] arrStroka = stroka.toCharArray();
        char a = 'a';
        System.out.println(a);
        a++;
        System.out.println(a);
        a = (char)346;
        System.out.println(a);
        System.out.println((int)a);

        for(int i = 0; i<arrStroka.length; i++){
            System.out.println(arrStroka[i]);
        }
        String s = stroka.substring(2,5);
        System.out.println(s);
        int position = stroka.indexOf("m");
       // System.out.println(position);
        position = stroka.indexOf("m", 3);
        System.out.println("eeeh " + position);

        System.out.println("ex 9.5");
        String family = "Dostoevskiy";
        String pisatel = "Brat'ya Karamazovy";

        System.out.println("Pisatel' " + family + " avtor romana " + pisatel);

        System.out.println("ex 9.9");
        String familyOne = "Ivanov";
        String familyTwo = "Sidorov";

        char[] kolichestvo = familyOne.toCharArray();
        int i = kolichestvo.length;
        System.out.println(i);
        int kolichestvo2 = familyTwo.length();
        System.out.println(kolichestvo2);
        if(i>kolichestvo2){
            System.out.println("family one more");
        }
        else{
            System.out.println("famile two more");
        }

        System.out.println("ex 9.13");
        String word = "world";


        String three = word.substring(2,3);
        System.out.println(three);

        System.out.println("ex 9.14");
        String word2 = "programming";
        String poslednee = word2.substring(word2.length()-1,word2.length());
        System.out.println(poslednee);



    }
}
