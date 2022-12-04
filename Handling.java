import java.util.*;
public class Handling{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int i=10;
        int j=0;
        int k=0;
        int [] nums={5,6,7,8};
        try{
            k=i/j; // Arithematic_Exception:
        }
        catch(  ArrayIndexOutOfBoundsException e){
            System.out.println("Do not divide by zero");
        }
        
        try{
            System.out.println(nums[5]);
        }
        
        catch( ArithmeticException e){
            System.out.println("Out of Bounds. Check the value of index");
        }
        catch(Exception e){
            System.out.println("Something is wrong");
        }
        System.out.println("Value:"+k);
        System.out.println("End of Compile-------");


    }
}