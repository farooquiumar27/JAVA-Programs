class main
{
public static void main(String gg[ ])
{
try
{
int x[ ];
x=new int[5];
x[0]=30;
x[1]=32;
x[2]=41;
x[3]=10;
x[4]=15;
x[1000]=78;
for(int i=0;i<5;i++)
{
System.out.println(x[i]);
}
}catch(ArrayIndexOutOfBoundsException aioobe)
{
System.out.println(aioobe.getMessage( ));
}
}
};
