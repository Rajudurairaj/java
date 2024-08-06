//For loop find odd or even numbers

public class basic{
    static int more(int a){
        for(int i=0;i<=a;i++){
            if(i%2 == 0){
            System.out.println(i+" is even number");}
            else{
                System.out.println(i+" is odd number");
            }
        }
        return 0;
    }
    public static void main(String[] args){
       int n=100;
       basic obj = new basic();
       obj.more(n);
    }
}