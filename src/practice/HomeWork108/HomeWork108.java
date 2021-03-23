package practice.HomeWork108;

public class HomeWork108 {
    public static void main(String args[]){
        System.out.println("ex 4.115");
        int start = 1984;
        int year = 1993;
        int remainder = year - start;
        int remainderYear = remainder%12;
        int remainderColor = remainder%10;
        switch (remainderYear){
            case 0:
            if (remainderYear == 0) {
                System.out.print("rat ");
            }
                break;
            case 1:
                if (remainderYear == 1) {
                    System.out.print("bull ");
                }
                break;
            case 2:
                if (remainderYear == 2) {
                    System.out.print("tiger");
                }
                break;
            case 3:
                if (remainderYear == 3) {
                    System.out.print("Hare");
                }
                break;
            case 4:
                if (remainderYear == 4) {
                    System.out.print("dragon");
                }
                break;
            case 5:
                if (remainderYear == 5) {
                    System.out.print("snake");
                }
                break;
            case 6:
                if (remainderYear == 6) {
                    System.out.print("horse");
                }
                break;
            case 7:
                if (remainderYear == 7) {
                    System.out.print("goat");
                }
                break;
            case 8:
                if (remainderYear == 8) {
                    System.out.print("monkey");
                }
                break;
            case 9:
                if (remainderYear == 9) {
                    System.out.print("cock");
                }
                break;
            case 10:
                if (remainderYear == 10) {
                    System.out.print("dog");
                }
                break;
            case 11:
                if (remainderYear == 11) {
                    System.out.print("pig");
                }
        }
        switch(remainderColor){
            case 0:
                System.out.println(" green");
                break;
            case 1:
                System.out.println(" green");
                break;
            case 2:
                System.out.println(" red");
                break;
            case 3:
                System.out.println(" red");
                break;
            case 4:
                System.out.println(" yellow");
                break;
            case 5:
                System.out.println(" yellow");
                break;
            case 6:
                System.out.println(" white");
                break;
            case 7:
                System.out.println(" white");
                break;
            case 8:
                System.out.println(" black");
                break;
            case 9:
                System.out.println(" black");
        }
        remainderColor /= 2;
        System.out.println(remainderColor);
        if (remainderColor == 0) {
            System.out.println(" green");
        }
        else if (remainderColor ==1) {
            System.out.println("red");
        } else if (remainderColor == 2) {
            System.out.println("yellow");
        } else if (remainderColor == 3) {
            System.out.println("white");
        } else if (remainderColor == 4) {
            System.out.println("black");
        }

        /*
        if (remainderColor >= 0 && remainderColor < 2) {
            System.out.println(" green");
        }
        else if (remainderColor > 1 && remainderColor < 4) {
            System.out.println("red");
        } else if (remainderColor > 3 && remainderColor < 6) {
            System.out.println("yellow");
        } else if (remainderColor > 5 && remainderColor < 8) {
            System.out.println("white");
        } else if (remainderColor > 7 && remainderColor < 10) {
            System.out.println("black");
        }
        */


        System.out.println("ex 4.116(b");
        start = 1984;
        year = 1968;
        remainder = 0;
        if (start <= year) {
            remainder = year - start;


            remainderYear = remainder % 12;
            remainderColor = remainder % 10;
            switch (remainderYear) {
                case 0:
                    if (remainderYear == 0) {
                        System.out.print("rat ");
                    }
                    break;
                case 1:
                    if (remainderYear == 1) {
                        System.out.print("bull ");
                    }
                    break;
                case 2:
                    if (remainderYear == 2) {
                        System.out.print("tiger");
                    }
                    break;
                case 3:
                    if (remainderYear == 3) {
                        System.out.print("Hare");
                    }
                    break;
                case 4:
                    if (remainderYear == 4) {
                        System.out.print("dragon");
                    }
                    break;
                case 5:
                    if (remainderYear == 5) {
                        System.out.print("snake");
                    }
                    break;
                case 6:
                    if (remainderYear == 6) {
                        System.out.print("horse");
                    }
                    break;
                case 7:
                    if (remainderYear == 7) {
                        System.out.print("goat");
                    }
                    break;
                case 8:
                    if (remainderYear == 8) {
                        System.out.print("monkey");
                    }
                    break;
                case 9:
                    if (remainderYear == 9) {
                        System.out.print("cock");
                    }
                    break;
                case 10:
                    if (remainderYear == 10) {
                        System.out.print("dog");
                    }
                    break;
                case 11:
                    if (remainderYear == 11) {
                        System.out.print("pig");
                    }
            }
            switch (remainderColor) {
                case 0:
                    System.out.println(" green");
                    break;
                case 1:
                    System.out.println(" green");
                    break;
                case 2:
                    System.out.println(" red");
                    break;
                case 3:
                    System.out.println(" red");
                    break;
                case 4:
                    System.out.println(" yellow");
                    break;
                case 5:
                    System.out.println(" yellow");
                    break;
                case 6:
                    System.out.println(" white");
                    break;
                case 7:
                    System.out.println(" white");
                    break;
                case 8:
                    System.out.println(" black");
                    break;
                case 9:
                    System.out.println(" black");
            }
        }

        if(start>year){
            remainder = start-year;
            remainderYear = remainder%12;
            remainderColor = remainder%10;
            switch (remainderYear) {
                case 0:
                    if (remainderYear == 0) {
                        System.out.print("pig ");
                    }
                    break;
                case 1:
                    if (remainderYear == 1) {
                        System.out.print("dog ");
                    }
                    break;
                case 2:
                    if (remainderYear == 2) {
                        System.out.print("cock ");
                    }
                    break;
                case 3:
                    if (remainderYear == 3) {
                        System.out.print("monkey ");
                    }
                    break;
                case 4:
                    if (remainderYear == 4) {
                        System.out.print("goat ");
                    }
                    break;
                case 5:
                    if (remainderYear == 5) {
                        System.out.print("horse ");
                    }
                    break;
                case 6:
                    if (remainderYear == 6) {
                        System.out.print("snake ");
                    }
                    break;
                case 7:
                    if (remainderYear == 7) {
                        System.out.print("dragon ");
                    }
                    break;
                case 8:
                    if (remainderYear == 8) {
                        System.out.print("hare ");
                    }
                    break;
                case 9:
                    if (remainderYear == 9) {
                        System.out.print("tiger ");
                    }
                    break;
                case 10:
                    if (remainderYear == 10) {
                        System.out.print("bull ");
                    }
                    break;
                case 11:
                    if (remainderYear == 11) {
                        System.out.print("rat ");
                    }
            }
            switch (remainderColor) {
                case 0:
                    System.out.println(" black");
                    break;
                case 1:
                    System.out.println(" black");
                    break;
                case 2:
                    System.out.println(" white");
                    break;
                case 3:
                    System.out.println(" white");
                    break;
                case 4:
                    System.out.println(" yellow");
                    break;
                case 5:
                    System.out.println(" yellow");
                    break;
                case 6:
                    System.out.println(" red");
                    break;
                case 7:
                    System.out.println(" red");
                    break;
                case 8:
                    System.out.println(" green");
                    break;
                case 9:
                    System.out.println(" green");
        }
        }



        System.out.println("ex 8.39(b");
        System.out.println("ex 10.14");
        System.out.println("ex 11.94");
        System.out.println("ex 12.20");
        System.out.println("ex 13.15");
    }
}
