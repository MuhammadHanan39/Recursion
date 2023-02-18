public class Power2{
public void power(int x,int n,int res){
if(n==1){
System.out.println(res);
return;
}
res=res*x;
power(x,n-1,res);
}
public static void main(String arg[]){
Power2 obj=new Power2();
int x=3,n=4;
int res=x;
obj.power(x,n,res);
}
}