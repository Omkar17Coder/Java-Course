import java.util.*;

public class arrays{
    public static void main(String args[]){
       Scanner a=new Scanner(System.in);
       int m,n;
       n=a.nextInt();
       m=a.nextint();
       int [][] value=new int[n][m];
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            values[i][j]=a.nextInt();

        }
        int rowsum=0;
        int columnsum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                rowsum+=values[i][j];
                columnsum+=values[j][i];
            }
            System.out.println(rowsum);
            System.out.pritnln(columnsum);
            rowsum=0;
            columnsum=0;
            
        }
       } 
    }
}



// insert element in given location:
       Scanner a=new Scanner(System.in);
       int length=a.nextInt();
       int [] array=new int[length+1];
       // Take input:
       for(int i=0;i<length;i++){
        array[i]=a.nextInt();

       }
       // print before insert:
       for(int i=0;i<length;i++){
        System.out.println(array[i]+" ");
       }
       int location=a.nextInt();
       int key=a.nextInt();
       for(int i=length;i>location;i--){
        array[i]=array[i-1];
       }
       array[location]=key;
       for(int i=0;i<length+1;i++){
        System.out.println(array[i]+" ");
       }

    }


    // Concatenation->
      String first="omkar";
      String second="k";
      String full=first+" "+second;
      System.out.println(full);



      // String functions:
      // Concatenation->
      String first="omkar";
      String second="k";
      String full=first+"@"+second;
      //System.out.println(full);
      //System.out.println(full.length()); // String length str.length();

      // Find character at specified at particular index;
     // Use String_name.charAt();

     int n=full.length();
     for(int i=0;i<n;i++){
        System.out.print(full.charAt(i)+" ");
     }




































