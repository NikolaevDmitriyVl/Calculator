package practice.Lesson119;

public class Lesson119 {
    public static void main(String args[]){
        System.out.println("ex 8.48");
       int monety[] = {1,2,5};
       int n =6;
       int i0 = 0;
       int i1 = 0;
       int mas[] = new int[monety.length];
       for(int i = 0; i<monety.length; i++){

           while(n >i0){
               i0 = i0 + monety[i];
               i1++;

           }
           if(n == i0){
                System.out.println(i1);
           }
           i1 = 0;
           i0 = 0;
       }

    }
}
//11111111111
//0
//0

//12
//112
//1112
//11112
//111112
//1111112
//11111112
//111111112
//1111111112
//
//15
//115
//1115
//11115

//155

//25
//225
//2225

//122
//1122
//11122
//111122
//1111122
//11111122
//111111122

//1222
//11222
//111222
//1111222
//11111222

//12222
//112222
//1112222

//122222


//
//125
//1125
//11125
//111125

//1225
//11225

