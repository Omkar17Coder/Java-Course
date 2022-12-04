import java.util.*;
// Strings Practice Very Important 
public class arrays{
    public static void main(String args[]){
  
    Scanner a=new Scanner(System.in);
    String sentence=a.nextLine();
    char first=sentence.charAt(0);
    char second='d';
    // Here always remeber always never leave 
    // char type varible unassigned, While declaring.
    // Give it some random to avoid future errors
    
    int count=0;
    int i=0;
    int n=sentence.length();
    int index=-1;
    char c;
    while(i<=n){
        c=sentence.charAt(i);
     if(c==' ' && count==0){
        second=sentence.charAt(i+1);
        count=1;
     }
     else if(c==' ' && count==1){
       index=i+1;
       break;

     }
     i++;

    }
    System.out.println(first+"."+second+"."+sentence.substring(index));

    
    }
    
}
