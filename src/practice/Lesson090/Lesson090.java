package practice.Lesson090;

public class Lesson090 {
    public static void main(String[] args) {
        System.out.println("ex 6.107");
        int m = 5;
        int n = 4;
        int i0 = 1;
        int mn = m * n;
        while (i0 <= (m * n)) {
            while (i0 % m == 0 || i0 % n == 0) {
                System.out.println(i0);
                break;
            }
            i0++;
        }

        System.out.println("ex 13.5");
        Vershini vershini[] = new Vershini[2];
        vershini[0] = new Vershini();
        vershini[0].nameVershin = "everest";
        vershini[0].visota = 123;

        vershini[1] = new Vershini();
        vershini[1].nameVershin = "elbrus";
        vershini[1].visota = 3500;

        for(int i = 0; i<vershini.length; i++){
            if (vershini[i].visota > 3000) {
                System.out.println(vershini[i].nameVershin + " " + vershini[i].visota);

            }
        }

        System.out.println("ex 13.6");
        ModeliAvto modeliAvto[] = new ModeliAvto[3];
        modeliAvto[0] = new ModeliAvto();
        modeliAvto[0].nameCar = "Hyandai";
        modeliAvto[0].skorost = 200;

        modeliAvto[1] = new ModeliAvto();
        modeliAvto[1].nameCar = "Mersedes";
        modeliAvto[1].skorost = 250;

        modeliAvto[2] = new ModeliAvto();
        modeliAvto[2].nameCar = "BMW";
        modeliAvto[2].skorost = 300;

        for(int i = 0; i<modeliAvto.length; i++){
            if (modeliAvto[i].skorost > 250) {
                System.out.println(modeliAvto[i].nameCar + " " + modeliAvto[i].skorost);
            }
        }

        System.out.println("ex 13.7");


    }
}
