interface aaaa
{
public int x=10;
private int y=20;
}
class bbb implements aaaa
{

}

/* 
This code will not compile because interface 
cannot have private properties.
*/