//For loop print  even numbers

public class basic{
    static int more(int a){
        for(int i=2;i<=a;i+=2){

            System.out.println(i);
        }
        return 0;
    }
    public static void main(String[] args){
       int n=100;
       basic obj = new basic();
       obj.more(n);
    }
}