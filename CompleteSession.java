import java.util.Arrays; 
import java.util.Scanner;
public class Main{                                 
s
public static void main(String [] args){
/* 
     // Strings are noy mutable 
        String name1="Omkark";
        String name2="k";
        String name3=name1+name2;
        System.out.println(name3); // String Concetenate
        // Value at particular index;

        // String.charAt(index);

        System.out.println(name3.charAt(3));
    
       String name4=name1.replace('k','a');
       System.out.println(name4);

       System.out.println(name1.substring(0,6));


// Arrays 

int [] marks=new int[3]; // [] tell compiler its array or collection of memory address that
                       // can be accesed

marks[0]=100;
marks[1]=99;
marks[2]=98;
System.out.println(marks[0]);

Arrays.sort(marks); // imported java.util.Arrays Arrays.sort(marks)
System.out.println(marks[0]);

// Type Casting .

double a=18.5+15; // Double has 8 byte so can store int (4 bytes). Alows implicit convertion
System.out.println(a);
int f=5+(int )15.999; // Gives Error since double has greater byte than int , so storage is not posiible .
System.out.println(f);

// Operators and their use

int a=10;
int b=4;
int sum=a+b;
int difference=a-b;
int product=a*b;
int division=a/b;
System.out.println(sum); // println use to print on new line , using only print keeps on same line
System.out.println(difference);
System.out.println(product);
System.out.println(division);
 
 // Increment Options

int z=10;

System.out.println(z++); // First z is printed then value is incremented Output-10
System.out.println(z);// Output-11
System.out.println(++z);// First value is incremented then printed Output-12
System.out.println(z);// output=12

// ++nums Preincremnt operator 
// nums++ Postincrement operator



// Math Function
 // random function from Math library genrates random number between 0 and 1
 // Multiply with 100 to get a 2 digit random number 
 // Also use typecating to convert it to intger form
System.out.println((int)(Math.random()*1000));



        // INPUT IN JAVA VERY IMPORTANT>
Scanner input=new Scanner(System.in);

//System.out.println("Enter your Age:");
String name1=input.nextLine(); 
int age=input.nextInt(); // used to take input of Int 
String name=input.next(); // Direct input.next() for input of String
float code=input.nextFloat(); // Used to take input of float 
System.out.println(age);
System.out.println(name);
System.out.println(code);
System.out.println(name1);
 char d=input.next().charAt(0); // used to input the character very important 


// .next() only inputs tokens or only single words. To make it input multiple words or a sentence
// Use .nextline() to take input of string.


// Conditional Checking


boolean IsLeave=true;
if(IsLeave){
    System.out.println("Iam In Office");
}
else{
    System.out.println("Iam At Home");

}


Scanner input=new Scanner(System.in);
int Amount_inHand;
Amount_inHand=input.nextInt();
if(Amount_inHand<50){
    System.out.println("You Cannot But Anything");
    System.out.println("Bring more amount");
}
else if(Amount_inHand<10000 && Amount_inHand>50){
    System.out.println("You have Required Amount ");

}
else{
    System.out.println("You Have Excess Amount");

}
*/ 

// Looping Concepts 
/*Scanner input=new Scanner(System.in);
int Sum=0;
int a;
for(int i=1;i<=5;i++){
a=input.nextInt();
Sum=Sum+a;
    
}
 System.out.println(Sum);
 

 // Sum of N numbers using for Loop .

 int Sum=0;
 int N;
 Scanner input=new Scanner(System.in);// Necessary to take Input of the data
 N=input.nextInt();
 for(int i=1;i<=N;i++){
     Sum+=i;
 }
 System.out.println(Sum);


*/