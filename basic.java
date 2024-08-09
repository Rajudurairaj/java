//Array sum integer int scanner input for array length and find even or odd if even multiply10 else odd divide10
import java.util.Scanner;
class basic{
int display(int s[],int a){
    int u;
    for(int j=0;j<a;j++){
    if(s[j]%2==0){
    u=s[j]*10;
    System.out.println("result is "+u);
    }
    else{
        u=s[j]/10;
        System.out.println("result is "+u);
    }
    }
    return 0;
 
 }    public static void main(String[] args) {
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
