//For loop print numbers

public class basic{
    static int more(int a){
        for(int i=0;i<=a;i++){
            System.out.println(i);
        }
        return 0;
    }
    public static void main(String[] args){
       int n=10;
       basic obj = new basic();
       obj.more(n);
    }
}