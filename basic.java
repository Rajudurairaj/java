// find value length and separate the digits add+length after print the output using keyword integer.tiString()
import java.util.Scanner;
class basic{
void display(int a){

System.out.println("Total"+a);
    }
 
    public static void main(String[] args) {
    Scanner myobj = new Scanner(System.in);
    int v = myobj.nextInt(),x=0;
    String vstr = Integer.toString(v);
    int l = vstr.length();

    for(char c : vstr.toCharArray()){
        System.out.println("Ecah digits"+c);
        int digits = Character.getNumericValue(c);
        x+=l+digits;
               }
            basic obj = new basic();
            obj.display(x);
    }
}