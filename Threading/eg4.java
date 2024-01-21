class mdn
{
private int num;
public void setNum(int num)
{
this.num=num;
System.out.println("Produced : "+this.num);
}
public int getNum( )
{
System.out.println("Consumed : "+this.num);
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