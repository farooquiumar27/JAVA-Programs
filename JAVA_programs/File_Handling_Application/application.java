import java.lang.*;
import java.io.*;

class MemberManager
{
private static final String DATA_FILE="member.data";
public static void main(String gg[ ])
{
String operation=gg[0];
if(!isOperationValid(operation))
{
System.out.println("Invalid operation found");
System.out.println("Valid operation are [add,update,remove,getByContactNumber,getAll,getByCourse]");
return ;
}
if(operation.equalsIgnoreCase("add"))
{
add(gg);
}else
if(operation.equalsIgnoreCase("update"))
{
update(gg);
}else
if(operation.equalsIgnoreCase("remove"))
{
remove(gg);
}else
if(operation.equalsIgnoreCase("getAll"))
{
getAll(gg);
}else
if(operation.equalsIgnoreCase("getByContactNumber"))
{
getByContactNumber(gg);
}else
if(operation.equalsIgnoreCase("getByCourse"))
{
getByCourse(gg);
}

} //main function ends here

//operation funcions
private static void update(String [ ] data)
{
if(data.length<5)
{
System.out.println("Inputs missing");
return ;
}
String mobileNumber=data[1];
String name=data[2];
String course=data[3];
int fee=0;
if(!isCourseValid(course))
{
System.out.println("Invalid course found");
System.out.println("Valid courses are [C,C++,Java,J2ee,Python]");
return ;
}
try
{
fee=Integer.parseInt(data[4]);
}catch(NumberFormatException nfe)
{
System.out.println("Fee should be an int type");
return ;
}
try
{
File f=new File(DATA_FILE);
if(f.exists()==false)
{
System.out.println("Invalid mobile number : "+mobileNumber);
return ;
}
RandomAccessFile randomAccessFile;
randomAccessFile=new RandomAccessFile(f,"rw");
if(randomAccessFile.length( )==0)
{
System.out.println("Invalid contact number : "+mobileNumber);
return;
}
boolean found=false;
while(randomAccessFile.getFilePointer( )<randomAccessFile.length( ))
{
if(mobileNumber.equalsIgnoreCase(randomAccessFile.readLine( )))
{
found=true;
break;
}
randomAccessFile.readLine( );
randomAccessFile.readLine( );
randomAccessFile.readLine( );
}
if(found==false)
{
System.out.println("No such member exists with contact number : "+mobileNumber);
randomAccessFile.close( );
return;
}
System.out.println("Updating member for contact number : "+mobileNumber);
randomAccessFile.seek(0);
File tempFile=new File("temp.data");
RandomAccessFile tempRandomAccessFile;
tempRandomAccessFile=new RandomAccessFile(tempFile,"rw");
tempRandomAccessFile.setLength(0);
String fmob;
String fname;
String fcourse;
String fFee;
while(randomAccessFile.getFilePointer( )<randomAccessFile.length( ))
{
fmob=randomAccessFile.readLine( );
fname=randomAccessFile.readLine( );
fcourse=randomAccessFile.readLine( );
fFee=randomAccessFile.readLine( );
if(fmob.equalsIgnoreCase(mobileNumber)==false)
{
tempRandomAccessFile.writeBytes(fmob+"\n");
tempRandomAccessFile.writeBytes(fname+"\n");
tempRandomAccessFile.writeBytes(fcourse+"\n");
tempRandomAccessFile.writeBytes(fFee+"\n");
}
else
{
tempRandomAccessFile.writeBytes(mobileNumber+"\n");
tempRandomAccessFile.writeBytes(name+"\n");
tempRandomAccessFile.writeBytes(course+"\n");
tempRandomAccessFile.writeBytes(fee+"\n");
}
}
randomAccessFile.seek(0);
tempRandomAccessFile.seek(0);
while(tempRandomAccessFile.getFilePointer( )<tempRandomAccessFile.length( ))
{
fmob=tempRandomAccessFile.readLine( );
fname=tempRandomAccessFile.readLine( );
fcourse=tempRandomAccessFile.readLine( );
fFee=tempRandomAccessFile.readLine( );
randomAccessFile.writeBytes(fmob+"\n");
randomAccessFile.writeBytes(fname+"\n");
randomAccessFile.writeBytes(fcourse+"\n");
randomAccessFile.writeBytes(fFee+"\n");
}
randomAccessFile.setLength(tempRandomAccessFile.length( ));
tempRandomAccessFile.setLength(0);
randomAccessFile.close( );
tempRandomAccessFile.close( );
System.out.println("Member updated");
return;
}catch(IOException ioException)
{
System.out.println(ioException.getMessage( ));
return;
}
}
private static void add(String [ ] data)
{
if(data.length<5)
{
System.out.println("Inputs missing");
return ;
}
String mobileNumber=data[1];
String name=data[2];
String course=data[3];
int fee;
if(!isCourseValid(course))
{
System.out.println("Invalid course found");
System.out.println("Valid courses are [C,C++,Java,J2ee,Python]");
return ;
}
try
{
fee=Integer.parseInt(data[4]);
}catch(NumberFormatException nfe)
{
System.out.println("Fee should be an int type");
return ;
}
try
{
File f=new File(DATA_FILE);
RandomAccessFile randomAccessFile;
randomAccessFile=new RandomAccessFile(f,"rw");
String mob;
while(randomAccessFile.getFilePointer( )<randomAccessFile.length( ))
{
mob=randomAccessFile.readLine( );
if(mob.equalsIgnoreCase(mobileNumber))
{
randomAccessFile.close( );
System.out.println(mobileNumber+" exists");
return;
}
randomAccessFile.readLine( );
randomAccessFile.readLine( );
randomAccessFile.readLine( );
}
randomAccessFile.writeBytes(mobileNumber);
randomAccessFile.writeBytes("\n");
randomAccessFile.writeBytes(name);
randomAccessFile.writeBytes("\n");
randomAccessFile.writeBytes(course);
randomAccessFile.writeBytes("\n");
randomAccessFile.writeBytes(String.valueOf(fee));
randomAccessFile.writeBytes("\n");
randomAccessFile.close( );
System.out.println("Member added");
}catch(IOException ioException)
{
System.out.println(ioException.getMessage( ));
return;
}
}
private static void remove(String [ ] data)
{
if(data.length!=2)
{
System.out.println("Inputs missing");
return ;
}
String mobileNumber=data[1];
try
{
File f=new File(DATA_FILE);
if(f.exists()==false)
{
System.out.println("Invalid mobile number : "+mobileNumber);
return ;
}
RandomAccessFile randomAccessFile;
randomAccessFile=new RandomAccessFile(f,"rw");
if(randomAccessFile.length( )==0)
{
System.out.println("Invalid contact number : "+mobileNumber);
return;
}
boolean found=false;
while(randomAccessFile.getFilePointer( )<randomAccessFile.length( ))
{
if(mobileNumber.equalsIgnoreCase(randomAccessFile.readLine( )))
{
found=true;
break;
}
randomAccessFile.readLine( );
randomAccessFile.readLine( );
randomAccessFile.readLine( );
}
if(found==false)
{
System.out.println("No such member exists with contact number : "+mobileNumber);
randomAccessFile.close( );
return;
}
System.out.println("Deleteing member for contact number : "+mobileNumber);
randomAccessFile.seek(0);
File tempFile=new File("temp.data");
RandomAccessFile tempRandomAccessFile;
tempRandomAccessFile=new RandomAccessFile(tempFile,"rw");
tempRandomAccessFile.setLength(0);
String fmob;
String fname;
String fcourse;
String fFee;
while(randomAccessFile.getFilePointer( )<randomAccessFile.length( ))
{
fmob=randomAccessFile.readLine( );
fname=randomAccessFile.readLine( );
fcourse=randomAccessFile.readLine( );
fFee=randomAccessFile.readLine( );
if(fmob.equalsIgnoreCase(mobileNumber)==false)
{
tempRandomAccessFile.writeBytes(fmob+"\n");
tempRandomAccessFile.writeBytes(fname+"\n");
tempRandomAccessFile.writeBytes(fcourse+"\n");
tempRandomAccessFile.writeBytes(fFee+"\n");
}
}
randomAccessFile.seek(0);
tempRandomAccessFile.seek(0);
while(tempRandomAccessFile.getFilePointer( )<tempRandomAccessFile.length( ))
{
fmob=tempRandomAccessFile.readLine( );
fname=tempRandomAccessFile.readLine( );
fcourse=tempRandomAccessFile.readLine( );
fFee=tempRandomAccessFile.readLine( );
randomAccessFile.writeBytes(fmob+"\n");
randomAccessFile.writeBytes(fname+"\n");
randomAccessFile.writeBytes(fcourse+"\n");
randomAccessFile.writeBytes(fFee+"\n");
}
randomAccessFile.setLength(tempRandomAccessFile.length( ));
tempRandomAccessFile.setLength(0);
randomAccessFile.close( );
tempRandomAccessFile.close( );
System.out.println("Member deleted");
return;
}catch(IOException ioException)
{
System.out.println(ioException.getMessage( ));
return;
}
}
private static void getAll(String [ ] data)
{
if(data.length>1)System.out.println("You don't have to provide any extra argument rather than getAll");
try
{
File f=new File(DATA_FILE);
RandomAccessFile randomAccessFile=new RandomAccessFile(f,"rw");
while(randomAccessFile.getFilePointer( )<randomAccessFile.length( ))
{
System.out.print(randomAccessFile.readLine( )+" ");
System.out.print(randomAccessFile.readLine( )+" ");
System.out.print(randomAccessFile.readLine( )+" ");
System.out.println(randomAccessFile.readLine( ));
}
randomAccessFile.close( );
}catch(IOException ioException)
{
System.out.println(ioException.getMessage( ));
return;
}
}
private static void getByContactNumber(String [ ] data)
{
if(data.length>2)System.out.println("You don't have to provide any extra argument rather than getByContactNumber and Contact number");
if(data.length<2)
{
System.out.println("Contact number required");
return;
}
String contactNumber=data[1];
String con;
try
{
File f=new File(DATA_FILE);
RandomAccessFile randomAccessFile=new RandomAccessFile(f,"rw");
int found=0;
while(randomAccessFile.getFilePointer( )<randomAccessFile.length( ))
{
con=randomAccessFile.readLine( );
if(con.equalsIgnoreCase(contactNumber))
{
found=1;
System.out.print(contactNumber+" ");
System.out.print(randomAccessFile.readLine( )+" ");
System.out.print(randomAccessFile.readLine( )+" ");
System.out.println(Integer.parseInt(randomAccessFile.readLine( )));
break;
}
}
if(found==0)System.out.println("No member exists with contact number : "+contactNumber);
randomAccessFile.close( );
}catch(IOException ioException)
{
System.out.println(ioException.getMessage( ));
return;
}
}
private static void getByCourse(String [ ] data)
{
if(data.length>2)System.out.println("You don't have to provide any extra argument rather than getByCourse and Course");
if(data.length<2)
{
System.out.println("Course required");
return;
}
String contactNumber;
String name;
String course;
String cos=data[1];
String fee;
try
{
File f=new File(DATA_FILE);
RandomAccessFile randomAccessFile=new RandomAccessFile(f,"rw");
int found=0;
while(randomAccessFile.getFilePointer( )<randomAccessFile.length( ))
{
contactNumber=randomAccessFile.readLine( );
name=randomAccessFile.readLine( );
course=randomAccessFile.readLine( );
fee=randomAccessFile.readLine( );
if(cos.equalsIgnoreCase(course))
{
found=1;
System.out.print(contactNumber+" ");
System.out.print(name+" ");
System.out.print(cos+" ");
System.out.println(fee);
}
}
if(found==0)System.out.println("No member exists with course : "+cos);
randomAccessFile.close( );
}catch(IOException ioException)
{
System.out.println(ioException.getMessage( ));
return;
}
}

//helper function
private static boolean isOperationValid(String operation)
{
operation=operation.trim( );
String [ ] operations={"add","update","remove","getByContactNumber","getByCourse","getAll"};
for(int e=0;e<operations.length;e++)
{
if(operations[e].equalsIgnoreCase(operation))return true;
}
return false;
}

private  static boolean isCourseValid(String course)
{
course=course.trim( );
String [ ] courses={"C","C++","JAVA","J2EE","Python"};
for(int e=0;e<courses.length;e++)
{
if(courses[e].equalsIgnoreCase(course))return true;
}
return false;
}

};