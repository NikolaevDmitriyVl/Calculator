package practice.Lesson091;

public class Lesson091 {
    public static void main(String[] args){
        Engine mtz52 = new DizelEngine();
        mtz52.moshhnost = 300;
        mtz52.obemDvigatelya = 200;
        Engine ps3 = new BenzinEngine();
        ps3.moshhnost = 200;
        ps3.obemDvigatelya = 300;
        Car mersedes = new Car();
        mersedes.cvetKuzova = "cherniy";
        mersedes.diametrKoles = 16;
        mersedes.engine = ps3;
        mersedes.tipKuzova = "sedan";
        Car bmw = new Car();
        bmw.cvetKuzova = "white";
        bmw.diametrKoles = 17;
        bmw.engine = mtz52;

        bmw.tipKuzova = "universal";
                Bus mitsubisi = new Bus();
                mitsubisi.cvetKuzova = "siniy";
                mitsubisi.diametrKoles = 18;
                mitsubisi.engine = mtz52;
                mitsubisi.tipKuzova = "universal";
                mitsubisi.kolichestvoPasSid = 20;
        Bus huandai = new Bus();




    }
}
