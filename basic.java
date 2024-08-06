//For loop

public class basic{
    void more(int a){
        for(int i=0;i<=a;i++){
            System.out.println("HELLO WORLD");
        }
    }
    public static void main(String[] args){
       int n=6;
       basic obj = new basic();
       obj.more(n);
    }
}