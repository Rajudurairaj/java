// multiple class and object creation
import java.util.Scanner;
public class basic{
     int more(int a,int b){
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
        test obb = new test();
        test obb1 = new test();
        obb.display();
        obb1.display();
        testengg t1 =new testengg();
        testengg t2 =new testengg();
        t1.dis();
        t2.dis();
    }
} 
 class test{
    void display(){
        System.out.println("HELLO");
    }
 }
 class testengg{
void dis(){
    System.out.println("WORLD");
}

 }




