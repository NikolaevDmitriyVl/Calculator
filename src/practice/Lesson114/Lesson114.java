package practice.Lesson114;

public class Lesson114 {
    public static void main(String[] args) {
        System.out.println("ex 8.50");
        int money[] = {1, 2, 4, 8, 16, 32, 64};
        int n = 127;
        int x = 0;
        int i0 = 0;
        int count = 0;
        for (int i = 6; i >= 0; i--) {
            if (x + money[i] < n || x + money[i] == n) {
                x = x + money[i];
                i0++;
                for (int j = 0; x + money[i] < n || x + money[i] == 0; j++) {
                    x = x + money[i];
                    i0++;
                    count++;
                }
                System.out.println(money[i] + " kupyur = " + i0 + " shtuk");
                i0 = 0;
                count++;
            }
        }
        System.out.println(count);
        System.out.println();
        int moneyType = 64;
        n = 127;
        x = n;
        count = 0;
        while (moneyType > 0) {

            i0 = x / moneyType;
            x = x % moneyType;
            if(i0>0){
            System.out.println(moneyType + " kupyur = " + i0 + " shtuk");
            }
            moneyType/=2;
            count++;
        }
        System.out.println(count );

    }
}
