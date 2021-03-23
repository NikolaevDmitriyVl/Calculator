package practice.HomeWork124;

public class HomeWork124 {
    public static void main(String[] args) {
        System.out.println("ex 8.48");

        System.out.println("ex 9.37");
        String cactuss = "cactus";
        StringBuilder cactus = new StringBuilder();
        cactus.append("cactus");
        StringBuilder cactus2 = new StringBuilder();
        cactus2.append(cactus);
        cactus2.delete(0,3);
        cactus.delete(3,6);
        cactus.insert(0,cactus2);
        System.out.println(cactus);
        System.out.println("ex 9.38");
        StringBuilder twelve = new StringBuilder("abcdefghimno");
        StringBuilder twelveTwo = new StringBuilder();
        StringBuilder twelveThree = new StringBuilder();
        StringBuilder twelveOne = new StringBuilder();

        twelveOne.append(twelve.substring(0,4));
      twelveTwo.append(twelve.substring(4,8));
        twelveThree.append(twelve.substring(8,12));
        //2,3,1
        StringBuilder answer = new StringBuilder();
        answer.insert( 0,twelveTwo);
        answer.insert(4,twelveThree);
        answer.insert(8,twelveOne);
       // System.out.println("one = " + twelveOne);
        //System.out.println("two = " + twelveTwo);
        //System.out.println("three = " + twelveThree);

        System.out.println(answer);
        //3,1,2
        StringBuilder answer2 = new StringBuilder();
        answer2.append(twelveThree);
        answer2.append(twelveOne);
        answer2.append(twelveTwo);
        System.out.println(answer2);
        answer2.delete(0,answer2.length());
        answer2.append(twelve.substring(0,4));
        answer2.append(twelve.substring(4,8));
        answer2.append(twelve.substring(8,12));
        System.out.println(answer2);
        System.out.println("ex 9.39");
        StringBuilder abc = new StringBuilder();
        abc.append("abcdefg");
        StringBuilder abc2 = new StringBuilder(abc);
        abc2.delete(0,3);
        abc2.delete(abc2.length()-3,abc2.length());
        System.out.println(abc2 + " = abc");
        abc2.insert(0,abc.substring(abc.length()-3,abc.length()));
        abc2.insert(abc2.length(),abc.substring(0,3));
        System.out.println(abc2);
        char abc3[] = new char[10];



        System.out.println("ex 9.40");
        StringBuilder one = new StringBuilder("intel");
        StringBuilder two = new StringBuilder(one);
        int k = 2;
        two.delete(0,k);
        System.out.println(two);
        two.insert(two.length() , one.substring(0,2));
        System.out.println("two = " +  two);


        System.out.println("ex 10.31");
        String a1 = "зимние  шины ш";
        String a2 = "летние шины";
        char a11[] = a1.toCharArray();
        char a22[] = a2.toCharArray();
        int i0 = 0;
        int i1 = 0;
        for(int i = 0; i<a1.length(); i++) {
            String e = "" + a11[i];
            if (e.equals("ш")) {
                i0++;
            }
        }
            for(int i = 0; i<a2.length(); i++){
            String e = "" + a22[i];
            if(e.equals("ш")){
                i1++;
            }
        }
        System.out.println("one = " + i0);
        System.out.println("two = " + i1);

        System.out.println("ex 11.108");

        System.out.println("ex 12.32");

        System.out.println("ex 13.24");
        String s = " Wake up, Neo! ";
        s = s.toUpperCase();
        s = s.trim();

        System.out.println("\"" + s + "\"");

        StringBuffer sb = new StringBuffer();

        sb.append(new Integer(2));
        sb.append("; ");
        sb.append(false);
        sb.append("; ");
        //sb.append(Arrays.asList(1,2,3));
        sb.append("; ");

        System.out.println(sb);

    }
}
