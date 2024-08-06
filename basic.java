//if even number ,divide by 2
//if odd number ,multiply by 10
public class basic{
    public static void main(String[] args){
       int a=60,b=23;
       if(a%2==0){
        a/=2;
        System.out.println(a);
       }
       else{
        a*=10;
        System.out.println(a);
       }
       if(b%2==0){
        b/=2;
        System.out.println(b);
       }
       else{
        b*=10;
        System.out.println(b);
       }

    }
}