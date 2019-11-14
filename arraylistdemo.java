import java.util.*;
class arraylistdemo
{
public static void main(String args[])
{
ArrayList<String> list=new ArrayList<String>();
list.add("a");
Iterator itr=list.iterator();
while(itr.hasNext())
{
System.out.print(itr.next());
}}
}