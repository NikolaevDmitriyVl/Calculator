package practice.Lesson089;

public class Lesson089 {
    public static void main(String[] args){
        Car kia = new Car();
        kia.color = "black";
        kia.nomer = "a123aa";
        kia.bagag = 500;
        Car huanday = new Car();
        huanday.color = "white";
        huanday.nomer = "e321ee";
        huanday.bagag = 400;

        Ucheniki[] klass = new Ucheniki[25];

        Ucheniki ivanov = new Ucheniki();
        ivanov.name = "vasya";
        ivanov.surname = "ivanov";

        klass[0] = ivanov;

        Ucheniki ptrv = new Ucheniki();
        ptrv.name = "kolya";
        ptrv.surname = "Петров";

        klass[1] = ptrv;

        klass[2] = new Ucheniki();
        klass[2].name = "Вася";
        klass[2].surname = "Сидоров";

        FutbolniyClub[] name1 = new FutbolniyClub[12];
        FutbolniyClub name = new FutbolniyClub();
        name.nameKluba = "avangard";
        name.nameCity = "moscow";
        name1[0] = name;





    }
}
