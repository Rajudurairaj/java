//For loop find odd or even numbers, divide and multiply

public class basic{
    static int more(int a){
        int y=0;
        for(int i=50;i<=a;i++){
            if(i%2 == 0){
                y=i*10;
            System.out.println(y+" is even number");}
            else{
                y=i/10;
                System.out.println(y+" is odd number");
            }
        }
        return 0;
    }
    public static void main(String[] args){
       int n=60;
       basic obj = new basic();
       obj.more(n);
    }
}