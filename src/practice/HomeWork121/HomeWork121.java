package practice.HomeWork121;

public class HomeWork121 {
    void day(int a){
        switch(a){
            case 0:
                System.out.println("sunday");
                break;
                case 1:
                System.out.println("monday");
                break;
                case 2:
                System.out.println("tuesday");
                break;
                case 3:
                System.out.println("wednesday");
                break;
                case 4:
                System.out.println("thursday");
                break;
                case 5:
                System.out.println("friday");
                break;
                case 6:
                System.out.println("saturday");
                break;

        }
    }
    public static void main(String[] args) {
        System.out.println("ex 4.136");
        int day = 33;
        int ostatok = day%7;
        HomeWork121 answer = new HomeWork121();
        answer.day(ostatok);

        System.out.println("ex 4.136(b");
        int k = 3;
        day = 5;
        ostatok = ((day%7)+3)%7;
        answer.day(ostatok);

        System.out.println("ex 4.137");
        int mas[] = new int[180];
        int n = 10;
        int x = 1;
        for(int i = 0; i<180; i++){
            if (x == 1) {

                mas[i] = n/10;
                x = 0;

            }
            else{
             x = 1;
             mas[i] = n%10;
             n++;
            }
            if (x == 0) {
               // System.out.println();
            }
           // System.out.print(mas[i]);
        }

        //0 10
        //1 11
        //2 12
        //3 13
        //4 14
        //5 15
        //6 16
        //7 17
        //8 18
        //9 19
        //10 20
        //11 21
        //12 22
        //13 23

        int chisloVvod = 87;
        int para2 = 0;
        if(chisloVvod%2 == 0){
            para2 = chisloVvod;
        }
        else{
            para2 = chisloVvod-1;
        }
        int razdelit = para2/2;
        //20
        int chislo = razdelit+10;
        int answe = 0;
        if (chisloVvod % 2 == 0) {
            answe = chislo%10;
        }
        else{
            answe = chislo/10;
        }
        System.out.println();
        System.out.println("proverka para = " + chislo);
        System.out.println("answer  = " + answe);
        System.out.println("proverka " + mas[chisloVvod+1]);

        for(int i = 0; i<180; i++){
            System.out.println((i+1) + " " + mas[i]);
        }


        System.out.println("ex 8.48");
        System.out.println("ex 9.14");//16,22,24,26
        String word = "word";
        System.out.println(word.substring(word.length()-1));

        System.out.println("ex 9.15");
        String word2 = "samsung";
        k = 3;
        System.out.println(word2.substring(2,3));


        System.out.println("ex 10.28");
        String sentense = "Dany dva predlozheniya";
        String sentenseTwo = "nayti obshchee kolichestvo bukv n v nih";

        char sentensOne[] = sentense.toCharArray();
        char sentensTwo[] = sentenseTwo.toCharArray();

        //int position = stroka.indexOf("m");
        //System.out.println(position);
        //position = stroka.indexOf("m", 3);
        //System.out.println(position);
        //int position = sentense.indexOf("n",3);
        //System.out.println(position);
        //System.out.println(sentensOne[position]);
        int i0 = 0;
        for(int i = 0; i<sentensOne.length; i++){
            if(sentensOne[i] == 'n'){
                i0++;
            }
        }
        for(int i = 0; i<sentensTwo.length; i++){
            if(sentensTwo[i] == 'n'){
                i0++;
            }
        }
        System.out.println(i0);

        System.out.println("ex 11.105");
        i0 = 1;
        int massiv[] = {1,2,3,4,5,5,7,8,9,10};
        for(int i = 0; i<massiv.length-1; i++){
            if(massiv[i]!= massiv[i+1]){
                i0++;
            }
        }
        System.out.println(i0 + " raznyh ehlementov v massive");


        System.out.println("ex 12.28");
        int m = 5;
        n = 5;

        int dvumMassiv[][] = new int[m][n];
        for(int i = 0; i<dvumMassiv.length; i++){
            for(int j = 0; j<dvumMassiv.length; j++){

            }
        }

        System.out.println("ex 13.23");

        System.out.println("ex 4.138");//???
        int chisla[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        n = 5;
        if (n < 10) {
            n = n-1;
        }
        if (n > 10) {
            
        }
        System.out.println(chisla.length);

        int chis[] = {0,1,2,3,4,5,6,7,8,9,1,0,1,1,1,2,1,3,1,4,1,5,1,6,1,7,1,8,1,9,2,0};
        System.out.println("kolichestvo ehlementov v posledovatel'nosti = " + chis.length);
        for(int i = 0; i<chis.length; i++){
            System.out.println((i+1) + " " + chis[i]);
        }

        System.out.println("ex 9.17");//22,24,26
        String slovo = "olovo";
        if(slovo.substring(0,1) == slovo.substring(slovo.length()-1)){
            System.out.println("the word begins and ends with the same letter");
        }
        else{
            System.out.println("a word doesn't start and with the same letter");
        }

        System.out.println("ex 9.18");
        String wordOne = "start";
        String wordTwo = "end";
        if(wordOne.substring(0,1) == wordTwo.substring(wordTwo.length()-1)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(wordOne.substring(0,1) + " and " + wordTwo.substring(wordTwo.length()-1));


    }
}
