package practice.HomeWork117;

public class HomeWork117 {
    public static void main(String args[]){
        System.out.println("ex 4.130");
        int dayOne = 5;
        int monthOne = 11;
        int yearOne = 1976;
        int dayTwo = 10;
        int monthTwo = 12;
        int yearTwo = 1998;

        if (yearOne < yearTwo) {
            System.out.println("vozrast pervogo cheloveka bolshe vtorogo");
        } else if (yearOne > yearTwo) {
            System.out.println("vozrast vtorogo cheloveka bol'she pervogo");
        } else if (yearOne == yearTwo) {
            if (monthOne < monthTwo) {
                System.out.println("vozrast pervogo cheloveka bol'she vtorogo");
            } else if (monthOne > monthTwo) {
                System.out.println("vozrast vtorogo cheloveka bol'she pervogo");
            } else if (monthOne == monthTwo) {
                if (dayOne < dayTwo) {
                    System.out.println("vozrast pervogo cheloveka bol'she vtorogo");
                } else if (dayOne > dayTwo) {
                    System.out.println("vozrast vtorogo cheloveka bol'she pervogo");
                } else if (dayOne == dayTwo) {
                    System.out.println("vozrast odinakov");
                }
            }
        }
        System.out.println("ex 8.48");
        System.out.println("ex 10.26");
        System.out.println("ex 11.104");
        System.out.println("ex 12.26");
        System.out.println("ex 13.22");



    }
}
