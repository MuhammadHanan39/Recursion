import java.util.Scanner;
public class NewFactorial{
public static void fact(int n,int result){
if(n==1||n==0){
System.out.print("Factorial of the number is : ");
System.out.println(result);
return;}
result=result*n;
fact(n-1,result);
}

public static void main(String arg[]){
int result=1;
Scanner input=new Scanner(System.in);
System.out.println("Enter the number to find factorial");
int n=input.nextInt();
fact(n,result);
}
}