package practice.Lesson116;

import java.util.Random;

public class Lesson116 {
    public static void main(String args[]) {
        FootballTeam teamArr[] = new FootballTeam[7];
        teamArr[0] = new FootballTeam();
        teamArr[0].name = "Nizhniy Novgorod";
        teamArr[1] = new FootballTeam();
        teamArr[1].name = "Kr.sovetov      ";
        teamArr[2] = new FootballTeam();
        teamArr[2].name = "Orenburg        ";
        teamArr[3] = new FootballTeam();
        teamArr[3].name = "Torpedo M       ";
        teamArr[4] = new FootballTeam();
        teamArr[4].name = "Alaniya         ";
        teamArr[5] = new FootballTeam();
        teamArr[5].name = "Veles Moskva    ";
        teamArr[6] = new FootballTeam();
        teamArr[6].name = "SKA Habarovsk   ";


       /* Game result[] = new Game[100];
        //Game result2[] = new Game[];
        int resul[] = {0, 3, 0, 0, 2, 0, 1, 1, 3, 1, 1, 0, 0, 1, 1, 3, 2, 0, 2, 1, 2, 0, 2, 1, 2, 0, 1, 1, 2, 2, 2, 0, 0, 1, 4, 2, 1, 1, 2, 4, 1, 0};


        int resul2[] = new int[resul.length];
        int i0 = 0;
        for (int i = 1; i < resul.length + 1; i++) {
            if (i % 2 == 0) {
                resul2[i0] = resul[i0 - 1];
            }
            if (i % 2 == 1) {
                resul2[i0] = resul[i0 + 1];
            }
            i0++;
        }
        for (int i = 0; i < resul.length; i++) {
            System.out.print(resul2[i] + ",");
        }
        System.out.println();


        System.out.println("skol'ko cifr v massive = " + resul.length);
int x = 1;
int a1 = 12;
int a2 = a1;
int b1 = 6;
int b2 = 0;
i0 = 0;
int i1 = 0;
        for (int i = 1; i <= (resul.length*2); i++){
            if(i == 1 || i == 14 || i == 28 || i == 42 || i == 56 || i == 70 || i == 84){
                System.out.print(x);
                x = x+1;
            }
            if(a2>0){
                a2--;
                System.out.print(resul[i0]);
                if (a2 == 0) {
                    b1 = b1+2;
                    b2 = b1;
                }
                i0++;
            }
            else if(b2>0){
                b2--;
                System.out.print(resul2[i1]);
                if (b2 == 0) {
                    a1 = a1-2;
                    a2 = a1;
                }

                i1++;
            }
            if (i % 7 == 0) {
                System.out.println();
            }

        }


            int a = 0;
        i0 = 0;
        for (int i = 0; i < resul.length; i++) {
            if (a < 13) {
                i0++;
                System.out.print("\t" + resul[i]);
                {
                    if (i0 == 12) {
                        System.out.println();
                        i0 = 0;
                    }
                }
            } else {
                if (a < 23 && a > 12) {
                    System.out.print("\t" + resul[i]);
                    i0++;
                    if (i0 == 10) {
                        System.out.println();
                        i0 = 0;
                    }
                } else {
                    if (a < 31 && a > 22) {
                        i0++;
                        System.out.print("\t" + resul[i]);
                        if (i0 == 8) {
                            System.out.println();
                            i0 = 0;
                        }
                    } else {
                        if (a < 37 && a > 30) {
                            i0++;
                            System.out.print("\t" + resul[i]);
                            if (i0 == 6) {
                                System.out.println();
                                i0 = 0;
                            }
                        } else {
                            if (a < 41 && a > 36) {
                                i0++;
                                System.out.print("\t" + resul[i]);
                                {
                                    if (i0 == 4) {
                                        System.out.println();
                                        i0 = 0;
                                    }
                                }
                            } else {
                                if (a < 43 && a > 40) {
                                    System.out.print("\t" + resul[i]);
                                    i0++;
                                    if (i0 == 2) {
                                        System.out.println();
                                        i0 = 0;
                                    }

                                }
                            }
                        }
                    }
                }
            }
            a = a + 1;
        }
*/
/*
0
   1 2 3 4 5 6
1
   2 3 4 5 6
2
   3 4 5 6
3
   4 5 6
4
   5 6
5
   6

 */
        Lesson116 nizhniyNovgorod[] = new Lesson116[6];

        Game games[] = new Game[70];
        games[0] = new Game();
        games[0].result1 = 0;
        games[0].result2 = 0;
        games[0].team1 = teamArr[0];
        games[0].team2 = teamArr[1];
        int k = 0;
        Random rnd = new Random();
        for(int i = 0; i < 6; i++){

            for(int j = (i+1); j<=6; j++){
                games[k] = new Game();
                games[k].result1 = rnd.nextInt(10);
                games[k].result2 = rnd.nextInt(10);
                games[k].team1 = teamArr[i];
                games[k].team2 = teamArr[j];
                k++;
            }

        }
        k = 0;
        for(int i = 0; i < 6; i++){
            for(int j = (i+1); j <= 6; j++){
                System.out.print(games[k].team1.name+" "+games[k].result1 + " : " +  games[k].result2 +" "+ games[k].team2.name +"; ");
                k++;
            }
            System.out.println();

        }

        Game games2[] = new Game[42];
        int i0 = 0;
        for(int i = 0; i<6; i++){
            for(int j = (i+1); j<=6; j++){
                games2[k] = new Game();
                games2[k] = games[k];
                k++;
            }
        }

        final int tt = 5;




        /*int resul2[] = new int[];
        i0 = 0;
        for (int i = 1; i < resul.length + 1; i++) {
            if (i % 2 == 0) {
                resul2[i0] = resul[i0 - 1];
            }
            if (i % 2 == 1) {
                resul2[i0] = resul[i0 + 1];
            }
            i0++;
        }
        */

        Game gamesX[] = new Game[21];
        gamesX[0] = new Game();
        gamesX[0].result1 = 0;
        gamesX[0].result2  = 3;
        gamesX[0].team1 = teamArr[0];
        gamesX[0].team2 = teamArr[1];

        gamesX[1] = new Game();
        gamesX[1].result1 = 0;
        gamesX[1].result2  = 0;
        gamesX[1].team1 = teamArr[0];
        gamesX[1].team2 = teamArr[1];

        gamesX[2] = new Game();
        gamesX[2].result1 = 2;
        gamesX[2].result2  = 0;
        gamesX[2].team1 = teamArr[0];
        gamesX[2].team2 = teamArr[1];

        gamesX[3] = new Game();
        gamesX[3].result1 = 1;
        gamesX[3].result2  = 1;
        gamesX[3].team1 = teamArr[0];
        gamesX[3].team2 = teamArr[1];

        gamesX[4] = new Game();
        gamesX[4].result1 = 3;
        gamesX[4].result2  = 1;
        gamesX[4].team1 = teamArr[0];
        gamesX[4].team2 = teamArr[1];

        gamesX[5] = new Game();
        gamesX[5].result1 = 1;
        gamesX[5].result2  = 0;
        gamesX[5].team1 = teamArr[0];
        gamesX[5].team2 = teamArr[1];

        gamesX[6] = new Game();
        gamesX[6].result1 = 0;
        gamesX[6].result2  = 1;
        gamesX[6].team1 = teamArr[0];
        gamesX[6].team2 = teamArr[1];

        gamesX[7] = new Game();
        gamesX[7].result1 = 1;
        gamesX[7].result2  = 3;
        gamesX[7].team1 = teamArr[0];
        gamesX[7].team2 = teamArr[1];

        gamesX[8] = new Game();
        gamesX[8].result1 = 2;
        gamesX[8].result2  = 0;
        gamesX[8].team1 = teamArr[0];
        gamesX[8].team2 = teamArr[1];

        gamesX[9] = new Game();
        gamesX[9].result1 = 2;
        gamesX[9].result2  = 1;
        gamesX[9].team1 = teamArr[0];
        gamesX[9].team2 = teamArr[1];


        gamesX[10] = new Game();
        gamesX[10].result1 = 2;
        gamesX[10].result2  = 0;
        gamesX[10].team1 = teamArr[0];
        gamesX[10].team2 = teamArr[1];

        gamesX[11] = new Game();
        gamesX[11].result1 = 2;
        gamesX[11].result2  = 1;
        gamesX[11].team1 = teamArr[0];
        gamesX[11].team2 = teamArr[1];

        gamesX[12] = new Game();
        gamesX[12].result1 = 2;
        gamesX[12].result2  = 0;
        gamesX[12].team1 = teamArr[0];
        gamesX[12].team2 = teamArr[1];

        gamesX[13] = new Game();
        gamesX[13].result1 = 1;
        gamesX[13].result2  = 1;
        gamesX[13].team1 = teamArr[0];
        gamesX[13].team2 = teamArr[1];

        gamesX[14] = new Game();
        gamesX[14].result1 = 2;
        gamesX[14].result2  = 2;
        gamesX[14].team1 = teamArr[0];
        gamesX[14].team2 = teamArr[1];

        gamesX[15] = new Game();
        gamesX[15].result1 = 2;
        gamesX[15].result2  = 0;
        gamesX[15].team1 = teamArr[0];
        gamesX[15].team2 = teamArr[1];

        gamesX[16] = new Game();
        gamesX[16].result1 = 0;
        gamesX[16].result2  = 1;
        gamesX[16].team1 = teamArr[0];
        gamesX[16].team2 = teamArr[1];

        gamesX[17] = new Game();
        gamesX[17].result1 = 4;
        gamesX[17].result2  = 2;
        gamesX[17].team1 = teamArr[0];
        gamesX[17].team2 = teamArr[1];

        gamesX[18] = new Game();
        gamesX[18].result1 = 1;
        gamesX[18].result2  = 1;
        gamesX[18].team1 = teamArr[0];
        gamesX[18].team2 = teamArr[1];

        gamesX[19] = new Game();
        gamesX[19].result1 = 2;
        gamesX[19].result2  = 4;
        gamesX[19].team1 = teamArr[0];
        gamesX[19].team2 = teamArr[1];

        gamesX[20] = new Game();
        gamesX[20].result1 = 1;
        gamesX[20].result2  = 0;
        gamesX[20].team1 = teamArr[0];
        gamesX[20].team2 = teamArr[1];

        int w = 0;
        int mas1[] = new int[gamesX.length*2];
        for(int i = 0; i<gamesX.length; i++){
            mas1[w] = gamesX[i].result1;
            w++;
            mas1[w] = gamesX[i].result2;
            w++;
        }

        int mas2[] = new int[mas1.length];
        i0 = 0;
        for (int i = 1; i < mas2.length + 1; i++) {
            if (i % 2 == 0) {
                mas2[i0] = mas1[i0 - 1];
            }
            if (i % 2 == 1) {
                mas2[i0] = mas1[i0 + 1];
            }
            i0++;
        }



       /* System.out.println("XXXXXXXXX ");
        for(int i = 0; i<mas1.length; i++){
            System.out.print(mas1[i] + " ");
        }
        System.out.println();

         int mas2[] = new int[mas1.length];
        i0 = 0;
        for (int i = 1; i < mas2.length + 1; i++) {
            if (i % 2 == 0) {
                mas2[i0] = mas1[i0 - 1];
            }
            if (i % 2 == 1) {
                mas2[i0] = mas1[i0 + 1];
            }
            i0++;
        }

        System.out.println("XXXXXXXXX TWO ");
        for(int i = 0; i<mas2.length; i++){
            System.out.print(mas2[i] + " ");
        }
        System.out.println();


        int x = 1;
        int a1 = 12;
        int a2 = a1;
        int b1 = 0;
        int b2 = 0;
        i0 = 0;
        int i1 = 0;
        int u = 0;
        for (int i = 1; i <= (mas1.length*2); i++){
            if(i == 1 || i == 13 || i == 25 || i == 37 || i == 49 || i == 61 || i == 73){
                System.out.print(teamArr[u].name + " ");
                u++;
            }

            if(i == 1 || i == 15 || i == 29 || i == 43 || i == 57 || i == 71 ){
                System.out.print(" " + x + " ");
                x = x+1;
            }

            if(a2>0){
                a2--;
                System.out.print(mas1[i0]);
                if (a2 == 0) {
                    b1 = b1+2;
                    b2 = b1;
                }
                i0++;
            }
            else if(b2>0){
                b2--;
                System.out.print(mas2[i1]);
                if (b2 == 0) {
                    a1 = a1-2;
                    a2 = a1;
                }

                i1++;
            }
            if (i % 12 == 0) {
                if(i == 84){
                    System.out.println(" 7 ");
                }
                System.out.println();
            }

        }
        */


        int r = 0;
        i0 = 0;
        int dvumMassiv[][] = new int[7][12];
        for(int i = 0; i<6; i++){
            for(int j = r; j<dvumMassiv[0].length; j++){
                dvumMassiv[i][j] = mas1[i0];
                i0++;
            }
            r+=2;
        }
        for(int i = 0; i<dvumMassiv.length; i++){
            for(int j = 0; j<dvumMassiv[0].length; j++){
                System.out.print(dvumMassiv[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("prov = " + dvumMassiv[0].length);
        r = 1;
        i0 = 0;
        for(int i = 0; i<dvumMassiv[0].length; i+=2){
            for(int j = r; j<dvumMassiv.length; j++){
                dvumMassiv[j][i] = mas2[i0];
                i0++;
                dvumMassiv[j][i+1] = mas2[i0];
                i0++;
            }
            r+=1;
        }

        for(int i = 0; i<dvumMassiv.length; i++){
            for(int j = 0; j<dvumMassiv[0].length; j++){
                System.out.print(dvumMassiv[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();


        for(int i = 0; i<dvumMassiv.length; i++){
            System.out.print(teamArr[i].name + " ");
            for(int j = 0; j<dvumMassiv[0].length; j++){
                System.out.print(dvumMassiv[i][j] + "\t");
            }
            System.out.println();
        }

        //??? kak vyravnivat'?









    }
}
