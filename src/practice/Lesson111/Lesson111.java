package practice.Lesson111;

public class Lesson111 {
    public static void main(String args[]){
        System.out.println("ex 8.41");
        double answer = 0;
        int d = -1;
        for(int i = 1; i<=30; i++){
            d = d+1;
            for(int j = 1; j<=30; j++){
                answer = Math.sqrt(Math.pow(i,2) + Math.pow(j,2));
                if (answer >= 1 && answer <= 30  && j>d){
                    System.out.println(Math.pow(i,2) + " + " + Math.pow(j,2) + " = " + answer);
                }
            }
        }

    }
}
