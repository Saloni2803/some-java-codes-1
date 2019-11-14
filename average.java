import java.util.*;
class average
{
public static void main(String[] args)
{
int n,num=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int arr[]=new int[n];
Scanner sc=new Scanner(System.in);
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
num+=arr[i];
}
System.out.print("average"+num/n);
}
}