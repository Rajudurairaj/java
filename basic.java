// Array sum integer
import java.util.Scanner;
class basic{
int display(int s[],int a){
    int u=0;
    for(int j=0;j<a;j++){
    u+=s[j];
    }
    return u;
 
 }    public static void main(String[] args) {
    Scanner myobj = new Scanner(System.in);
    //int v = myobj.nextInt();
    int[] str= new int [5];
    for(int i=0;i<5;i++){
            str[i] = myobj.nextInt();    }
            
            basic obj = new basic();
    System.out.println("result is "+obj.display(str,5));
    }
}