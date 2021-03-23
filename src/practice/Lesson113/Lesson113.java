package practice.Lesson113;

public class Lesson113 {
    public static void main(String[] args) {
        int chislo1 = 18;
        int chislo2 = 18;
        int menshe = 0;
        int bolshe = 0;
        if (chislo1 > chislo2) {
            bolshe = chislo1;
            menshe = chislo2;
        } else if (chislo1 < chislo2) {
            bolshe = chislo2;
            menshe = chislo1;
        } else if (chislo1 == chislo2) {
            bolshe = chislo1;
            menshe = chislo1;
        }
        int ostatok = 1;
        while (ostatok > 0) {
            ostatok = bolshe % menshe;
            if (ostatok > 0) {
                bolshe = menshe;
                menshe = ostatok;
            }
        }
        System.out.println(menshe);
        bolshe = 6;
        menshe = 15;

        while(bolshe !=0 && menshe !=0){
            if(bolshe > menshe){
                bolshe %= menshe;
            }else{
                menshe %= bolshe;
            }
        }
        System.out.println(bolshe + menshe);
    }
}



/*

30/18 = 1(12)
18/12 = 1(6)
12/6 = 2(0)
 */