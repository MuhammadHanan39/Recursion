import java.util.Scanner;
public class Power1{
public int power(int x,int n){
if(n==1)
return x;
if(x==0)
return 0; 
int ret=power(x,n-1);
ret=ret*x;
return ret;
}
public static void main(String arg[]){
Power1 obj=new Power1();
Scanner input=new Scanner(System.in);
System.out.println("equation is x^n, so Enter the value of x then n");
int x=input.nextInt();
int n=input.nextInt();
int result=obj.power(x,n);
System.out.println("The answer is : "+result);
}
}