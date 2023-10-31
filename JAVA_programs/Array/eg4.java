class main
{
public static void main(String gg[ ])
{
int x[ ];
x=new int[5];
x[0]=30;
x[1]=32;
x[2]=41;
x[3]=10;
x[4]=15;
for(int i=0;i<5;i++)
{
System.out.println(x[i]);
}
System.out.println("Now resizeing array to 10 elements");
int [ ]t;
t=new int[10];
for(int i=0;i<x.length;i++)t[i]=x[i];
x=t;
System.out.println("After resizeing array to 10 elements");
x[7]=36;
for(int i=0;i<x.length;i++)System.out.println(x[i]);
}
};
