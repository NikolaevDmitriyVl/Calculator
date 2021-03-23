package practice.Shildt_140;

class ChkNum {
    //vernut logicheskoe znachenie true
    //esli x soderzit chetnoe chislo
    boolean isEven(int x){
        if((x%2) == 0) return true;
        else return false;
    }
}
class ParmDemo{
    public static void main(String args[]){
        ChkNum e = new ChkNum();
        if(e.isEven(10)) System.out.println("10 - chetnoe chislo");
        if(e.isEven(9)) System.out.println("9 - nechetnoe chislo");
        if(e.isEven(8))System.out.println("8 - chetnoe chislo");
    }
}
