class mainn
{
public static void main(String[] args)
{
Construct c=new Construct("saloni",28);
c=new Construct("saloni",28,'F');
c=new Construct("saloni",28,'F',91);
}
}
class Construct
{
String n;
int i,m;
char g;
Construct(String name, int id)
{
n=name;
i=id;
System.out.println(name+" "+i);
}
Construct(String name,int id,char gender)
{
n=name;
i=id;
g=gender;
System.out.println(n+" "+i+" "+g);
}
Construct(String name,int id,char gender,int marks)
{
n=name;
i=id;
g=gender;
m=marks;
System.out.println(n+" "+i+" "+g+" "+m);
}
}
