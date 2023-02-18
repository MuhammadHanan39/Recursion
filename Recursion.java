import java.util.*;
public class Recursion{
public static int fact(int n,int fact){
if(n==1){
return ;}
fact=fact*n;
fact(n-1,fact);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to find its factorial");
int n=sc.nextInt();
int fact;
fact(n,1);
}
}

