import java.util.*;
import java.lang.Math;
class arms
{
public static void main(String[] args)
{
int x,sum=0,b=0,c=0,a;
Scanner s=new Scanner(System.in);
x=s.nextInt();
int y=x;
while(x!=0)
{
c++;
x=x/10;
}
while(y!=0)
{
b=y%10;
sum+=Math.pow(b,c);
y=y/10;
}
System.out.print(sum);
}
}
