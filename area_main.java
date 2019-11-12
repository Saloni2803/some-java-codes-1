class area_main
{
public static void main(String[] args)
{
area obj=new square(5);
System.out.println(obj.s_area());
obj=new circle(3);
System.out.print(obj.c_area());
}
}

interface area
{
int s_area();
double c_area();
}

class square implements area
{
int s;
square(int s)
{
this.s=s;
}
public int s_area()
{
return(s*s);
}
public double c_area()
{
return 0;
}
}

class circle implements area
{
int r;
circle(int r)
{
this.r=r;
}
public int s_area()
{
return 0;
}
public double c_area()
{
return(3.14*r*r);
}
}


