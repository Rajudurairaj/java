//while loop print digits

public class basic{
     int more(long a){
        long x,y,s=0;
        while(a>0){
            y=a%10;
            s+=y;
            s*=10;
            a/=10;
        }
        s/=10;
        while(s>0){
            x=s%10;
            System.out.println(x);
            s/=10;
        }
        return 0;
    }
    public static void main(String[] args){
       long n=123456789;
       basic obj = new basic();
       obj.more(n);
    }
}