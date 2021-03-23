package practice.Lesson092;

public class Lesson092 {
    public static void main(String[] args){

        Stanok stanok[] = new Stanok[4];

        stanok[0] = new Tokarniy();
        stanok[0].nazvanie = "Tokarniy stanok 16k20";
        stanok[0].proizvoditel = "Moskva Krasniy Proletariy";
        stanok[0].ves = 3035;
        stanok[0].gabariti.visota = 1324;
        stanok[0].gabariti.dlina = 2812;
        stanok[0].gabariti.shirina = 1166;
        stanok[0].dvigatel.moshhnost = 10;
        ((Tokarniy)stanok[0]).skorostShpindelya = 3000;

        stanok[1] = new Frezerniy();
        stanok[1].nazvanie = "Frezerniy vertikalniy 6N10";
        stanok[1].proizvoditel = "Zalgiris";
        stanok[1].ves = 1160;
        stanok[1].gabariti.dlina = 2360;
        stanok[1].gabariti.shirina = 1860;
        stanok[1].gabariti.visota = 1730;
        stanok[1].dvigatel.moshhnost = 3;
        ((Frezerniy)stanok[1]).klassTochnosti = 4;
        ((Frezerniy)stanok[1]).vid = "Vertikalniy";
    }
}
