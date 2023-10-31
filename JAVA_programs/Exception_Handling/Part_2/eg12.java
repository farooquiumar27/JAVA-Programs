class main
{
static public void main(String gg[ ])
{
int x,y,z;
int m[ ];
m=new int[10];
x=10;
y=0;
z=0;
try
{
try
{
z=x/y;
}catch(ArrayIndexOutOfBoundsException aio)
{
System.out.println("Invalid index");
}
System.out.println("GAME");
}catch(ArithmeticException ae)
{
System.out.println("Cannot divide by zero");
}
}
};