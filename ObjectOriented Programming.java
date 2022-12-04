import java.util.*;
/*
Question-1
class Student{
     String name;
     int grade;
 String email;

   
    void display(){
        System.out.print("Name: "+name+" ");
        System.out.print("Grade: "+grade+" ");
        System.out.print("Email: "+email+"");
        System.out.println("");
    }
}
public class oops{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Student [] objects =new Student[n];
        String a,c;
        int b;
        for(int i=0;i<n;i++){
            objects[i]=new Student();
             a=in.next();
            b=in.nextInt();
            c=in.next();
            objects[i].name=a;
            objects[i].grade=b;
            objects[i].email=c;

        }
        for(int i=0;i<n;i++){
            objects[i].display();
        }


    }
}

Question-2

//---------------------------------------------------------------
class Juice{
    private int Code;
    private String flavour;
    private int quantity;
    private int price;

    Juice(){
        Code=0;
        flavour="";
        quantity=0;
        price=0;

    }
    public void input(int a, String b,int c,int d){
         Code=a;
        flavour=b;
        quantity=c;
        price=d;
    }
    void discount(){
        price=price-=10;
    }
    void display(){
        System.out.println("Code:"+Code);
        System.out.println("Flavour:"+flavour);
        System.out.println("Total Price:"+quantity*price);

    }
}

public class oops{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int a,c,d;
        String b;
        Juice object=new Juice();
        a=in.nextInt();
        b=in.next();
        c=in.nextInt();
        d=in.nextInt();
        object.input(a,b,c,d);
        object.discount();
        object.display();

        
        
            }
}
----------------
*/

class Admission{
    private String name;
    private int math;
    private int science;
    private int computer;
    private String result;

    Admission(String a,int b,int c,int d,String e){
        name=a;
        math=b;
        science=c;
        computer=d;
        result=e;
    }
    public String  check(){
        if(result=="Pass"){
            float avg=(math+science+computer)/3;
            if(maths>=90 && science>=90 && computer>=90){
                return "Eligibility: Bio-Science with Maths"; 
            }
            else if(avg>>=90){
                return "Eligibility: Bio-Science with Computer";
            }
            else if(avg>=80 && avg<90){
                return "Eligibility: Bio Science with Psycholoogy";
            }

        }
        else{
            return "Not Eligible";
        }
    }
    void display(){
        String ans=check();
        System.out.println(ans);
    }
}

public class oops{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        
       String a=in.next();
       String e=in.next();
       int b=in.nextInt();
       int c=in.nextInt();
       int d=in.nextInt();
       Admission object =new Admission(a,b,c,d,e);
       object.display();

    }
}




























