package practice.K3;
import java.util.Scanner;

public class KlassOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();

        //System.out.println(a);

        String znak = "";



        if (a.contains("+")) {
            znak = "+";
        }
        else if(a.contains("-")){
            znak = "-";
        }
        else if(a.contains("*")){
            znak = "*";
        }
        else if(a.contains("/")){
            znak = "/";
        }


        int i = a.indexOf(znak);
        String doZnaka = a.substring(0,i);
        String posleZnaka = a.substring(i+1,a.length());


        //System.out.println(znak);
        //System.out.println(doZnaka);
        //System.out.println(posleZnaka);

        int doZnakaInt = Integer.parseInt(doZnaka);
        //System.out.println("proverka " + doZnakaInt);


        int posleZnakaInt = Integer.parseInt(posleZnaka);


        int answer = 0;
        switch(znak) {
            case "*":{
              answer =   doZnakaInt * posleZnakaInt;

            }
            break;
            case  "/":{
                answer = doZnakaInt / posleZnakaInt;

            }
            break;
            case "+":{

                answer = doZnakaInt + posleZnakaInt;
            }
            break;
            case "-":{

                answer = doZnakaInt + posleZnakaInt;
            }
            break;
        }
        System.out.println(doZnakaInt + " " + znak + " " + posleZnakaInt + " = " + answer);

    }
}
