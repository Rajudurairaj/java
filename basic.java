//Array find max and min number
import java.util.Scanner;
class basic{
int display(int s[],int a){
    int u,max,min;
    max=s[0];
    min=s[0];
    for(int j=0;j<a;j++){
    if(max<s[j]){
    max=s[j];
    }
    else if(min>s[j]){
        min=s[j];
    }
}
    System.out.println("Max number is"+max+"\n"+"Min number is"+min);

    return 0;
 
 } 
 public static void main(String[] args) {
    Scanner myobj = new Scanner(System.in);
    int v = myobj.nextInt();
    int[] str= new int [v];
    for(int i=0;i<v;i++){
            str[i] = myobj.nextInt();    }
            
            basic obj = new basic();
            obj.display(str,v);
    //System.out.println("result is "+obj.display(str,v));
    }
}