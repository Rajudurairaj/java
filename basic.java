//For loop print sum of digits with run time input
import java.util.Scanner;
public class basic{
     long more(long a,Long b){
        long x,y,s=0;
        for(Long c=a;c<=b;c++){
            s+=c;
        }
        return s;
    }
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter numbers");
        long p = myobj.nextLong();
       long n= myobj.nextLong();
       basic obj = new basic();
       System.out.println(obj.more(p,n));
    }
}



