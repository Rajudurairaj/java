//function Math.pow() for squre
import java.util.Scanner;
public class basic{
     double more(Double a,Double b){
        long x,y;
        double s;
        s=Math.pow(a,b);
        return s;
    }
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter numbers");
        double p = myobj.nextLong();
        double n= myobj.nextLong();
        basic obj = new basic();
        System.out.println(obj.more(p,n));
    }
}



