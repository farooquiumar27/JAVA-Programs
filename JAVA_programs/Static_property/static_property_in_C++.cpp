//One copy of static property is shared by all the objects.

#include<iostream>
using namespace std;

class aaa
{
public:
static int age;
int year;
};
int aaa::age;
int main( )
{
aaa a1;
a1.age=100;
a1.year=2000;
aaa a2;
a2.age=50;
a2.year=2010;
cout<<"Age of a1 = "<<a1.age<<endl;
cout<<"Year of a1 = "<<a1.year<<endl;
cout<<"Age of a2 = "<<a2.age<<endl;
cout<<"Year of a2 = "<<a2.year<<endl;
return 0;
}