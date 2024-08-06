//Sum of digits
public class basic{
    public static void main(String[] args){
       int n=250,a,sum=0;
       while(n>0){
        a=n%10;
        sum+=a;
        n/=10;}
        System.out.println(sum);



    }
}