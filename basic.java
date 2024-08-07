//Find integer length
import java.util.Scanner;
public class basic{
     long more(Long b){
        long x,y,s=0;
        while(b>0){
            b/=10;
            s+=1;
        }
        return s;
    }
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter numbers");
        long p = myobj.nextLong();
       //long n= myobj.nextLong();
       basic obj = new basic();
       System.out.println(obj.more(p));
    }
}



