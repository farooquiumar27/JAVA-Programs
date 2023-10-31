class main
{
public static void main(String gg[ ])
{
String g="HELLO";
String m=new String("Hello");
if(g.equals(m)) //deep comparision case sensitive
{
System.out.println("Same");
}
else
{
System.out.println("Not same");
}
if(g.equalsIgnoreCase(m))  //deep comparision incase sensitive
{
System.out.println("Same");
}
else
{
System.out.println("Not same");
}
}
};