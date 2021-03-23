package practice;

public class Lesson037 {
    public static void main(String[] args){
        System.out.println("ex 2.35");
        int a1 = 2;
        int a2 = 2;//22

        int b1 = 7;
        int b2 = 4;//46

        int c1 = (a1 + b1) % 10;//1
        int c2 = (a2 + b2) + ((b1+a1)/10);//6

        System.out.println(c2+""+c1);

        System.out.println("ex 4.131");
        int godRozdeniya = 1992;
        int mesyacRozdeniya = 1;
        int godNow = 2019;
        int mesyacNow = 8;
        int let = 1;
        int mesyacev = 1;
        if(mesyacNow>mesyacRozdeniya){
            mesyacev = mesyacNow-mesyacRozdeniya;
            let = godNow - godRozdeniya;
        }
        else{
            mesyacev = mesyacRozdeniya-mesyacNow;
                    let = godNow-godRozdeniya-1;
        }
        System.out.println("let " + let + " mesyacev " + mesyacev);


    }
}
