// find value length and separate the digits add+length after print the output
import java.util.Scanner;
class basic{
void display(int a){

System.out.println(a);
    }
 
    public static void main(String[] args) {
    Scanner myobj = new Scanner(System.in);
    int v = myobj.nextInt(),x=0,i=0;
    String vstr = Integer.toString(v);
    int l = vstr.length();
    while(v != 0){
            x+=v%10;
            v/=10;
            i++;
               }
               x+=(i*i);
            
            basic obj = new basic();
            obj.display(x);
    System.out.println("result"+l);
    }
}