package practice.Lesson098;

import java.util.Random;

public class TyazelayaAtletika {
    String name;
    int rivokRes;
    int tolchekRes;
    Random rnd = new Random();

    int getResultTolchok(){
        tolchekRes = rnd.nextInt(100) + 50;
        return tolchekRes;
    }

    void doTolcok(){
        int res = getResultTolchok();
        System.out.println("Атлет " + name + " сделал рывок на " + res + " кг");
        return;
    }
}
