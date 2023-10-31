#include<stdio.h>
int main( )
{
printf("Cool\n");
return 0;
printf("Great\n"); //--(1)--
return 0; //--(2)--
return 0;
}

//--(1)-- and --(2)-- This two statements are unreachable but this code will compile. 