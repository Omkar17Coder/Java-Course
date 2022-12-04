import java.util.Scanner;

public class bookprice{
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        double  coverprice=24.95;
        double discount=0.4*coverprice;
        coverprice=coverprice-discount;
        int copies=a.nextInt();
        double amount=coverprice+3+(0.75)*(copies-1);
        
        System.out.println("Total Amount:"+amount);
        
        
    }
}


 
import java.util.Scanner;

public class newton{
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        double force=a.nextDouble();
        double mass=a.nextDouble();
        double acc=force/mass;
        System.out.println("acceleatrion:"+acc);
        
    }
}




import java.util.Scanner;

public class temperature{
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        int  fer=a.nextInt();
        int   cel;
        cel=((fer-32)*5)/9;
        //System.out.format("%.2f",cel); 
        
        System.out.println(cel);
        
        
    }
}



import java.util.Scanner;

public  class Compilation{
    public static void Concatenation(int a,int b,int c){
        int ans=(a*100)+(b*10)+c;
        System.out.println(ans);
    }
    public static void SquareRoot(int a,int b,int c){
        double ans=Math.sqrt(a+b+c);
        System.out.format("%.2f",ans);
    }
    public static void SumQuotient(int a,int b,int c){
        int ans=(a/2)+(b/2)+(c/2);
        System.out.println(ans);
    }
    public static void AverageRemain(int a,int b,int c){
        int ans=((a%5)+(b%5)+(c%5))/2;
        System.out.println(ans);
    }
    public static void MulTRigo(int a,int b,int c){
        double ans=Math.sin(b)*Math.cos(c);
       System.out.format("%.2f",ans);
    }
    public static void main(String args[]){
        
       Scanner input=new Scanner(System.in);
       int a=input.nextInt();
       int b=input.nextInt();
       int c=input.nextInt();
       Concatenation(a,b,c);
       SquareRoot(a,b,c);
       SumQuotient(a,b,c);
       AverageRemain(a,b,c);
       MulTRigo(a,b,c);
       
       
    }
}
