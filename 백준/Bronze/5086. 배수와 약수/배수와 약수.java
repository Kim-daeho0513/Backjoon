import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        do{
            a = sc.nextInt();
            b = sc.nextInt();
            String s="";
            if(a!=0&&b!=0){
                if(b%a==0){
                    s = "factor";
                } else if(a%b==0){
                    s = "multiple";
                } else {
                    s = "neither";
                }
                System.out.println(s);
            }
        } while(a!=0&&b!=0);
    }
}