package practice;

public class Lesson085 {
    public static void main(String[] args){
        System.out.println("ex 6.92");
        int ucheniki[] = {5,5,5};
        int i0 = 0;
        int i1 = 0;
        while(i0 < ucheniki.length && ucheniki[i0] == 5 ){
            i0++;
            i1++;
        }
        System.out.println(i1);

        System.out.println("ex 11.124");
        int massiv[] = {1,2,3,4,5,6,6,5,1,2};
        int minZnachenie = massiv[0];
        i0 = 0;
        for(int i = 0; i<massiv.length; i++){
            if(minZnachenie == massiv[i]){
                i0++;
            }
            if(minZnachenie>massiv[i]){
                minZnachenie = massiv[i];
                i0 = 0;
            }
        }
        System.out.println(i0);
        System.out.println("ex 11.124(b");
        int maxZnachenie = massiv[0];
        i0 = 0;
        for(int i = 0; i<massiv.length; i++){
            if(maxZnachenie == massiv[i]){
                i0++;
            }
            if(maxZnachenie < massiv[i]){
                i0 = 1;
            }
        }
        System.out.println(i0);

        


    }
}
