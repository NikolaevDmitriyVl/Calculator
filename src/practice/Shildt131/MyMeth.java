package practice.Shildt131;

public class MyMeth {
    void MyMeth(){
        int i;
        for(i = 0; i<10; i++){
            if(i == 5) return;
            System.out.println("proverka");
        }

    }
    public static void main(String args[]){
        MyMeth answer = new MyMeth();
        answer.MyMeth();
    }
}
