package practice.Lesson122;

public class Lesson122 {
    public static void main(String[] args) {

        for(int n = 11; n<=32; n++){
            int num = n-2 + (n-10 ) % 2;
            num = 10 + ((num%10)/2);
            System.out.println(n + " " + num);
        }
        //0 1 2 3 4 5 6 7 8 9   10   11    12   13 14 15 16 17 18 19 20
///                           11 12 13 14 15 16
        int n = 12;
        int answer = 0;
        if (n < 11) {
            answer = n -1;
        }
        else{
            int num = n-1 + (n-10 ) % 2;
            if (n % 2 == 0) {

            }else{

            }
            answer = ((n%10)/2);

        }
        System.out.println(answer);

        System.out.println("ex 9.30");
        String r = "апельсин";
        //spaniel'
        System.out.println(r.substring(5,6) + r.substring(1,2) + r.substring(0,1) + r.substring(r.length()-1) + r.substring(r.length()-2,r.length()-1) + r.substring(2,3) + r.substring(3,5));
        int chislo = 11;
        int x = chislo%10;
        int x2 = x/2;
        int x3 = x2+10;
        if(chislo%2 != 0){
            answer = x3/10;
        }
        else{
            answer = x3%10;
        }


    }
}
