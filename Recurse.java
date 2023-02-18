
import java.util.Scanner;
class Recurse{
void rec(int result,int n){
if (n==0){
System.out.println("factorial of the number is : "+result);
return ;}
result=result*n;
rec(result,n-1);
}
}
class Fct{
public static void main(String arg[]){
Scanner input=new Scanner(System.in);
System.out.println("Enter the number for finding its factorial");
int num=input.nextInt();
Recurse fact=new Recurse();
fact.rec(1,num);
}
}