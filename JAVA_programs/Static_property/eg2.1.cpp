//In this we want to call the method of base class from the instance of the derived class.
//This what we always did in C++
#include<iostream>
using namespace std;
class aaa
{
public :
void sam( )
{
cout<<"Cool"<<endl;
}
void tom( )
{
cout<<"Great"<<endl;
}
};
class bbb : public aaa
{
public :
void joy( )
{
cout<<"Whatever"<<endl;
}
void tom( )
{
aaa::tom( );
cout<<"Nice"<<endl;
}
};

int main( )
{
bbb b;
b.tom( );
return 0;
}
