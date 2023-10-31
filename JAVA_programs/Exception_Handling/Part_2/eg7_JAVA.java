class main
{
public static void main(String gg[ ])
{
System.out.println("Cool");
return;
System.out.println("Great"); //--(1)--
}
};

//--(1)-- This is unreachable statement.
//And as we know that java  is a safe programming language so java doesn't allow for
//unreachable statement and so this code will not compile.