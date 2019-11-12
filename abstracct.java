class abstracct
{
public static void main(String[] args)
{
figure f=new rectangle(4,5);
System.out.print(f.area());
}
}
abstract class figure
{
int l,b;
figure(int l,int b)
{
this.l=l;
this.b=b;
}
abstract int area();
}
class rectangle extends figure
{
rectangle(int a,int b)
{
super(a,b);
}
int area()
{
return(l*b);
}
}
