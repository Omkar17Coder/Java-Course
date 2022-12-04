import java.util.*;

public class test{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String a="an";
        String b="johan";
        boolean flag=true;
        int n=b.length();
        for(int i=0;i<n-1;i++){
            String x=b.substring(i,i+2);
            System.out.println(x);
            if(x.compareTo(a)==0){
                
                System.out.println("YES");
                flag=false;
            }
        }
        if(flag){
            System.out.println("NO");
        }
    }
}