package practice.HomeWork096_ex13;

public class HomeWork096_ex13 {
    public static void main(String[] args){
        System.out.println("ex 13.11");
        Ucheniki ucheniki[] = new Ucheniki[3];
        ucheniki[0] = new Ucheniki();
        ucheniki[0].surName = "Petrov";
        ucheniki[0].klass = 8;
        ucheniki[0].ocenka = 3;

        ucheniki[1] = new Ucheniki();
        ucheniki[1].surName = "Ivanov";
        ucheniki[1].klass = 9;
        ucheniki[1].ocenka = 4;

        ucheniki[2] = new Ucheniki();
        ucheniki[2].surName = "Sidorov";
        ucheniki[2].klass = 9;
        ucheniki[2].ocenka = 5;

        for(int i = 0; i<ucheniki.length; i++){
            if (ucheniki[i].klass == 9 && ucheniki[i].ocenka == 5) {
                System.out.println(ucheniki[i].surName);
            }
        }





    }
}
