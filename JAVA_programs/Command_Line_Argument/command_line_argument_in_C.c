#include<stdio.h>

int main(int count,char *str [ ])
{
printf("Number of command line argument: %d\n",count);
for(int i=0;i<count;i++)printf("%s\n",str[i]);
return 0;
}

//In C the name of the executable file is placed in the 0 index of *str[ ] and further aruguments are 
//placed from 1 index 