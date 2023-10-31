interface FunctionalProcess
{
public void process(int e,int f);
}
class bbb
{
public void doSomething(FunctionalProcess fp)
{
int x=10;
int y=20;
fp.process(10,20);
}
};
class main
{
public static void main(String gg[ ])
{
bbb b=new bbb( );
b.doSomething((p,q)->{System.out.println(p+q);});
}
};