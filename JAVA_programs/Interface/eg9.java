/*
Now this code will compile because when we are implementing 
and extending at the same time then we have to take care that the 
first we extends then only we can implement
*/

interface aaaa
{
public void sam( );
}
class bbb
{

};
class ccc extends bbb implements aaaa
{
public void sam( )
{
System.out.println("Great");
}
};