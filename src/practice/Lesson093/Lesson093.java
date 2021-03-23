package practice.Lesson093;

public class Lesson093 {

    public double function10_1(){
        double x = ((Math.sqrt(6)+6)/2) + ((Math.sqrt(13)+13)/2) + ((Math.sqrt(21)+21)/2);
        return x;
    }
    public double function10_2(){
        double y = (5 + Math.sqrt(5)/(Math.sqrt(7)+7)) + ((12+Math.sqrt(13))/(Math.sqrt(8)+8)) + ((31 + Math.sqrt(31)) / (Math.sqrt(2) + 2));
        return y;
    }
    public double function10_3(){
        double r = ((1+Math.sin(1))/3) + (5+ Math.sin(5)) + ((3 + Math.sin(3)) / 3);
        return r;
    }



    public static void main(String[] args){
        Lesson093 lesson = new Lesson093();
        double w = lesson.function10_1();
        System.out.println(w);

        w = lesson.function10_2();
        System.out.println(w);

        double t = lesson.function10_3();
        System.out.println(t);

        


    }
}
