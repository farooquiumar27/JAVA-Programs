class main
{
public static void main(String gg[ ])
{
int x=100;
int y=2;
int z=0;
int arr[ ];
arr=new int[5];
try
{
z=x/y;
System.out.println("Result : "+z);
arr[z]=4030;
System.out.println(arr[z]);
}catch(ArithmeticException a)
{
System.out.println("Cannot divide by zero");
}
catch(ArrayIndexOutOfBoundsException a)
{
System.out.println("Invalid index : "+z);
}
}
};