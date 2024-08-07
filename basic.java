//while loop print sum of digits

public class basic{
     long more(long a){
        long x,y,s=0;
        while(a>0){
            y=a%10;
            s+=y;
            a/=10;
        }
        return s;
    }
    public static void main(String[] args){
       long n=123456789;
       basic obj = new basic();
       System.out.println(obj.more(n));
    }
}