//function Math.pow() and type casting double to int
import java.util.Scanner;
public class basic{
     int more(int a,int b){
        /*Using TypeCasting
        Using Double.intValue() method
        Using Math.round() method 
        double data = 3452.345
        int value = (int)data;*/
        int s;
        s=(int)Math.pow(a,b);

        return s;
    }
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter numbers");
        int p = myobj.nextInt();
        int n= myobj.nextInt();
        basic obj = new basic();
        System.out.println(obj.more(p,n));
    }
} 





