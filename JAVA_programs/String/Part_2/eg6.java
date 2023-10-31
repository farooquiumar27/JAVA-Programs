class main
{
public static void main(String gg[ ])
{
String g="Hello";
String m=new String("Hello");
if(g==m) //not deep comparision
{
System.out.println("Same");
}
else
{
System.out.println("Not same");
}
if(g.equals(m)) //deep comparision
{
System.out.println("Same");
}
else
{
System.out.println("Not same");
}
}
};