//while loop print digits with run time input
import java.util.Scanner;
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
        Scanner myobj = new Scanner(System.in);
        long p = myobj.nextLong();
       long n=123456789;
       basic obj = new basic();
       System.out.println(obj.more(p));
    }
}