/*
If lambdas expression contains single line defination and that is also return statment then in that
we do not need to provide curly braces and return word.
*/
interface abcd
{
public int sam(int e);
};
class main
{
public static void main(String gg[ ])
{
abcd a;
a=(p)->p*p;
System.out.println(a.sam(10));
//100 lines of code
a=(p)->p+p;
System.out.println(a.sam(30));
}
};