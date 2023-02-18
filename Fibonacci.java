import java.util.Scanner;
public class Fibonacci{
Fibonacci(){
System.out.print("Fibonacci series is\n0 1");
}
public void printFib(int pre,int new1,int n){
if(n==0)
return;
int result=pre+new1;
System.out.print(" "+result);
pre=new1;
new1=result;
printFib(pre,new1,n-1);
}
public static void main(String arg[]){
int pre=0;
int new1=1;
Scanner input=new Scanner(System.in);
System.out.println("Enter the quantity of fibonacci series");
int n=input.nextInt();
Fibonacci obj=new Fibonacci();
obj.printFib(pre,new1,n-2);
}
}