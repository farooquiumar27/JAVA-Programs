/*
One interface can extends the other interface 
But the class which implements the extended 
interface has to define methods of both interfaces
*/

interface aaaa
{
public void sam( );
}
interface bbbb extends aaaa
{
public void tom( );
}
class ccc implements bbbb
{
public void sam( )
{

}
public void tom( )
{

}
};