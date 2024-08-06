//java "basic.java"find greatest number in three values
public class basic{
    public static void main(String[] args){
        int a = 20,b = 70,c = 10;
        if(a>b&&a>c){
            System.out.println(a+" is greater number");
        }
        else if(b>c&&b>a){
            System.out.println(b+" is greater number");
        }
        else{
            System.out.println(c+" is greater number");
        }    



    }
}