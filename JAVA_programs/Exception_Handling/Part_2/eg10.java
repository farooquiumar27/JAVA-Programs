class main
{
static public void main(String gg[ ])
{
int x,y,z;
int m[ ];
m=new int[10];
x=100;
y=5;
z=0;
try
{
z=x/y;
m[z]=4030;
try
{

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