//Array
import java.util.Scanner;
class basic{
void display(String s[],int a){
    for(int j=0;j<a;j++){
System.out.println(s[j]);
    }
 
 }    public static void main(String[] args) {
    Scanner myobj = new Scanner(System.in);
    //int v = myobj.nextInt();
    String[] str= new String [3];

    for(int i=0;i<3;i++){
            str[i] = myobj.nextLine();    
                        }
            
            basic obj = new basic();
            obj.display(str,3);
    System.out.println("result");
    }
    
}