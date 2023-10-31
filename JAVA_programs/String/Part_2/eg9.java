//Sorting case_sensitive.
class main
{
public static void main(String gg[ ])
{
String names[ ]=new String[10];
names[0]="Zaheer";
names[1]="Amit";
names[2]="Rajesh";
names[3]="Lalita";
names[4]="Bobby";
names[5]="Gopal";
names[6]="Tina";
names[7]="Geeta";
names[8]="Lokesh";
names[9]="Mahesh";
int e,f;
String g;
e=0;
int ep1=names.length-2;
int ep2=names.length-1;
while(e<=ep1)
{
f=e+1;
while(f<=ep2)
{
if(names[f].compareTo(names[e])<0)
{
g=names[e];
names[e]=names[f];
names[f]=g;
}
f++;
}
e++;
}
for(int i=0;i<names.length;i++)System.out.println(names[i]);
}
};