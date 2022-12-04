import java.util.*;
class Employee
{
    Scanner s=new Scanner(System.in);
    int Eno;
    String Ename;
    String Designation;
    int salary;
    public void read(int a,int b,int c)
    {
        Eno=a;
        Ename=b;
        Designation=s.next();
        salary=c;
    }
    public void print(){
        System.out.println("Eno: "+Eno);
        System.out.println("Ename: "+Ename);
        System.out.println("Designation: "+Designation);
        System.out.println("Salary: "+salary);
    }
    
}
class Manager extends Employee{
    Scanner s=new Scanner(System.in);
    public int totalemp;
    public int totalsupervisors;
    Manager(int to){
        totalemp=to;
    }
    public void read1(){
        totalsupervisors=s.nextInt();
    }
    public void print1(){
        System.out.println("Total employees in the dept: "+totalemp);
        System.out.println("Total supervisors in the dept: "+totalsupervisors);
    }
}
class Main
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Employee E1=new Employee();
        E1.read();
        int to=s.nextInt();
        Manager M1=new Manager(to);
        M1.read1();
        M1.print();
        M1.print1();
    }
}