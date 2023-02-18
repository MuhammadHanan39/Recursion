public class Recurse1{
public static void print(int num){
if(num==0)
return;
System.out.println(num);
print(num-1);
}
public static void main(String arg[]){
System.out.println("Recursive number from 1 to 5 = ");
print(5);
}
}