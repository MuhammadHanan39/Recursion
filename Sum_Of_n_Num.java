import java.util.Scanner;
public class Sum_Of_n_Num{
public int sum(int n){
if(n==0){
int sum=0;
return sum;
}
int sum=sum(n-1);
sum=sum+n;
return sum;
}
public static void main(String arg[]){
Scanner input=new Scanner(System.in);
Sum_Of_n_Num obj=new Sum_Of_n_Num();
System.out.println("Enter the n natural number to print its sum");
int n=input.nextInt();
int sum=obj.sum(n);
System.out.print("Sum of n natural numbers are : "+ sum);

}
}