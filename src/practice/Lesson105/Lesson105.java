package practice.Lesson105;

public class Lesson105 {
    public void ex7_10(){
        for(int i = 10; i<=99; i++){
            if(delenieNa7(i)== true || cifra7(i) == true){
                System.out.println(i);
            }
        }
    }
    public boolean delenieNa7(int n){
        boolean answer = true;
        if(n%7 == 0){
            answer = true;
        }
        else{
            answer = false;
        }
        return answer;
    }
    public boolean cifra7(int n){
        boolean answer = true;
        if (n / 10 == 7) {
            answer = true;
        }
        else{
            answer = false;
        }
        return answer;
    }
    public boolean otwet(int n){
        boolean answer = true;
        if(n % 3 == 0 && n / 10 == 2 && n / 10 == 4 && n / 10 == 6){
            answer = true;

        }
        else{
            answer = false;
        }
        return answer;
    }


    public static void main(String[] args){
        Lesson105   o =  new Lesson105();
        System.out.println("ex 7.10");
        o.ex7_10();

        System.out.println("ex 7.12");
        for(int i = 30;i<100; i++){
            if (o.otwet(i) == true) {
                System.out.println(i);
            }
        }
    }
}
