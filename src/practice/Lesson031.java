package practice;

public class Lesson031 {
    public static void main(String[] args){
    System.out.println("ex 5.67");
    int n = 3;
    int first = 1;
    int second = 1;
    int third = first + second;


    for(int i = 1; i<= 3; i++){
        first = second;
        second = third;
        third = first+second;
        System.out.println(third);
    }

    System.out.println("ex 5.68");
    int n1 = 5;
    int one = 1;
    int two = 1;
    int three = one+ two;
    int  summa = 0;
    for(int i = 1; i<=5; i++){
        one = two;
        two = three;
        three = one + two;
        summa = summa+three;

    }
    if(summa%2==0){
        System.out.println("chetnoe");

    }
    else{
        System.out.println(" ne chetnoye");
    }

    }
}
// 1 1    2
// 1 2    3
// 2 3    5
// 3 5    8
// 5 8