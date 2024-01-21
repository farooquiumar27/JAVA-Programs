class mdn
{
private int num;
boolean b;
synchronized public void setNum(int num)
{
if(b == true)
{
try
{
wait();
}catch(InterruptedException ie)
{
System.out.println(ie);
}
}
this.num=num;
this.b=true;
System.out.println("Produced : "+this.num);
notify( );
}
synchronized public int getNum( )
{
if(b == false)
{
try
{
wait();
}catch(InterruptedException ie)
{
System.out.println(ie);
}
}
this.num=num;
this.b=false;
System.out.println("Consumed : "+this.num);
notify( );
return this.num;
}
};

class Producer extends Thread
{
private mdn medium;
Producer(mdn medium)
{
this.medium=medium;
start( );
}
public void run( )
{
for(int i=201;i<=250;i++)
{
this.medium.setNum(i);
}
}
};

class Consumer extends Thread
{
private mdn medium;
Consumer(mdn medium)
{
this.medium=medium;
start( );
}
public void run( )
{
for(int i=201;i<=250;i++)
{
this.medium.getNum( );
}
}
};

class Main
{
public static void main(String gg[ ])
{
mdn medium=new mdn( );
Producer p=new Producer(medium);
Consumer c=new Consumer(medium);
}
};